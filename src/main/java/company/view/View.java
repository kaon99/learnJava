package company.view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {

public static final String NAMEINPUT ="Введите Ваше имя на украинском языке";
public static final String SURNAME_INPUT ="Введите Вашу фамилию на украинском языке";
public static final String EMAIL = "Введите ваш Емейл";
public static final String ERROR = "Error";
public static final String ERROR_CREATE = " Вы ввели некоректные данные. Объект не создан";

ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", new Locale("en"));
ResourceBundle resourceBundleUa = ResourceBundle.getBundle("messages", new Locale("en"));

    public  void printMassage (String string){
        System.out.println(string);

    }


}
