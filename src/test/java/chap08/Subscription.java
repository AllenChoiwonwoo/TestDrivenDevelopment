package chap08;

import java.time.LocalDate;

import static chap08.Grade.GOLD;

public class Subscription {

    private int productId;

    public Subscription(int productId) {
        this.productId = productId;
    }

    public int getProductId() {
        return this.productId;
    }

    public boolean isFinished(LocalDate now) {
            return false;
    }

    public Grade getGrade() {
            return GOLD;
    }
}
