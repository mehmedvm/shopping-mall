package mall.bestbuy;

public class SmartPhone extends ElectronicDevice {
    //Fields
    private String carrier;
    private boolean hasCover;

    //Constructor
    public SmartPhone() {
    }

    public SmartPhone(String carrier, boolean hasCover) {
        this.carrier = carrier;
        this.hasCover = hasCover;
    }

    public SmartPhone(String brand, String model, int price, String carrier, boolean hasCover) {
        super(brand, model, price);
        this.carrier = carrier;
        this.hasCover = hasCover;
    }

    //Getters and Setters
    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public boolean isHasCover() {
        return hasCover;
    }

    public void setHasCover(boolean hasCover) {
        this.hasCover = hasCover;
    }

    //To String


    @Override
    public String toString() {
        return "SmartPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", carrier='" + carrier + '\'' +
                ", hasCover=" + hasCover +
                '}';
    }
}
