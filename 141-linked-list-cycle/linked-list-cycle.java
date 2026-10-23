public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        Set<ListNode> nodeSet = new HashSet<>();

        while (temp != null) {
            if (nodeSet.contains(temp)) {
                return true;
            }
            nodeSet.add(temp);
            temp = temp.next;
        }

        return false;
    }
}