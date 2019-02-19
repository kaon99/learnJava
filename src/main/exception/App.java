package main.exception;

public class App {

    public static void main(String[] args) {
       // errOrOut();
area(20,20);
//a();
//aa();
//cheakCatch();
finallySectionCanNotFix();

    }

    public void keywords() {
        try {


        } catch (Throwable e) {

        }
        throw new Error();

    }

    public void createError() {
        Error error = new Error();
        throw error;
    }

    public static void f(NullPointerException e) {
        try {
            throw e;
        } catch (NullPointerException npe) {
            f(npe);
        }
    }

    public static void errOrOut() {
        System.out.println("sout");
        throw  new Error();

    }
    public static int area(int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Negative sizes: w = " + width + ", h = " + height);
        }
        return width * height;
    }
    public static void a () {
        System.err.println("#1.in");
        f(); // создаем фрейм, помещаем в стек, передаем в него управление
        System.err.println("#1.out"); // вернулись
    } // выходим из текущего фрейма, кончились инструкции

    public static void f() {
        System.err.println(".   #2.in");
        g(); // создаем фрейм, помещаем в стек, передаем в него управление
        System.err.println(".   #2.out");  //вернулись
    } // выходим из текущего фрейма, кончились инструкции

    public static void g() {
        System.err.println(".   .   #3.in");
        h(); // создаем фрейм, помещаем в стек, передаем в него управление
        System.err.println(".   .   #3.out"); // вернулись
    } // выходим из текущего фрейма, кончились инструкции

    public static void h() {
        System.err.println(".   .   .   #4.in");
        if (true) {
            System.err.println(".   .   .   #4.RETURN");
            return; // выходим из текущего фрейма по 'return'
        }
        System.err.println(".   .   .   #4.out"); // ПРОПУСКАЕМ
    }

//    /**/
public static void aa() {
    System.err.println("#1.in");
    f(); // создаем фрейм, помещаем в стек, передаем в него управление
    System.err.println("#1.out"); // вернулись и работаем
}


    public static void ff() {
        System.err.println(".   #2.in");
        try {
            gg(); // создаем фрейм, помещаем в стек, передаем в него управление
        } catch (Error e) { // "перехватили" "летящее" исключение
            System.err.println(".   #2.CATCH");  // и работаем
        }
        System.err.println(".   #2.out");  // работаем дальше
    }

    public static void gg() {
        System.err.println(".   .   #3.in");
        hh(); // создаем фрейм, помещаем в стек, передаем в него управление
        System.err.println(".   .   #3.out"); // ПРОПУСТИЛИ!
    }

    public static void hh() {
        System.err.println(".   .   .   #4.in");
        if (true) {
            System.err.println(".   .   .   #4.THROW");
            throw new Error(); // выходим со всей пачки фреймов ("раскрутка стека") по 'throw'
        }
        System.err.println(".   .   .   #4.out"); // ПРОПУСТИЛИ!
    }
    public static   void cheakCatch () {
        try {
            System.err.print(" 0");
            if (true) {throw new RuntimeException();}
            System.err.print(" 1");
        } catch (Exception e) { // catch по Exception ПЕРЕХВАТЫВАЕТ RuntimeException
            System.err.print(" 2");
        }
        System.err.println(" 3");
    }

     public static void tryThrowsSecondException (){
         try {
             System.err.print(" 0");
             if (true) {throw new RuntimeException();}
             System.err.print(" 1");
         } catch (RuntimeException e) {
             System.err.print(" 2");
             if (true) {throw e;}
         }
         System.err.println(" 3");
     }

    public static void cheakWhatCatchUse () {
        try {
            Throwable t = new Exception(); // ссылка типа Throwable указывает на объект типа Exception
            throw t;
        } catch (RuntimeException e) {
            System.err.println("catch RuntimeException");
        } catch (Exception e) {
            System.err.println("catch Exception");
        } catch (Throwable e) {
            System.err.println("catch Throwable");
        }
        System.err.println("next statement");
    }
    public static void finallySectionCanNotFix () {
        try {
            System.err.println("try");
            if (true) {throw new RuntimeException();}
        } finally {
            System.err.println("finally");
        }
        System.err.println("more");
    }
     public static void finalyWithCatchAndException () {

     }
    }





