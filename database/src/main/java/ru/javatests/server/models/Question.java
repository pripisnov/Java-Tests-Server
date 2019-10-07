package ru.javatests.server.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "source_code")
    private String sourceCode;

    @OneToMany(mappedBy = "question_answer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<QuestionAnswer> questionAnswerList;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id")
    private QuestionType questionType;

    public Question() {
    }

    public Question(String name, String sourceCode) {
        this.name = name;
        this.sourceCode = sourceCode;
        this.questionAnswerList = new ArrayList<QuestionAnswer>();
    }

    public void addQuestionAnswer(QuestionAnswer questionAnswer) {
        questionAnswer.setQuestion(this);
        questionAnswerList.add(questionAnswer);
    }

    public void removeQuestionAnswer(QuestionAnswer questionAnswer) {
        questionAnswerList.remove(questionAnswer);
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public List<QuestionAnswer> getQuestionAnswerList() {
        return questionAnswerList;
    }

    public void setQuestionAnswerList(List<QuestionAnswer> questionAnswerList) {
        this.questionAnswerList = questionAnswerList;
    }
}
