package ru.javatests.server.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
//    @OneToMany(mappedBy = "category")
    private List<Question> questionList;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
        this.questionList = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        question.setCategory(this);
        questionList.add(question);
    }

    public void removeQuestion(Question question) {
        this.questionList.remove(question);
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Question> getQuestionList() {
        return this.questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }
}
