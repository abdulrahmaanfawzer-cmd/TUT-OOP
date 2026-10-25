package uk.ac.westminster.products_api;

@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.DEDUCTION)
@com.fasterxml.jackson.annotation.JsonSubTypes({
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(DigitalProduct.class),
        @com.fasterxml.jackson.annotation.JsonSubTypes.Type(PhysicalProduct.class)
})
public class Product {

    private Long id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() { return id; }

    public String getName() { return name; } //if I were to comment this out, it wouldnt work,
    //because if the getName function is not there, Jackson has nothing to call for.

    public double getPrice() { return price;}

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

