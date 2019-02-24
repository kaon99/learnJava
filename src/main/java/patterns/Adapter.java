package patterns;

public class Adapter {
    public static void main(String[] args) {
        HDMI station =  new HDMIToTypeCAppdater ();
        station.HDMIConnection();
    }
}


interface HDMI {
    void HDMIConnection();
}


class TypeC {
    public void typeCConnection() {
        System.out.println("Устройство подлючено через Type C");
    }

}


class HDMIToTypeCAppdater extends TypeC implements HDMI {
    public void HDMIConnection (){
        typeCConnection();
    }


}