/*

Write a program to find the node at which the intersection of two singly linked 
lists begins.


For example, the following two linked lists:

A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3
begin to intersect at node c1.

 */
package intersectionoftwolists;

/**
 *
 * @author ali_hassan_syed
 */
public class IntersectionOfTwoLists 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
    }
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        int countA = 0;
        ListNode node = headA;
        while (node != null)
        {
            countA++;
            node = node.next;
        }
        
        int countB = 0;
        node = headB;
        while (node != null)
        {
            countB++;
            node = node.next;
        }
        
        while (countA != countB)
        {
            if (countB > countA)
            {
                countB--;
                headB = headB.next;
            }
            else if (countA > countB)
            {
                countA--;
                headA = headA.next;
            }
        }
        
        while (headA != null)
        {
            if (headA == headB)
                return headA;
            headA = headA.next;
            headB = headB.next;
        }
        
        return null;
    }
}
