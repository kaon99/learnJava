package main.company.controller;


import main.company.model.entity.Notes;
import main.company.view.View;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator implements Regex {
    private Boolean infoWright = false;

    Scanner sc = new Scanner(System.in);
    View view = new View();
    Pattern namePattern = Pattern.compile(nameRegex);
    Pattern surnamePattern = Pattern.compile(surnameRegex);
    Pattern emailPattern = Pattern.compile(email);

    public void run() {

        String name;
        String surname;
        String email;
        view.printMassage(View.NAMEINPUT);
        name = cheakInput(namePattern);
        view.printMassage(View.SURNAME_INPUT);
        surname = cheakInput(surnamePattern);
        view.printMassage(View.EMAIL);
        email = cheakInput(emailPattern);

if (cheakError(name,surname,email) == true){
  Notes  note =   createNewNote(name,surname,email);
    view.printMassage(note.toString());
}
else view.printMassage(View.ERROR_CREATE);

    }




    public String cheakInput(Pattern pattern) {

        String inputInfo = scanInput();

        Matcher matcher = pattern.matcher(inputInfo);
        if (!matcher.matches()) {
            return inputInfo ;
        } else return View.ERROR;
    }


    public String scanInput() {
        if (sc.hasNextLine()) {
            String input = sc.nextLine();
            return input;
        } else return View.ERROR;
    }

    public boolean  cheakError(String name, String surname, String email){
        if (!name.equals(View.ERROR) && !surname.equals(View.ERROR) && !email.equals(View.ERROR)){
            return true;
        }
else return false;
    }

    public Notes createNewNote(String name, String surname, String email){
        Notes notes = new Notes(name,surname,email);
        return notes;
    }
}