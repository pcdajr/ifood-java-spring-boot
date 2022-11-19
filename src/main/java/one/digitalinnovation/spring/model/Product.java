package one.digitalinnovation.spring.model;

import java.math.BigDecimal;

public class Product {

    private String name;
    private BigDecimal price;
    private String information;

    public Product() {
    }

    public Product(String name, BigDecimal price, String information) {
        this.name = name;
        this.price = price;
        this.information = information;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", information='" + information + '\'' +
                '}';
    }
}
