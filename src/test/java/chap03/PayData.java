package chap03;

import java.time.LocalDate;

public class PayData {
    private LocalDate billingDate;
    private int payAmmount;
    private LocalDate firstBillingDate;

    private PayData() {}

    public PayData( LocalDate firstBillingDate,LocalDate billingDate, int payAmmount) {
        this.firstBillingDate = firstBillingDate;
        this.billingDate = billingDate;
        this.payAmmount = payAmmount;
    }
    public PayData(LocalDate billingDate, int payAmmount) {
        this.billingDate = billingDate;
        this.payAmmount = payAmmount;
    }

    public LocalDate getBillingDate() {
        return billingDate;
    }
    public int getPayAmmount() {
        return payAmmount;
    }

    public LocalDate getFirstBillingDate() {
        return firstBillingDate;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        private PayData data = new PayData();

        public Builder billingDate(LocalDate billingDate){
            data.billingDate = billingDate;
            return this;
        }
        public Builder payAmount(int payAmount){
            data.payAmmount = payAmount;
            return this;
        }
        public PayData build(){
            return data;
        }

        public Builder firstBillingDate(LocalDate fbd) {
            data.firstBillingDate = fbd;
            return this;
        }
    }
}
