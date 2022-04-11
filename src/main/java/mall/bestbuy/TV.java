package mall.bestbuy;

public class TV extends ElectronicDevice {
    //Fields
    private boolean hasRemote;
    private boolean hasHDMI;

    //Constructors
    public TV() {
    }

    public TV(boolean hasRemote, boolean hasHDMI) {
        this.hasRemote = hasRemote;
        this.hasHDMI = hasHDMI;
    }

    public TV(String brand, String model, int price, boolean hasRemote, boolean hasHDMI) {
        super(brand, model, price);
        this.hasRemote = hasRemote;
        this.hasHDMI = hasHDMI;
    }

    //Getters and Setters
    public boolean isHasRemote() {
        return hasRemote;
    }

    public void setHasRemote(boolean hasRemote) {
        this.hasRemote = hasRemote;
    }

    public boolean isHasHDMI() {
        return hasHDMI;
    }

    public void setHasHDMI(boolean hasHDMI) {
        this.hasHDMI = hasHDMI;
    }

    //To String
    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", hasRemote=" + hasRemote +
                ", hasHDMI=" + hasHDMI +
                '}';
    }

    //Methods

}
