package cahhp07;

import java.time.LocalDateTime;

public class AutoDebitInfo {
    private String userId;
    private String cardNumber;
    private LocalDateTime dateTime;

    public AutoDebitInfo(String userId, String cardNumber, LocalDateTime now) {
        this.userId = userId;
        this.cardNumber = cardNumber;
        this.dateTime = now;
    }


    public void chargeCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getUserId() {
        return userId;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}
