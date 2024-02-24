//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService serv = new CreditPaymentService();
        int month = 12; // период платежа в месяцах
        float per = 0.00789F; // ежемесячные проценты по платежу
        int sum = 1_000_000; // общая сумма платежа в рублях

        System.out.println();
        System.out.println("Ваш ежемесячный платёж: " + serv.calculate(12, sum, per));
        System.out.println();
        System.out.println("Ваш ежемесячный платёж: " + serv.calculate(24, sum, per));
        System.out.println();
        System.out.println("Ваш ежемесячный платёж: " + serv.calculate(36, sum, per));

    }
}