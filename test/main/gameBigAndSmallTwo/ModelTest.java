package main.gameBigAndSmallTwo;

import gameBigAndSmallTwo.Model;
import org.junit.Test;

import static org.junit.Assert.*;

public class ModelTest {

    Model model = new Model();
    @Test
    public void setRandomWinnerNumber() {
      boolean fff = false;
        for (int i = 0; i < 1000000; i++){
            if (model.setRandomWinnerNumber()== 0 ){
                fff = true;

            }        }
        assertTrue(fff);
    }



}