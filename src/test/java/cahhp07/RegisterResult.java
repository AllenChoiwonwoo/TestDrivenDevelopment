package cahhp07;

public class RegisterResult {
    private CardValidity state;

    public RegisterResult(CardValidity state) {
        this.state = state;
    }

    public static RegisterResult success() {
        return new RegisterResult(CardValidity.VALID);
    }

    public CardValidity getValidity() {
        return CardValidity.VALID;
    }

    public static RegisterResult error(CardValidity validity){
        return new RegisterResult(validity);
    }
}
