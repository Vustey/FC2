package FC2.homework;

import java.util.*;
import java.io.*;

class Node {
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
        return data + "";
    }
}

public class UseNode {

    Node head;

    //Thêm vào danh sách
    public void append(int n) {
        Node tempData = new Node(n);
        if (head == null) {
            head = tempData;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = tempData;
        }
    }

    //Đọc File solieu.txt và thêm vào danh sách
    public void inputFile() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("E:\\University\\DTU\\FC2\\FC2\\FC2\\homework\\solieu.txt");
        Scanner scannerFile = new Scanner(fileInputStream);
        int n = scannerFile.nextInt();
        for (int i = 0; i < n; i++) {
            append(scannerFile.nextInt());
        }
    }

    //Hiển thị danh sách
    public void output() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    //Tính tổng các nốt lẻ
    public int sumOdd() {
        int sum = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data % 2 != 0) {
                sum += temp.data;
            }
            temp = temp.next;
        }
        return sum;
    }

    //Tính trung bình cộng nốt chẳn
    public double averageEven() {
        int count = 0;
        int sum = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data % 2 == 0) {
                sum += temp.data;
                count++;
            }
            temp = temp.next;
        }
        if (count == 0) {
            return 0;
        }
        return (float) sum / count;
    }

    //Đếm số phần tử lớn hơn 3
    public int countGreaterThanThree() {
        final int numberCompare = 3;
        int count = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data > numberCompare) {
                count++;
            }
            temp = temp.next;
        }
        return count;
    }

    //Đếm số phần tử khác nhau trong danh sách
    public int countNumberDifferent() {
        List<Integer> list = new ArrayList<>();
        Node temp = head;
        while (temp != null) {
            if (!list.contains(temp.data)) {
                list.add(temp.data);
            }
            temp = temp.next;
        }
        return list.size();
    }

    //Hoán vị phần tử đầu và phần tử cuối trong danh sách
    public void swapFirstAndLast() {
        Node current = head;
        Node prev = null;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        int temp1 = head.data;
        head.data = current.data;
        current.data = temp1;
    }

    //IN giá trị nốt kế cuối trong danh sách
    public int outputSecondLast() {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        return temp.next.data;
    }

    //Đảo danh sách liên kết

    public void reverseList() {
        Node current = head;
        Node previous = null;
        while (current != null) {
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        head = previous;
    }

    public static void main(String[] args) throws FileNotFoundException {
        UseNode useNode = new UseNode();
        useNode.inputFile();
        System.out.println("Sum of odd node : " + useNode.sumOdd());
        System.out.println("Average of even node : " + useNode.averageEven());
        System.out.println("The number of elements greater than 3 in the list : " + useNode.countGreaterThanThree());
        System.out.println("The number of different elements in the list : " + useNode.countNumberDifferent());
        System.out.print("Swap the first and last element in a list : ");
        useNode.output();
        useNode.swapFirstAndLast();
        System.out.print("Result after swapping first and last element in list : ");
        useNode.output();
        System.out.println("Print the value of the last node in the list : " + useNode.outputSecondLast());
        System.out.print("Swap Linked List : ");
        useNode.output();
        useNode.reverseList();
        System.out.print("Result after swapping linked list : ");
        useNode.output();

    }
}
