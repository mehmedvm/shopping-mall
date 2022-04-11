package mall.toys_r_us;

public class Magnatile extends Toy{
    //Fields
    String ageRange;
    String color;
    int noOfPiesces;

    //Constructors
    public Magnatile() {
    }

    public Magnatile(String ageRange, String color, int noOfPiesces) {
        this.ageRange = ageRange;
        this.color = color;
        this.noOfPiesces = noOfPiesces;
    }

    public Magnatile(String name, String brand, String model, int price, String ageRange, String color, int noOfPiesces) {
        super(name, brand, model, price);
        this.ageRange = ageRange;
        this.color = color;
        this.noOfPiesces = noOfPiesces;
    }

    // Getters and Setters
    public String getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(String ageRange) {
        this.ageRange = ageRange;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNoOfPiesces() {
        return noOfPiesces;
    }

    public void setNoOfPiesces(int noOfPiesces) {
        this.noOfPiesces = noOfPiesces;
    }

    //To String
    @Override
    public String toString() {
        return "Magntile{" +
                "ageRange='" + ageRange + '\'' +
                ", color='" + color + '\'' +
                ", noOfPiesces=" + noOfPiesces +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }


}
