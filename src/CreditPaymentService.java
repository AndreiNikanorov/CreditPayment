public class CreditPaymentService {
    public double calculate(int loan, double intRate, int term) {
        double month = term * 12;
        double percent = intRate / (100 * 12);
        double ratio = Math.pow(1 + percent, month);
        double result = loan * (percent + (percent / (ratio - 1)));
        return result;
    }
}
