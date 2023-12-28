package other;

public class Power {
    public static void main(String [] args){
        double x = 2;
        int n = 5;
        double result = 0;

        for (int i = 0; i < n; i++) {
            result *= x;
        }
        System.out.println("x^n betraegt: " + result);
    }
}
