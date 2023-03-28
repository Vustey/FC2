package FC2;

import java.util.*;

public class Test {
    Scanner scanner = new Scanner(System.in);
    int[] a;

//    void Random() {
//        Random rd = new Random(1);
//        System.out.print("Enter n : ");
//        int n = scanner.nextInt();
//        a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = rd.nextInt()%100;
//        }
//    }
    void Random2(int n ) {
        Random rd = new Random(1);
//        System.out.print("Enter n : ");
//        n = scanner.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = rd.nextInt();
        }
    }

    void output() {
        for (int i = 0; i <= a.length; i++) {
            System.out.print("\t" + a[i]);
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
//        test.Random();
//        test.output();
        test.Random2(5);
        test.output();
    }
}
