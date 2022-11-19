package one.digitalinnovation.spring.model;

public class Cart {

    private Double freight;
    private Integer quantity;
    private Product product;

    public Cart() {
    }

    public Cart(Double freight, Integer quantity, Product product) {
        this.freight = freight;
        this.quantity = quantity;
        this.product = product;
    }

    public Double getFreight() {
        return freight;
    }

    public void setFreight(Double freight) {
        this.freight = freight;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "freight=" + freight +
                ", quantity=" + quantity +
                ", product=" + product +
                '}';
    }
}
