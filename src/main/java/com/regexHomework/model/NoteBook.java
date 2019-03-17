package com.regexHomework.model;

import com.regexHomework.controller.InputNoteNoteBook;
import com.regexHomework.exception.UniqueLoginException;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {

    private List<InputNoteNoteBook> notebooksList = new ArrayList();

    public NoteBook() {
    }

    public List getNotebooksList() {
        return notebooksList;
    }

    public void addToNotebookList(InputNoteNoteBook inputNoteNoteBook){
        boolean cheak = false ;

       for (InputNoteNoteBook i : notebooksList){
           if (i.getLogin().equals(inputNoteNoteBook.getLogin())){
               cheak =true;
           }
       }

       if (cheak == true){
           try {
               throw new UniqueLoginException("This login is already exist! ");
           } catch (UniqueLoginException e) {
               e.printStackTrace();
           }
       }

    }


    public String showAllUsers () {
        StringBuilder sb =new StringBuilder();
        for (InputNoteNoteBook inputNoteNoteBook : notebooksList){
           sb.append(inputNoteNoteBook.getLogin() + " ");
        }
        return sb.toString();
    }
}
