package patterns;

public class Delegation {

    public static void main(String[] args) {
        Client client = new Client();
        client.setTransmission(new Drive());
        client.go();

        client.setTransmission(new Reverse());
        client.go();

        client.setTransmission(new Parking());
        client.go();

    }
}

interface Transmission {
    void go();
}

class Drive implements Transmission {
    @Override
    public void go() {
        System.out.println("Едем вперед");
    }
}

class Reverse implements Transmission {
    @Override
    public void go() {
        System.out.println("Едем назад");
    }
}

class Parking implements Transmission {
    @Override
    public void go() {
        System.out.println("Никуда не едем ");
    }
}

class Client {
    private Transmission transmission;

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void go() {
        transmission.go();
    }


}


