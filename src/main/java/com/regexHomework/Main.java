package com.regexHomework;

import com.regexHomework.controller.Controller;
import com.regexHomework.model.Model;
import com.regexHomework.model.NoteBook;
import com.regexHomework.view.View;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Controller controller =
                new Controller(new Model(), new View(), new NoteBook());
        // Run
        controller.processUser();
    }
}
