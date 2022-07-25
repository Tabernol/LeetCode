//package easy;
//
//
//import java.util.Arrays;
//import java.util.LinkedList;
//
//public class ListNode {
//    int val;
//    ListNode next;
//    //ListNode head;
//    int size;
//
//    ListNode() {
//    }
//
//    ListNode(int val) {
//        this.val = val;
//    }
//
//    ListNode(int val, ListNode next) {
//        this.val = val;
//        this.next = next;
//    }
//
//    public ListNode getNext() {
//        return next;
//    }
//
//    public void setNext(ListNode next) {
//        this.next = next;
//    }
//
//    public int getVal() {
//        return val;
//    }
//
//    public void add(int val) {
//        if (head == null) {
//            this.head = new ListNode(val);
//        } else {
//            ListNode temp = head;
//            while (temp.getNext() != null) {
//                temp = temp.getNext();
//            }
//            temp.setNext(new ListNode(val));
//        }
//        size++;
//    }
//
//    public String show() {
//        int[] result = new int[size];
//        int index = 0;
//        ListNode temp = head;
//
//        while (temp != null) {
//            result[index++] = temp.getVal();
//            temp = temp.getNext();
//        }
//
//        return Arrays.toString(result);
//    }
//
//    public static void main(String[] args) {
//        ListNode v = new ListNode();
//        v.add(9);
//        v.add(8);
//        v.add(7);
//        v.add(6);
//        v.add(6);
//        v.add(6);
//        System.out.println(v.show());
//        MiddleOfLinkedList876 b = new MiddleOfLinkedList876();
//        b.middleNode(v.head);
//
//    }
//}
//
//
//class MiddleOfLinkedList876 {
//    public ListNode middleNode(ListNode head) {
//        ListNode temp = head;
//        int mysize = 0;
//        while (temp != null) {
//            temp = temp.getNext();
//            mysize++;
//        }
//        int middle =0;
//        if(mysize%2==0){
//            middle = (mysize/2)+1;
//        }else {
//            middle = mysize/2;
//        }
//        temp=head;
////         while (temp !=null){
////             if(middle = )
////         }
//
//        System.out.println(mysize);
//        return temp;
//    }
//}
//
//
//
//
//
//
