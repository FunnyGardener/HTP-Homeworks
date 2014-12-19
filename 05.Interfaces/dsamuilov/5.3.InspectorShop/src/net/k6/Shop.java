package net.k6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shop {
    List<Goods> goods = new ArrayList<Goods>();

    Shop(int quantityGoods) {
        takeGoods(quantityGoods);
    }

    public List<Goods> getGoods() {
        return goods;
    }

    private void takeGoods(int quantityGoods) {
        for (int i = 0; i < quantityGoods; i++) {
            goods.add(new Goods(TypeGoods.randomTypeGoods(), new Random().nextInt(500) + 100, Date.randomDate(0, 0, 2007)));
        }


    }


}
