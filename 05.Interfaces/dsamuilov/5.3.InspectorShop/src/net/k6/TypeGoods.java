package net.k6;

import java.util.Random;

public enum TypeGoods {
    Toys("Toys"),
    WashingPowder("Washing powder"),
    Cleanser("cleanser"),
    Shampoo("Shampoo");
    private String typeGoods;

    TypeGoods(String typeGoods) {
        this.typeGoods = typeGoods;
    }

    public static TypeGoods randomTypeGoods() {
        return TypeGoods.values()[new Random().nextInt(TypeGoods.values().length)];
    }

}
