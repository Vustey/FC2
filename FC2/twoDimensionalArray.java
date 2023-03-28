package FC2;

import java.util.*;

public class twoDimensionalArray {
    int[][] a;
    int row, cloumn;

    void input() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("-Enter Row : ");
        row = scanner.nextInt();
        System.out.print("-Enter Cloumn : ");
        cloumn = scanner.nextInt();
        a = new int[row][cloumn];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cloumn; j++) {
                a[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    void display() {
        for (int i = 0; i < row; i++) {
            System.out.println();
            for (int j = 0; j < cloumn; j++) {
                System.out.print("\t" + a[i][j]);
            }
        }
    }

    void rotateArray() {
        System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cloumn / 2; j++) {
                int temp = a[i][j];
                a[i][j] = a[i][cloumn - j - 1];
                a[i][cloumn - j - 1] = temp;
            }
        }

        display();


    }

    void maxCloumn() {
        System.out.println();
        for (int i = 0; i < cloumn; i++) {
            int max = a[0][i];
            for (int j = 0; j < row; j++) {
                if (max < a[j][i]) {
                    max = a[j][i];
                }
            }
            System.out.println("Max of Cloumn " + i + " = " + max);
        }
    }

    public static void main(String[] args) {
        twoDimensionalArray array = new twoDimensionalArray();
        array.input();
        array.display();
//        array.rotateArray();
        array.maxCloumn();
    }
}
