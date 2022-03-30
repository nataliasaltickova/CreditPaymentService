public class Main {
    public static void main(String[] args) {
        CPService service = new CPService();
        double sum = 1_000_000;
        int amountOfMonths = 12;
        double payment = service.calculate(sum, amountOfMonths);
        System.out.println(Math.round(payment));

        amountOfMonths = 24;
        payment = service.calculate(sum, amountOfMonths);
        System.out.println(Math.round(payment));

        amountOfMonths = 36;
        payment = service.calculate(sum, amountOfMonths);
        System.out.println(Math.round(payment));
    }
}
