public class CPService {
    public double calculate(double s,double m) {
        double i =0.008325;
        double k =  (i * (Math.pow((1+i), m)))/(Math.pow((1+i), m)-1);
        double payment =s*k;
        return payment;
    }
}
