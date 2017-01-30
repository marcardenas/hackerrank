/*
  
    Given a position n, the code allows to add a node
    in that position
    
    -- Class node is already declared and defined
  
    By Marcelo Cárdenas    
    
*/

Node InsertNth(Node head, int data, int position) {
    
    Node nodo = new Node(); nodo.data = data;
    
    if(head==null)    
        return nodo;
    
    if(position == 0){
        nodo.next = head;
        return nodo;
    }
    
    else{
        Node pHead = head;
        
        for(int i = 0; i < position-1; i++){
            pHead = pHead.next;
        }        
        nodo.next = pHead.next;
        pHead.next = nodo;                    
    }
    
    return head;
}

