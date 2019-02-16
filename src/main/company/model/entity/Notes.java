package main.company.model.entity;



public class Notes {
    private String surName;
    private String name;
    private String email;

    public Notes(String surName, String name, String email) {
        this.surName = surName;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Notes{" +
                "surName='" + surName + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
