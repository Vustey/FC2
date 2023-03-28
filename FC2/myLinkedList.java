package FC2;


import java.util.*;

public class myLinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }

        Node(int x, Node t) {
            data = x;
            next = t;
        }


        @Override
        public String toString() {
            return data + "\t";
        }
    }

    public static class mySLL {
        Scanner scanner = new Scanner(System.in);
        Node head;

        void add() {
            Node temp = null;
            int x = -1;
            while (true) {
                System.out.print("x = ");
                x = scanner.nextInt();
                Node t = new Node(x);
                if (x == 0) {
                    break;
                }
                if (head == null) {
                    head = temp = t;
                } else {
                    temp.next = t;
                    temp = t;
                }
            }
        }



        void display() {
            System.out.println("My List ");
            Node p = head;
            while (p != null) {
                System.out.print(p);
                p = p.next;
            }
        }

        void append() {
            System.out.print("Enter number append = ");
            int x = scanner.nextInt();
            Node t = new Node(x);
            if (head == null) {
                head = t;
            } else {
                Node p = head;
                while (p.next != null) {
                    p = p.next;
                }
                p.next = t;
            }
        }

        void append_odd() {
            Node temp = head;
            System.out.println("nhap so muon them vao cuoi: ");
            if (temp == null) {
                head = new Node(scanner.nextInt());
                return;
            }
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(scanner.nextInt());

        }

        void insert(int x, int k) {
            if (k < 1) {
                System.out.println("Khong chen duoc nhe");
            } else {
                if (k == 1) {
                    head = new Node(x, head);
                } else {
                    int index = 1;
                    Node p = head;
                    while (p != null && index < k - 1) {
                        index++;
                        p = p.next;
                    }
                    if (p == null) {
                        System.out.println("Vi tri chen khong hop le");
                    } else {
                        Node t = new Node(x, p.next);
                        p.next = t;
                    }
                }
            }
        }

        void deletebynum() {
            System.out.println("nhap gia tri muon xoa: ");
            int k = scanner.nextInt();
            if (head == null) {
                System.out.println("fail!");
                return;
            }
            Node temp = head;
            if (head.next == null || head.data == k) {
                head = head.next;
                return;
            }
            while (temp.next != null) {
                if (temp.next.data == k) {
                    temp.next = temp.next.next;
                    return;
                }
                temp = temp.next;
            }
        }

        void deletebylocation() {
            System.out.println("nhap vi tri muon xoa: ");
            int k = scanner.nextInt();
            if (head == null) {
                System.out.println("fail");
                return;
            }
            if (k == 0) {
                head = head.next;
                return;
            }
            Node temp = head;
            for (int i = 0; i < k - 1; i++) {
                if (temp.next == null) {
                    System.out.println("fail");
                    return;
                }
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

        void reverse() {
            ArrayList<Integer> a = new ArrayList<>();
            if (head == null) {
                System.out.println("fail");
                return;
            }
            Node temp = head;
            while (temp != null) {
                a.add(temp.data);
                temp = temp.next;
            }
            Node add = head;
            for (int i = a.size() - 1; i >= 0; i--) {
                add.data = a.get(i);
                add = add.next;
            }
        }

        void takemid() {
            ArrayList<Integer> save = new ArrayList<>();
            if (head == null) {
                System.out.println("fail!");
                return;
            }
            Node temp = head;
            while (temp != null) {
                save.add(temp.data);
                temp = temp.next;
            }
            System.out.println("phan tu o giua: " + save.get(save.size() / 2));
        }



        void checkascending() {
            if (head == null) {
                System.out.println("fail!");
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data < temp.data) {
                    System.out.println("not ascending!");
                    return;
                } else {
                    temp = temp.next;
                }
            }
            System.out.println("ascending!");

        }

        void deleteodd() {
            if (head == null) {
                System.out.println("fail!");
                return;
            }
            if (head.data % 2 == 1) {
                head = head.next;
            }
            Node temp = head;
            while (temp.next.next != null) {
                if (temp.next.data % 2 == 1) {
                    temp.next = temp.next.next;
                    deleteodd();
                } else {
                    temp = temp.next;
                }
            }
            if (temp.next.data % 2 == 1) {
                temp.next = null;
            }
        }

        void sort() {
            if (head == null || head.next == null) {
                System.out.println("fail!");
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                if (temp.data > temp.next.data) {
                    int tmp = temp.data;
                    temp.data = temp.next.data;
                    temp.next.data = tmp;
                } else {
                    temp = temp.next;
                }
            }
        }

        public static void main(String[] args) {
            mySLL mySLL = new mySLL();
            mySLL.add();
            mySLL.append();
            mySLL.insert(3,2);
            mySLL.display();
        }
    }
}
