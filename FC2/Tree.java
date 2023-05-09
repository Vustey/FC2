package FC2;
class TNode{
    int data;
    TNode right, left;
    TNode(int x){
        data = x;
        right =  left = null;
    }
    TNode(int x, TNode ll, TNode rr){
        data = x;
        left = ll;
        right = rr;
    }
}
public class Tree {
    TNode root;

    void inputTree(){
        TNode A = new TNode(9, null, new TNode(0));
        TNode B = new TNode(2, new TNode(4), A);
        TNode C = new TNode(3, B, null);
        TNode D = new TNode(5, new TNode(6), new TNode(2));
        TNode E = new TNode(1, null, D);
        TNode F = new TNode(7, E, null);
        root = new TNode(8, C, F);
    }
    void checkTree(TNode T) {
        if (T != null) {
            System.out.print(" " + T.data);
            checkTree(T.left);
            checkTree(T.right);
        }
    }

    void outputTree() {
        checkTree(root);
        System.out.println();
    }

    int numberNode(TNode T) {
        if (T == null) {
            return 0;
        }else {
            return 1+ numberNode(T.left) +numberNode(T.right);
        }
    }

    int nNode() {
        return numberNode(root);
    }

    int sumNode(TNode T) {
        if(T == null) {
            return 0;
        }else {
            return T.data + sumNode(T.left) + sumNode(T.right);
        }
    }

    int sum() {
        return sumNode(root);
    }

    int sumNodeLa(TNode T) {
        if (T == null) {
            return 0;
        }else if (T.left == null && T.right == null) {
            return 1;
        }else {
            return sumNodeLa(T.left) + sumNodeLa(T.right);
        }
    }

    int sumLa() {
        return sumNodeLa(root);
    }

    int sumNodeTrong(TNode T) {
        if((T == null)||(T.left == null && T.right == null)) {
            return 0;
        }else {
            return T.data + sumNodeTrong(T.left) + sumNodeTrong(T.right);
        }
    }

    int sumTrong() {
        return sumNodeTrong(root);
    }

    int countLe(TNode T) {
        if (T == null) {
            return 0;
        }else if (T.data %2 == 1 ){
            return T.data + countLe(T.left) + countLe(T.right);
        }else {
            return countLe(T.left) + countLe(T.right);
        }
    }

    int count() {
        return countLe(root);
    }

    int countCon(TNode T ) {
        if (T == null) {
            return 0;
        }else if (T.left != null || T.right != null){
            return countCon(T.left) + countCon(T.right);
        }else {
            return 1 + countCon(T.left) + countCon(T.right);
        }
    }

    int countC() {
        return countCon(root);
    }
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.inputTree();
        tree.outputTree();
        System.out.print("Number Node : " + tree.nNode());
        System.out.println();
        System.out.print("Sum Node : " + tree.sum());
        System.out.println();
        System.out.print("Sum Node La : " + tree.sumLa());
        System.out.println();
        System.out.print("Sum Node Trong : " + tree.sumTrong());
        System.out.println();
        System.out.print("Sum Node Le : " + tree.count());
        System.out.println();
        System.out.print("Sum Node Le : " + tree.countC());
    }
}
