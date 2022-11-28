package com.dz7_11;

public class shoes extends clothes {
    private String name_brnd;

    public shoes(int size, String color, String type, String brand) {
        super(size, color, type);
        setBrand(brand);
    }

    public void setBrand(String name) {
        this.name_brnd = name;
    }

    public String getBrand() {
        return name_brnd;
    }

    @Override
    public String toString() {
        return "Shoes {" + super.toString() + "; brand: " + name_brnd +"}";
    }
}
