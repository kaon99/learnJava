package main.gameBigAndSmallTwo;


import java.util.Scanner;

public class Controller {
    private final Scanner sc = new Scanner(System.in);
    private Model model;
    private View view;
    private Boolean gameIsOver = false;


    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }


    public void run() {
        view.print(View.START_GAME);
        model.setRandomWinnerNumber();

        while (gameIsOver == false) {
            readUserNumber();
        }


    }

    public void startGame() {


        if (model.game() == +1) {
            view.print(View.TOO_BIG_NUMBER);

        }
        if (model.game() == -1) {

            view.print(View.TOO_SMALL_NUMBER);

        }
        if (model.game() == 0) {
            view.print(View.WIN_GAME);
            gameIsOver = true;
              view.print(model.listNumberUsed.toString());
        }
//        if (model.game() == 4) {
//           view.print("Work");
//        }
        showRange();
    }

    public void readUserNumber() {

        if (sc.hasNextInt()) {
            model.setChooseNumber(sc.nextInt());
            model.listNumberUsed.add(model.getChooseNumber());
            startGame();
        } else {
            view.print(View.WRONG_NUMBER);
            sc.nextLine();

        }

    }

    public void showRange() {

        System.out.println("Минимальный диапазон [" + model.getMinRange() + "] " + "Максимальный диапазон [" + model.getMaxRange() + "]");
    }

}