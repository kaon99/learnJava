package com.regexHomework.controller;


import com.regexHomework.model.Model;
import com.regexHomework.model.NoteBook;
import com.regexHomework.view.View;

import java.util.Scanner;

/**
 * Created by student on 26.09.2017.
 */
public class Controller {
    private Model model;
    private View view;
    private NoteBook noteBook;

    public Controller(Model model, View view, NoteBook noteBook) {
        this.model = model;
        this.view = view;
        this.noteBook = noteBook;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputNoteNoteBook inputNoteNoteBook =
                new InputNoteNoteBook(view, sc);
        inputNoteNoteBook.inputNote();
        noteBook.addToNotebookList(inputNoteNoteBook);
        System.out.println(  noteBook.showAllUsers());


    }
}
