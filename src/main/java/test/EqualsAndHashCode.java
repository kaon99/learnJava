package test;


import java.util.Objects;

public class EqualsAndHashCode {
    public static void main(String[] args) {
        String Str = new String("Добро пожаловать на ProgLang.suf");
        System.out.println("Хэш-код для Str: " + Str.hashCode());

        Car car1 = new Car("Ferrary", "Ferr", 1);
        Car car2 = new Car("Ferrary", "Ferr", 1);


        System.out.println(car1.equals(car2));
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car1.hashCode() + " " + car2.hashCode());
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::;");

        car2.setModel(12);

        System.out.println(car1.equals(car2));
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car1.hashCode() + " " + car2.hashCode());


    }
}

class Car {
    public String name;
    public String mark;
    public Integer model;

    public void setModel(Integer model) {
        this.model = model;
    }


    public Car(String name, String mark, Integer model) {
        this.name = name;
        this.mark = mark;
        this.model = model;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Car car = (Car) o;
//        return Objects.equals(name, car.name) &&
//                Objects.equals(mark, car.mark) &&
//                Objects.equals(model, car.model);
//    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return (name == car.name && mark == car.mark && model == model);

    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;

        result = PRIME * result + name.hashCode() + model.hashCode() + mark.hashCode();
        return result;

    }


}

