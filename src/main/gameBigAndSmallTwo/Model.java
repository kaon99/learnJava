package main.gameBigAndSmallTwo;

import java.util.ArrayList;

public class Model {

    private int WinnerNumber;
    private int chooseNumber;
    private final static int MINIMAL = 0;
    private final static int MAXIMUM = 100;
    private int minRange;
    private int maxRange;

    public  ArrayList<Integer> listNumberUsed = new ArrayList<Integer>();

    public int getWinnerNumber() {
        return WinnerNumber;
    }

    public void setWinnerNumber(int winnerNumber) {
        WinnerNumber = winnerNumber;
    }

    public int getChooseNumber() {
        return chooseNumber;
    }

    public void setChooseNumber(int chooseNumber) {
        this.chooseNumber = chooseNumber;
    }

    public int getMinRange() {
        return minRange;
    }

    public void setMinRange(int minRange) {
        this.minRange = minRange;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }


//    public void setMaxAndMinRangeBeforeStart() {
//        setMinRange(MINIMAL);
//        setMaxRange(MAXIMUM);
//    }

    public int setRandomWinnerNumber() {
        //setMaxAndMinRangeBeforeStart();
        int number = getMinRange() + (int) (Math.random() * getMaxRange() );
       return number;
               //setWinnerNumber(number);
    }

    public int game() {
        if ( getChooseNumber() > getMinRange() | getChooseNumber() < getMaxRange() ) {
            if (getChooseNumber() > getWinnerNumber()) {
                setMaxRange(getChooseNumber());
                return 1;
            }
            if (getChooseNumber() < getWinnerNumber()) {
                setMinRange(getChooseNumber());
                return -1;
            }
            if (getChooseNumber() == getWinnerNumber()) {
                return 0;
            }
        }
         return 4;

    }


}
