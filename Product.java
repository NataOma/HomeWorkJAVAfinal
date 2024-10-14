package HomeWorkFinal;

import java.util.Objects;

public abstract class Product {
    double price;
    String name; 
    static long ID = 1;
    long id;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 &&
                Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, id);
    }

    @Override
    public String toString() {
        return "ID: " + this.id +
                ", Product type: " + this.getClass().getSimpleName() +
                ", price=" + price +
                ", name='" + this.name + '\'' +
                "}";
    }

    public String getName() {
        return this.name;
    }
}