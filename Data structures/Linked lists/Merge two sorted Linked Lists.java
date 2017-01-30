/*

    This algorythm merge two sorted linked lists
    so when they were merged, the remaining list
    is also merged

    By Marcelo Cárdenas

*/

Node MergeLists(Node headA, Node headB) {

    if (headA == null) {
        return headB;
    } else if (headB == null) {
        return headA;
    }

    if (headA.data < headB.data) {
        headA.next = MergeLists(headA.next, headB);
        return headA;
    } else {
        headB.next = MergeLists(headA, headB.next);
        return headB;
    }
}
