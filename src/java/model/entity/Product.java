package model.entity;

/**
 * Created by Oleksandr_Borysov on 3/14/2017.
 */
public class Product {
    private int identifier;
    private int price;
    private String name;

    public Product(int indeficator, int price, String name) {
        this.identifier = indeficator;
        this.price = price;
        this.name = name;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (identifier != product.identifier) return false;
        if (price != product.price) return false;
        return name != null ? name.equals(product.name) : product.name == null;

    }

    @Override
    public int hashCode() {
        int result = identifier;
        result = 31 * result + price;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "identifier=" + identifier +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
