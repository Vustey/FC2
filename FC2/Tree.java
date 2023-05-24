package FC2;
class tNode{
    int data;
    tNode right, left;
    tNode(int x){
        data = x;
        right =  left = null;
    }
    tNode(int x, tNode ll, tNode rr){
        data = x;
        left = ll;
        right = rr;
    }
}
public class Tree {
    tNode root;

    void inputTree(){
        tNode A = new tNode(9, null, new tNode(0));
        tNode B = new tNode(2, new tNode(4), A);
        tNode C = new tNode(3, B, null);
        tNode D = new tNode(5, new tNode(6), new tNode(2));
        tNode E = new tNode(1, null, D);
        tNode F = new tNode(7, E, null);
        root = new tNode(8, C, F);
    }
    void checkTree(tNode T) {
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

    int numberNode(tNode T) {
        if (T == null) {
            return 0;
        }else {
            return 1+ numberNode(T.left) +numberNode(T.right);
        }
    }

    int nNode() {
        return numberNode(root);
    }

    int sumNode(tNode T) {
        if(T == null) {
            return 0;
        }else {
            return T.data + sumNode(T.left) + sumNode(T.right);
        }
    }

    int sum() {
        return sumNode(root);
    }

    int sumNodeLa(tNode T) {
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

    int sumNodeTrong(tNode T) {
        if((T == null)||(T.left == null && T.right == null)) {
            return 0;
        }else {
            return T.data + sumNodeTrong(T.left) + sumNodeTrong(T.right);
        }
    }

    int sumTrong() {
        return sumNodeTrong(root);
    }

    int countLe(tNode T) {
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

    int countCon(tNode T ) {
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
