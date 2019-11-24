package me.chanchangxing.exam;

import java.util.List;

public class User {

    /**
     * name : user
     * gender : male
     */

    private String name;
    private String gender;
    private List<String> habits;
    private Ill ill;

    public User(String name, String gender, List<String> habits, Ill ill) {
        this.name = name;
        this.gender = gender;
        this.habits = habits;
        this.ill = ill;
    }
}
 class Ill {
    private String illName;
    private String result;
}

