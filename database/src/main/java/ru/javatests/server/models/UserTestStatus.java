package ru.javatests.server.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user_test_status")
public class UserTestStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "userTestStatus", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserTest> userTestList;

    public UserTestStatus() {
    }

    public UserTestStatus(String name) {
        this.name = name;
        this.userTestList = new ArrayList<UserTest>();
    }

    public void addUserTest(UserTest userTest) {
        userTest.setUserTestStatus(this);
        userTestList.add(userTest);
    }

    public void removeUserTest(UserTest userTest) {
        userTestList.remove(userTest);
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

    public List<UserTest> getUserTestList() {
        return userTestList;
    }

    public void setUserTestList(List<UserTest> userTestList) {
        this.userTestList = userTestList;
    }
}
