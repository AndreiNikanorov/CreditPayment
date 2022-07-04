public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int loan = 1_000_000;
        double intRate = 9.99;

        int term = 1;
        double monthPayment = service.calculate(loan, intRate, term);
        System.out.println("Сумма кредита: " + loan);
        System.out.println("Ежемесячный платеж " + Math.round(monthPayment) + " рублей - при годовой ставке " + intRate + "%" + " на " + term + " год(а)");
        System.out.println();

        term = 2;
        monthPayment = service.calculate(loan, intRate, term);
        System.out.println("Сумма кредита: " + loan);
        System.out.println("Ежемесячный платеж " + Math.round(monthPayment) + " рублей - при годовой ставке " + intRate + "%" + " на " + term + " год(а)");
        System.out.println();

        term = 3;
        monthPayment = service.calculate(loan, intRate, term);
        System.out.println("Сумма кредита: " + loan);
        System.out.println("Ежемесячный платеж " + Math.round(monthPayment) + " рублей - при годовой ставке " + intRate + "%" + " на " + term + " год(а)");
        System.out.println();
    }
}
