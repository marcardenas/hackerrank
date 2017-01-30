/*
  
    This is an elemental coding exercise and
    doesnt require any introduction to it
    
    -- Class node is already declared and defined
  
    By Marcelo Cárdenas    
    
*/

void Print(Node head) {
    Node pHead = head;
    while(pHead != null){
        System.out.println(pHead.data);
        pHead = pHead.next;
    }
  
}
