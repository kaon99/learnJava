package main.gameBigAndSmall;


import org.junit.Assert;
import org.junit.Test;



public class ControllerTest  extends Assert{
    Model model = new Model();
    View view = new View();
Controller controller = new Controller(model,view);
    @Test
    public void random() {

        for (int i = 0; i < 10000; i++) {
            int number = 99 ;
            if (number == 0) {
                assertEquals(0, number);
            }
//number--;
        }
    }
}
