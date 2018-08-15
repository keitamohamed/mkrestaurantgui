package blueprint;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Product {
    private SimpleStringProperty productID;
    private SimpleStringProperty name;
    private SimpleIntegerProperty quantity;
    private SimpleDoubleProperty price;
    private SimpleStringProperty image;

    public Product() {}
    public Product(String id, String n, int q, double p, String i) {
        this.productID = new SimpleStringProperty(id);
        this.name = new SimpleStringProperty(n);
        this.quantity = new SimpleIntegerProperty(q);
        this.price = new SimpleDoubleProperty(p);
        this.image = new SimpleStringProperty(i);
    }

    public String getProductID() {
        return productID.get();
    }

    public String getName() {
        return name.get();
    }

    public int getQuantity() {
        return quantity.get();
    }

    public double getPrice() {
        return price.get();
    }

    public String getImage() {
        return image.get();
    }
}
