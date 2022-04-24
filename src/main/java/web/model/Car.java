package web.model;

public class Car {
    String model;
    String color;
    int version;

    public Car(String model, String color, int version) {
        this.model = model;
        this.color = color;
        this.version = version;
    }

    public String getModel() {
        return model;
    }



    public String getColor() {
        return color;
    }


    public int getVersion() {
        return version;
    }

}
