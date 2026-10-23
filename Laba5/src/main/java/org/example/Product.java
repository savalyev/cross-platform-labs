package org.example;

enum Category{
    FOOD, CLOTHES, ELECTRONICS, BOOKS, TOYS
}

public class Product {
    private String name;
    private Category category;

    public Product(){}

    public Product(String name, Category category){
        this.name = name;
        this.category = category;
    }

    public String info(){
        return "Название товара: " + name +
                "\nКатегория товара: " + category.name();
    }

    public Category getCategory(){
        return category;
    }
}
