/*
  
    Given a position n, the code allows to delete a node
    in that position
    
    -- Class node is already declared and defined
  
    By Marcelo Cárdenas    
    
*/

Node Delete(Node head, int position) {

    if(head == null)
        return head;
    if(position == 0){
        head = head.next;
        return head;
    }
    else{
        Node pHead = head;
        
        for(int i = 0; i < position - 1 ; i++)
            pHead = pHead.next;
        
        pHead.next = (pHead.next).next;
    }
    return head;
}
