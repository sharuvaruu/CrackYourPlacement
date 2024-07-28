//https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/submissions/1333155507/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        List<Integer> binary = new ArrayList<>();
          while(head!=null){
            binary.add(head.val);
            head=head.next;
          }
          int l=binary.size();
          double sum=0;
          for(int i=0;i<binary.size();i++){
            l--;
            sum=sum+Math.pow(2,l)*binary.get(i);
          }
        return (int)sum;

        }

    }

