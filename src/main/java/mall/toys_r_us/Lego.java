package mall.toys_r_us;

public class Lego extends Toy{
    //Fields
    String ageRange;
    int noOfPiesces;

    //Constructors
    public Lego() {
    }

    public Lego(String ageRange, int noOfPiesces) {
        this.ageRange = ageRange;
        this.noOfPiesces = noOfPiesces;
    }

    public Lego(String name, String brand, String model, int price, String ageRange, int noOfPiesces) {
        super(name, brand, model, price);
        this.ageRange = ageRange;
        this.noOfPiesces = noOfPiesces;
    }

    //Getters and Setters
    public String getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(String ageRange) {
        this.ageRange = ageRange;
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
        return "Lego{" +
                "ageRange='" + ageRange + '\'' +
                ", noOfPiesces=" + noOfPiesces +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }


}
