/*
  
    This code allows to reverse any list using a stack
    
    -- Class node is already declared and defined
  
    By Marcelo Cárdenas    
    
*/

Node Reverse(Node head) {
    Node pHead = head;
    Node initHead = head;
    
    if(pHead != null){
        Stack<Integer> pila = new Stack<Integer>();
        
        while(pHead!=null){
            pila.push(pHead.data);
            pHead = pHead.next;
        }
        
        while(initHead!= null){
            initHead.data = pila.pop();
            initHead = initHead.next;
        }
    }
    return head;
}
