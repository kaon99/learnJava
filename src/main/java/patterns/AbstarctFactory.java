package patterns;

import java.util.regex.Pattern;

public class AbstarctFactory {
    public static void main(String[] args) {
CarsAbstractFactory factory = CarsFactory("Toyota");
Car car = factory.getCar();
Parts parts = factory.getParts();
car.makeNewCar();
car.sellCar();
parts.mateNewParts();
parts.sellParts();

    }

    private static CarsAbstractFactory CarsFactory(String company) {
        if (company.equals("Mersedes")) {
            return new MersedesFactory();
        }
        if (company.equals("Toyota")) {
            return new ToyotaFactory();
        } else {
            throw new RuntimeException(" This Factory is not supported " + company);
        }

    }
}


interface CarsAbstractFactory {
    Car getCar();

    Parts getParts();

}

interface Car {
    void makeNewCar();

    void sellCar();
}

interface Parts {
    void mateNewParts();

    void sellParts();
}


class MersedesFactory implements CarsAbstractFactory {

    @Override
    public Car getCar() {
        return new MersedesCars();
    }

    @Override
    public Parts getParts() {
        return new MersedesParts();
    }
}

class ToyotaFactory implements CarsAbstractFactory {

    @Override
    public Car getCar() {
        return new ToyotaCar();
    }

    @Override
    public Parts getParts() {
        return new ToyotaParts();
    }


}

class ToyotaCar implements Car {

    @Override
    public void makeNewCar() {
        System.out.println("Сделали новую Тойоту");
    }

    @Override
    public void sellCar() {
        System.out.println("Продали новую Тойоту");
    }
}

class ToyotaParts implements Parts {
    @Override
    public void mateNewParts() {
        System.out.println("Сделали новые запчасти на Тойоту");
    }

    @Override
    public void sellParts() {
        System.out.println("Продали новые запчасти на Тойоту");
    }
}

class MersedesCars implements Car {
    @Override
    public void makeNewCar() {
        System.out.println("Сделали новый Мерседес");
    }

    @Override
    public void sellCar() {
        System.out.println("Продали новый Мерседей");
    }
}

class MersedesParts implements Parts {

    @Override
    public void mateNewParts() {
        System.out.println("Сделали новые запчасти на Мерседес");
    }

    @Override
    public void sellParts() {
        System.out.println("Продали новые запчасти на Мерседес");
    }
}
