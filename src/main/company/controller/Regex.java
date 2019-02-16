package main.company.controller;

public interface Regex {

    String nameRegex = "[/^[А-ЯІЇЄ´][а-яїієґ]+$/]";
    String surnameRegex = "[/^[А-ЯІЇЄ´][а-яїієґ]+$/]";
    String email = "/\\A[^@]+@([^@\\.]+\\.)+[^@\\.]+\\z/";


}
