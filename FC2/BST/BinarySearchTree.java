package FC2.BST;

class tNode {
    int data;
    tNode right, left;

    tNode(int x) {
        data = x;
        right = left = null;
    }

    tNode(int x, tNode ll, tNode rr) {
        data = x;
        right = rr;
        left = ll;
    }
}

public class BinarySearchTree {
    tNode root;
    void intputBST(){
        tNode A = new tNode(4, new tNode(5), new tNode(10));
        tNode B = new tNode(7, new tNode(11), new tNode(12));
        root = new tNode(3,A,B);
    }

    void duyettrungtu(tNode T){
        if(T != null){
            duyettrungtu(T.left);
            System.out.print(" " + T.data );
            duyettrungtu(T.right);
        }
    }
    void duyethautu(tNode T){
        if(T != null){
            duyethautu(T.left);
            duyethautu(T.right);
            System.out.print(" " + T.data);
        }
    }

    void duyettientu(tNode T){
        if(T != null){
            System.out.print(" " +T.data);
            duyettientu(T.left);
            duyettientu(T.right);
        }
    }

    void output(){
        System.out.print("Trung tu ");
        duyettrungtu(root);
        System.out.println();
        System.out.print("Hau tu ");
        duyethautu(root);
        System.out.println();
        System.out.print("Tien tu ");
        duyettientu(root);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.intputBST();
        bst.output();
    }
}
