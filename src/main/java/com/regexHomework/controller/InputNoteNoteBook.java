package com.regexHomework.controller;

import com.regexHomework.view.TextConstant;
import com.regexHomework.view.View;


import java.util.Scanner;

/**
 * Created by student on 26.09.2017.
 */
public class InputNoteNoteBook {
    private View view;
    private Scanner sc;

    private String firstName;
    private String login;

    public InputNoteNoteBook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public String getLogin() {
        return login;
    }

    public String getFirstName() {
        return firstName;
    }

    public void inputNote() {
        UtilityController utilityController =
                new UtilityController(sc, view);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? RegexContainer.REGEX_NAME_UKR : RegexContainer.REGEX_NAME_LAT;

        this.firstName =
                utilityController.inputStringValueWithScanner
                        (TextConstant.FIRST_NAME, str);
        this.login =
                utilityController.inputStringValueWithScanner
                        (TextConstant.LOGIN_DATA, RegexContainer.REGEX_LOGIN);
    }

    @Override
    public String toString() {
        return "InputNoteNoteBook{" +
                "view=" + view +
                ", sc=" + sc +
                ", firstName='" + firstName + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
