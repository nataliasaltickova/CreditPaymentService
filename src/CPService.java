public class CPService {
    public double calculate(double sum, int amountOfMonths) {
        double index = 0.008325;
        double factor = (index * (Math.pow((1 + index), amountOfMonths))) / (Math.pow((1 + index), amountOfMonths) - 1);
        return sum * factor;
    }
}
