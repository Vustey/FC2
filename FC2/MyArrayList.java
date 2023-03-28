package FC2;

import java.util.Random;

public class MyArrayList {
    int[] a;

    void randomNumber(int n) {
        Random random = new Random();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 100);
        }
    }

    void display() {
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + (i + 1) + "]=" + a[i] + "\t|| ");
        }
        System.out.println();
    }

    void maxSecond() {
        int max = a[0];
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (max2 < a[i] && a[i] < max) {
                max2 = a[i];
            }
        }
        System.out.println();
        System.out.println("The number max second : " + max2);
    }

    void insert(int index, int numberInsert) {
        int size = a.length;
        int[] b = new int[size + 1];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        for (int i = size; i > index; i--) {
            b[i] = a[i - 1];
        }
        b[index] = numberInsert;
        a = b;
    }

    void deleteNumber(int index) {
        int size = a.length;
        int[] b = new int[size - 1];
        for (int i = 0; i < index; i++) {
            b[i] = a[i];
        }
        for (int i = index; i < a.length - 1; i++) {
            b[i] = a[i + 1];
        }
        a = b;
    }

    void deleteOdd() {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count++;
            }
        }
        int temp = 0;
        int[] b = new int[count];
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                b[temp++] = a[i];
            }
        }
        a = b;
    }

    void minSecond() {
        int min = a[0];
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if ((min2 > a[i]) && (min > a[i])) {
                min2 = a[i];
            }
        }
        System.out.println(min2);
    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        int n = 5;
        list.randomNumber(n);
        list.display();
//        list.maxSecond();
//        list.insert(5,1000);
//        list.deleteNumber(5);
//        list.deleteOdd();
        list.minSecond();
        list.display();
    }
}
