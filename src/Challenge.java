import java.text.DecimalFormat;

public class Challenge {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println(df.format(exp(4,10)));
        System.out.println(df.format(exp(20,10)));
        System.out.println(df.format(exp(0.5,10)));
        System.out.println(df.format(exp(-0.5,10)));

    }

    public static double power(double x, int n) {
        return (n == 0) ? 1 : x * power(x, n - 1);
    }

    public static double factorial(int n) {
        return (n == 0) ? 1 : n * factorial((n - 1));
    }

    public static double exp(double x, int n) {
        return (n == 0) ? 1 : (power(x, n) / factorial(n)) + exp(x, n - 1);
    }

}
