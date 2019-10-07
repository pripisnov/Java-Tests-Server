package ru.javatests.server.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @OneToMany(mappedBy = "user_test", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserTest> userTestList;

    public User() {
    }

    public User(String name) {
        this.name = name;
        this.userTestList = new ArrayList<UserTest>();
    }

    public void addUserTest(UserTest userTest) {
        userTest.setUser(this);
        userTestList.add(userTest);
    }

    public void removeUserTest(UserTest userTest) {
        userTestList.remove(userTest);
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
