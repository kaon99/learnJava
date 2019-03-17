package patterns;

public class BuilderExpample {
    public static void main(String[] args) {


    Director director = new Director();
    ShipBuilder expensiveShip = new ExpencipeShipBuilder();
director.setShipBuilder(expensiveShip);
director.constructShip();

//Ship ship = director.getShipBuilder();

}
}

class  Director {
    private ShipBuilder shipBuilder ;

    public ShipBuilder getShipBuilder() {
        return shipBuilder;
    }

    public void setShipBuilder(ShipBuilder shipBuilder) {
        this.shipBuilder = shipBuilder;
    }

    public void constructShip (){
        shipBuilder.createNewComputer();
        shipBuilder.buildEngine();
        shipBuilder.buildTransmission();

    }
}


class Ship  {
    private String engine  = null;
    private String trinsmission  = null;

    public void setEngine (String engine){
        this.engine = engine;
    }

    public void setTrinsmission(String trinsmission) {
        this.trinsmission = trinsmission;
    }
}

abstract class ShipBuilder {
    protected Ship ship;

    public Ship getShip() {
        return ship;
    }
    public void createNewComputer () {
        ship = new Ship();
    }

    public abstract void buildEngine ();
    public abstract void buildTransmission ();
}

class ExpencipeShipBuilder extends  ShipBuilder {
    @Override
    public void buildEngine() {
        ship.setEngine("Yamaha");
    }

    @Override
    public void buildTransmission() {
ship.setTrinsmission("Automatic");
    }



}

