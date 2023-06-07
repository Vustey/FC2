package FC2.FindAndSort;

import java.util.*;

public class FindAndSort {
    int[] a;
    int[] b;
    Scanner scanner = new Scanner(System.in);

    void random(int n) {
        Random random = new Random();
        a = new int[n];
        b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(100);
            b[i] = a[i];
        }

    }

    void copyArray() {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
    }

    void output() {
        System.out.print("a[" + a.length + "] = ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("b[" + b.length + "] = ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }

    void selectSort() {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int newIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[newIndex] ) {
                    newIndex = j;
                }
                int temp = a[i];
                a[i] = a[newIndex];
                a[newIndex] = temp;
            }
        }
    }

    void bubbleSort() {
        for (int i = 0; i < a.length - 1; i++) {
            boolean check = false;
            for (int j = a.length - 1; j > i; j--) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                    check = true;
                }
                if (check) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        FindAndSort findAndSort = new FindAndSort();
        long t1, t2;
        findAndSort.random(5);
        t1 = System.currentTimeMillis();
        findAndSort.bubbleSort();
        findAndSort.output();
        t2 = System.currentTimeMillis();
        System.out.println();
        System.out.println(t2 - t1);
        findAndSort.copyArray();
        t1 = System.currentTimeMillis();
        findAndSort.selectSort();
        System.out.println();
        findAndSort.output();
        t2 = System.currentTimeMillis();
        System.out.println();
        System.out.println(t2 - t1);
    }
}
