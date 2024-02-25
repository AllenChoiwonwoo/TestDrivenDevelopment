package cahhp07;

public class StubCardNumberValidator extends CardNumberValidator{
    private String invalidNo;
    private String theftNo;

    public void setInvalidNo(String invalidNo){
        this.invalidNo = invalidNo;
    }
    public void setTheftNo(String theftNo){
        this.theftNo = theftNo;
    }

    @Override
    public CardValidity validate(String cardNumber){
        if (!invalidNo.isEmpty() && invalidNo.equals(cardNumber)){
            return CardValidity.INVALID;
        }
        if (!theftNo.isEmpty() && theftNo.equals(theftNo)){
            return CardValidity.THEFT;
        }
        return CardValidity.VALID;
    }
}
