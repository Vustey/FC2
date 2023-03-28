package FC2;

public class Fib {
    static int Fibonacci(int v) {
        if ((v == 1) || (v == 0)) {
            return 1;
        } else {
            return Fibonacci(v - 1) + Fibonacci(v - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(5));
    }
}
