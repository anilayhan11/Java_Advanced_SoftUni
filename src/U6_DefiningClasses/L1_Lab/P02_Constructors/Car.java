package U6_DefiningClasses.L1_Lab.P02_Constructors;

public class Car {
    //Fields
    private String brand;
    private String model;
    private int horsePower;

    //Methods
    //Constructors

    //Default constructor - built-in
    public Car() {
        //empty object
        //brand = null
        //model = null
        //horsePower = 0
    }

    //Constructor with parameters
    public Car(String brand, String model, int hp) {
        //new empty object
        //brand = null
        //model = null
        //horsePower = 0
        this(brand);
        this.setModel(model);
        this.setHorsePower(hp);
    }

    public Car(String brand) {
        //empty object
        //brand = null
        //model = null
        //horsePower = 0
        this.setBrand(brand);
        this.setModel("unknown");
        this.setHorsePower(-1);
    }


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
