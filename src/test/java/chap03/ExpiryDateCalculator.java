package chap03;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Objects;

import static java.util.Objects.nonNull;

public class ExpiryDateCalculator {
    public LocalDate calculateExpiryDate(PayData payData) {

        int addedMonths = getTotalAddedMonths(payData);

        if (nonNull(payData.getFirstBillingDate())) {
            return expiryDateUsingFirstBillingDate(payData, addedMonths);
        }else{
            return payData.getBillingDate().plusMonths(addedMonths);
        }
    }

    private static int getTotalAddedMonths(PayData payData) {
        int addedYears = payData.getPayAmmount() / 10_000 / 10;
        int addedMonths = payData.getPayAmmount() / 10_000 % 10;
        int totalAddedMonths = addedYears * 12 + addedMonths;
        return totalAddedMonths;
    }

    private static LocalDate expiryDateUsingFirstBillingDate(PayData payData, int addedMonths) {
        LocalDate candidateExp = payData.getBillingDate().plusMonths(addedMonths);
        final int dayOfFirstBilling = payData.getFirstBillingDate().getDayOfMonth();
        if (dayOfFirstBilling != candidateExp.getDayOfMonth()) {
            final int dayLenOfCandiMon = lastDayOfMonth(candidateExp);
            if (dayLenOfCandiMon < dayOfFirstBilling){
                return candidateExp.withDayOfMonth(dayLenOfCandiMon);
            }
            return candidateExp.withDayOfMonth(dayOfFirstBilling);
        }else{
            return candidateExp;
        }
    }

    private static int lastDayOfMonth(LocalDate candidateExp) {
        return YearMonth.from(candidateExp).lengthOfMonth();
    }
}
