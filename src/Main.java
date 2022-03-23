public class Main {
    public static void main(String[] args){
        CPService service = new CPService();
        double s = 1_000_000;
        double m = 36;
        double payment = service.calculate(s,m);
        System.out.println(Math.round(payment));
    }
}
