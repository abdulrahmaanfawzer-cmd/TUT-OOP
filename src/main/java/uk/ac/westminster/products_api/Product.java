package uk.ac.westminster.products_api;

public class Product {

    private Long id;
    private String name;
    private double price;

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() { return id; }

    public String getName() { return name; } //if I were to comment this out, it wouldnt work,
    //because if the getName function is not there, Jackson has nothing to call for.

    public double getPrice() { return price;}
}

