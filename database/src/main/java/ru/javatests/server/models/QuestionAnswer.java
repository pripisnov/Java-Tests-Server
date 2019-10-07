package ru.javatests.server.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "question_answer")
public class QuestionAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "is_right", nullable = false, columnDefinition = "boolean default false")
    private boolean isRight;

    @OneToMany(mappedBy = "user_answer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserAnswer> userAnswerList;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private Question question;

    public QuestionAnswer() {
    }

    public QuestionAnswer(String name, boolean isRight) {
        this.name = name;
        this.isRight = isRight;
        this.userAnswerList = new ArrayList<UserAnswer>();
    }

    public void addUserAnswer(UserAnswer userAnswer) {
        userAnswer.setQuestionAnswer(this);
        userAnswerList.add(userAnswer);
    }

    public void remoteUserAnswer(UserAnswer userAnswer) {
        userAnswerList.remove(userAnswer);
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
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

    public boolean isRight() {
        return isRight;
    }

    public void setRight(boolean right) {
        isRight = right;
    }

    public List<UserAnswer> getUserAnswerList() {
        return userAnswerList;
    }

    public void setUserAnswerList(List<UserAnswer> userAnswerList) {
        this.userAnswerList = userAnswerList;
    }
}
