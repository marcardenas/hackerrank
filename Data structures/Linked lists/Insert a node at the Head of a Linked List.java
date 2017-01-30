/*
  
    This is an elemental coding exercise and
    doesnt require any introduction to it
    
    -- Class node is already declared and defined
  
    By Marcelo Cárdenas    
    
*/

Node Insert(Node head,int x) {
    if(head==null){
        head = new Node();
        head.data = x;
    }
    else{
        Node pHead = head;
        head = new Node();
        head.data = x;
        head.next = pHead;
    }
    return head;
    
}
