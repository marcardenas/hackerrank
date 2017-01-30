/*
  
    This is an elemental coding exercise and
    doesnt require any introduction to it
    
    -- Class node is already declared and defined
  
    By Marcelo Cárdenas    
    
*/

Node Insert(Node head,int data) {
    if (head == null){
        head = new Node();
        head.data = data;
        head.next = null;
    }
    else {
        Node node = head;
        while (node.next != null){
            node = node.next;
        }
        node.next = new Node();
        node.next.data = data;
    }
    return head;
}

