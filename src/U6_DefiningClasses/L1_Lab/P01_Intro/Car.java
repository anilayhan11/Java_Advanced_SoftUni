package U6_DefiningClasses.L1_Lab.P01_Intro;

public class Car {
    //Fields
    private String brand;
    private String model;
    private int horsePower;


    //Methods
    //Getters
    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    //Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    //Built-in methods -> toString, equals, hashCode

    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.",
                this.getBrand(), this.getModel(), this.getHorsePower());
    }
}
