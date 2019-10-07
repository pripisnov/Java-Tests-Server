package ru.javatests.server.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "user_test")
public class UserTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "date_start", nullable = false)
    private Date dateStart;
    @Column(name = "question_count", nullable = false)
    private int questionCount;

    @OneToMany(mappedBy = "user_answer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserAnswer> userAnswerList;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id")
    private UserTestStatus userTestStatus;

    public UserTest() {
    }

    public UserTest(int userId, Date dateStart, int questionCount) {
        this.dateStart = dateStart;
        this.questionCount = questionCount;
        this.userAnswerList = new ArrayList<UserAnswer>();
    }

    public void addUserAnswer(UserAnswer userAnswer) {
        userAnswer.setUserTest(this);
        userAnswerList.add(userAnswer);
    }

    public void removeUserAnswer(UserAnswer userAnswer) {
        userAnswerList.remove(userAnswer);
    }

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }



    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public int getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(int questionCount) {
        this.questionCount = questionCount;
    }

    public UserTestStatus getUserTestStatus() {
        return userTestStatus;
    }

    public void setUserTestStatus(UserTestStatus userTestStatus) {
        this.userTestStatus = userTestStatus;
    }

    public List<UserAnswer> getUserAnswerList() {
        return userAnswerList;
    }

    public void setUserAnswerList(List<UserAnswer> userAnswerList) {
        this.userAnswerList = userAnswerList;
    }
}
