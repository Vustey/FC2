package FC2;

public class MyArrayList_2 {
    int[] a = {1, 2, 3, 4, 5, 6, 7, 8};

    void increaseArray() {
        int size = a.length;
        int count = 0;
        for (int i = 0; i < a.length; ) {
            for (int j = i + 1; j < a.length; j++) {
                if ( a[i] < a[j]){
                    count++;
                }
                i++;
            }

        }
        if (count == size) {
            System.out.println("Oke");
        } else {
            System.out.println("Not Found");
        }
    }

    public static void main(String[] args) {
        MyArrayList_2 l = new MyArrayList_2();
        l.increaseArray();
    }
}
