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

    int countNode(tNode T){
        if (T == null){
            return 0;
        }else{
            return 1 + countNode(T.left) + countNode(T.right);
        }
    }

    int numberNode(){
        return countNode(root);
    }

    int sumNumberNode(tNode T){
        if(T == null){
            return 0;
        }else{
            return T.data + sumNumberNode(T.left) + sumNumberNode(T.right);
        }
    }

    int sumNode(){
        return sumNumberNode(root);
    }

    int countNumberNodeLeaf(tNode T){
        if(T == null){
            return 0;
        }else if(T.left == null && T.right == null){
            return 1;
        }else {
            return countNumberNodeLeaf(T.left) + countNumberNodeLeaf(T.right);
        }
    }

    int countNodeLeaf(){
        return countNumberNodeLeaf(root);
    }

    int sumNumberNodeLeaf(tNode T){
        if(T == null){
            return 0;
        }else if (T.left == null && T.right == null){
            return T.data;
        }else {
            return sumNumberNodeLeaf(T.left) + sumNumberNodeLeaf(T.right);
        }
    }

    int sumNodeLeaf(){
        return sumNumberNodeLeaf(root);
    }

    int countNumberNodeHaveTwoNode(tNode T){
        if(T.left == null && T.right == null){
            return 0;
        }else {
            return 1 + countNumberNodeHaveTwoNode(T.left) + countNumberNodeHaveTwoNode(T.right);
        }
    }
    int countNodeHaveTwoNode(){
        return countNumberNodeHaveTwoNode(root);
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
        System.out.println();
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.intputBST();
        bst.output();
        System.out.print("Number Node : " + bst.numberNode());
        System.out.println();
        System.out.print("Sum Number Node : " + bst.sumNode());
        System.out.println();
        System.out.print("Count Number Node Leaf : " + bst.countNodeLeaf());
        System.out.println();
        System.out.print("Sum Number Node Leaf : " + bst.sumNodeLeaf());
        System.out.println();
        System.out.println("Count Number Node Have Two Node : " +bst.countNodeHaveTwoNode());
    }
}
