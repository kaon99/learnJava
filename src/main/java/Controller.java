package main.java;

import java.util.Scanner;

public class Controller {

    private static final String firstWord = "Hello";
    private static final String secondWord = "World";
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1 слово");
        model.setFirstWord(sc.nextLine());
        System.out.println("Введите 2 слово");
        model.setSecondWord(sc.nextLine());

        cheakWord();
    }

    private void cheakWord() {
        if (model.getFirstWord().equals(firstWord) && model.getSecondWord().equals(secondWord)) {
            view.printMassage(model.getFirstWord() +" "+ model.getSecondWord()+ "!");
        }
        else {
            view.printMassage(View.WRONG_INPUT_DATA);

        }
    }
}
