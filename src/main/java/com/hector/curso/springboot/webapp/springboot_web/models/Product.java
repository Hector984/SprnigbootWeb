package com.hector.curso.springboot.webapp.springboot_web.models;

public class Product implements Cloneable {

    private Long Id;
    private String name;
    private Long price;

    @Override
    public Object clone()  {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

            return new Product(Id, name, price);
        }
    }

    public Product() {
    }

    public Product(Long id, String name, Long price) {
        Id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getPrice() {
        return price;
    }
    public void setPrice(Long price) {
        this.price = price;
    }

    
}
