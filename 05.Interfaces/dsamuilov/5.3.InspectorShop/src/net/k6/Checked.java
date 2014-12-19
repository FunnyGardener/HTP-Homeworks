package net.k6;

import java.util.Iterator;
import java.util.List;


public class Checked {

    private CheckListener checkListener;


    public void validation(List<Goods> goodses) {
        int validationSuccess = 0;
        Iterator<Goods> iterator = goodses.iterator();
        while (iterator.hasNext()) {
            Goods goods = iterator.next();
            if (goods.getExpirationDate().compareTo(Date.getCurrentDate()) == -2)
                System.out.println("Comparison is not possible, there is no product");
            else if (goods.getExpirationDate().compareTo(Date.getCurrentDate()) == -1) {
                System.out.println(goods);
                checkListener.onValidationFail(goodses, goods);
            } else validationSuccess++;
        }

    }

    public void addCheckListener(CheckListener listener) {
        this.checkListener = listener;
    }

    public interface CheckListener {
        void onValidationFail(List<Goods> goodses, Goods goods);
    }

}
