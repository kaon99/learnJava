package main.gameBigAndSmall;

import java.util.Scanner;

public class Controller {
    private final static int MINIMAL = 0;
    private final static int MAXIMUM = 100;
    private final Scanner scanner = new Scanner(System.in);
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }


    public void run() {
        setWinnerNumber(random());
        startGame();
    }

    private void setWinnerNumber(int number) {
        model.setSelectNumber(number);
    }

    public void startGame() {
        view.print(View.START_GAME);


        while (!game()) {
            game();
        }

    }

    private boolean game() {

        model.setChooseNumber(scanner.nextInt());

        if (model.getChooseNumber() < model.getSelectNumber()) {
            view.print(View.TOO_SMALL_NUMBER);
            return false;
        }
        if (model.getChooseNumber() > model.getSelectNumber()) {
            view.print(View.TOO_BIG_NUMBER);
            return false;
        }
        if (model.getChooseNumber() == model.getSelectNumber()) {
            view.print(View.WIN_GAME);
            return true;
        }
        return false;
    }


//        if (min != 0 || max != 0) {
//            setWinnerNumber(random(min, max));
//        } else {
//            setWinnerNumber(random());
//        }


    public int random() {
        int number = MINIMAL + (int) (Math.random() * MAXIMUM + 1);
        return number;
    }


}
