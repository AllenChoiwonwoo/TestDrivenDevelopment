package cahhp07;

public class AutoDebitReq {
    private String userId;
    private String cardNumber;
    public AutoDebitReq(String user1, String number) {
        this.userId = user1;
        this.cardNumber = number;
    }

    public String getUserId() {
        return userId;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}
