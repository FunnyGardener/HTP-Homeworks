package net.k6;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop(20);
        List<Goods> goodses = new ArrayList<Goods>(shop.getGoods());
        Checked checked = new Checked();
        Checked.CheckListener checkListener = new Checked.CheckListener() {

            @Override
            public void onValidationFail(List<Goods> goodses, Goods goods) {
                System.out.println("Expiration date is ended. what to do?(Enter: 1 - nothing/2 - Delete)");
                Scanner sc = new Scanner(System.in);
                int i = sc.nextInt();
                if (i == 2) goods.setFlagDelete(true);
            }
        };

        checked.addCheckListener(checkListener);
        checked.validation(goodses);
        Iterator<Goods> iterator = goodses.iterator();
        while (iterator.hasNext()) {
            Goods goods = iterator.next();
            if (goods.isFlagDelete()) iterator.remove();
            ;
        }
        System.out.println(goodses);

    }


}

