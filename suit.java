package com.dz7_11;

public class suit extends clothes {
    private String style;

    public suit(int size, String color, String type, String style) {
        super(size, color, type);
        this.style = style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return "Suit {" + super.toString() + "; style: " + style + "}";
    }
}
