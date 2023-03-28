package FC2;

import java.util.*;

public class them {
    public static final int cap = 16;
    protected
    Scanner scanner = new Scanner(System.in);
    int n;
    Object[] a;
    int size ;
    void input() {
        System.out.println("Enter n :");
        n = scanner.nextInt();
        a = new Object[n];
        size = a.length;
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = scanner.nextInt();
        }
    }

    void output() {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println(size);
    }

    void insert(int index, int x) {
        for (int i = size - 2; i >= index; i--)
            a[i + 1] = a[i];
        a[index] = x;
        size++;
        System.out.println(size);
    }

    public static void main(String[] args) {
        them them = new them();
        them.input();
//        them.output();
        them.insert(3,10);
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        them.output();
    }
}
