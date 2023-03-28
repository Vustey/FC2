package FC2;

import java.util.Random;

public class randomNumber {
    int[] a;

    void randomOne(int n) {
        Random random = new Random();
        a = new int[n];
        for (int i = 0; i < a.length; ) {
            int x = random.nextInt(n);
            boolean check = true;
            for (int j = 0; j < i; j++) {
                if (a[j] == x) {
                    check = false;
                    break;
                }
            }
            if (check) {
                a[i++] = x;
                System.out.print(" Done ");
            }
        }
    }

    void randomTwo(int n) {
        a = new int[n];
        int[] dd = new int[n + 1];
        Random rd = new Random();
        for (int i = 0; i <= n; i++) {
            dd[i] = 0;
        }
        for (int i = 0; i <= n; i++) {
            System.out.print(dd[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < a.length; ) {
            int x = rd.nextInt(n) + 1;
            if (dd[x] == 0) {
                a[i++] = x;
                dd[x] = 1;
                System.out.print("Done ");
            }
        }
    }

    void randomThree(int n){
        a = new int[n];
        for (int i = 0 ; i< n;i++){
            a[i] = i +1;
        }
        Random random = new Random();
        for (int i = 0; i < a.length;i++){
            int x = random.nextInt(n);
            int temp = a[i];
            a[i] = a[x];
            a[x] = temp;
        }
    }

    void output() {
        System.out.println();
        for (int j : a) {
            System.out.print(j + "  ");
        }
    }

    public static void main(String[] args) {
        randomNumber randomNumber = new randomNumber();
        int n = 10;
//        randomNumber.randomOne(n);
//        randomNumber.randomTwo(n);
        randomNumber.randomThree(n);
        randomNumber.output();
    }
}
