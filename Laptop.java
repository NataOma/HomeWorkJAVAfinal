package HomeWorkFinal;

public class Laptop extends Product{
    private final long id;
    private final String hddType;
    private final int hddSize;
    private final String ramType;
    private final int ramSize;
    private final String os;
    private final String color;
   
    public Laptop(String hddType, int hddSize, String ramType, int ramSize, String os, double price, String color) {

        this.color = color;
        this.id = Product.ID++;
        this.hddType = hddType;
        this.hddSize = hddSize;

        this.ramType = ramType;
        this.ramSize = ramSize;
        this.os = os;
        this.price = price;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", hddType='" + hddType + '\'' +
                ", hddValue=" + hddSize +
                ", ramType='" + ramType + '\'' +
                ", ramValue=" + ramSize +
                ", os=" + os +
                ", color='" + color + '\'' +
                ", price=" + price +
                "}";
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }
}
