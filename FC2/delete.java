package FC2;

public class delete {
    int[] a = {1, 4, 5, 2, 7};
    int size = a.length;

//    boolean check(int e) {
//        for (int i = 0; i < a.length; i++) {
//            if (e == a[i])
//                return true;
//        }
//        return false;
//    }

    void del(int e, int index) {
        for (int i = e; i < a.length-1; i++) {
            a[i] = a[index + 1];
        }
        size--;
        for (int i = 0 ; i < size;i++ ){
            System.out.println(a[i]+ "\t");
        }
    }

    public static void main(String[] args) {
        delete d = new delete();
//        d.check(4);
        d.del(4,1);
    }
}
