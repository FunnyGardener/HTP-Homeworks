package net.k6.model;

public enum Size {
    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large");
    private String size;

    Size(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return size;
    }
}
