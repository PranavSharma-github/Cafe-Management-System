package com.cafeapp.model;

/**
 *
 * @author Pranav Sharma LMU ID:23048577
 */
//Class names as MenuItems
public class MenuItems {

    private int id;
    private String name;
    private String category;
    private int price;
    private String description;
    private int calories;

    //Parameterized constructor for the class MenuItems
    public MenuItems(int id, String category, String name, int price, String description, int calories) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.description = description;
        this.calories = calories;
    }

    //getters and setters method for all the attributes
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getCalories() {
        return calories;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

}
