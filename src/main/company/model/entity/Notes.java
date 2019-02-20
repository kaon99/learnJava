package main.company.model.entity;



public class Notes {
    private String name;
    private String surName;

    private String email;

    public Notes(String name, String surName, String email) {
        this.name = name;
        this.surName = surName;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Notes{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
