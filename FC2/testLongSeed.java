package FC2;
import java.util.*;
public class testLongSeed {
    public static void main(String[] args) {


//        Random random = new Random(1);
//        System.out.println("Using Constructor");
//        for (int i = 0 ; i <= 10;i++){
//            System.out.print(random.nextInt(10) + "\t");
//        }
//        Random random2 = new Random();
//        System.out.println();
//        System.out.println("Using Method");
//        for (int i = 0 ; i <= 10;i++){
//            System.out.print(random2.nextInt(10)+ " \t");
//        }
//    }


        Random random1 = new Random(1);
        Random random2 = new Random();
        System.out.print("Co neo(gia tri random khong doi): ");
        for (int i = 0; i < 5; i++) {
            System.out.print(random1.nextInt(100) + " ");
        }
        System.out.println();
        System.out.print("Khong neo(gia tri random thay doi): ");
        for (int i = 0; i < 5; i++) {
            System.out.print(random2.nextInt(100) + " ");
        }
    }
}
