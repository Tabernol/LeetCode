package easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MiddleLinkedList876 {
    public static void main(String[] args) {
        String s = "12th 34fg 14bn";
        Pattern pattern = Pattern.compile("[^a-z]");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println("match "+ matcher.start()+ "  " + matcher.group());
        }

    }

}

//class ListNode {
//    int val;
//    ListNode next;
//    ListNode head;
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
//    public int getVal() {
//        return val;
//    }
//
//    public void setVal(int val) {
//        this.val = val;
//    }
//
//    public ListNode getNext() {
//        return next;
//    }
//
//    public void setNext(ListNode next) {
//        this.next = next;
//    }
//}
//
//class Solution {
//    public ListNode middleNode(ListNode head) {
//        ListNode temp = head;
//        int size = 0;
//        while (temp.getNext() !=null){
//            size++;
//        }
//
//    }
//
//    public static void main(String[] args) {
//        Solution s = new Solution();
//
//}