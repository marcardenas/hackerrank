/*
  
    This code allows to print any list in reverse order
    using a stack
    
    -- Class node is already declared and defined
  
    By Marcelo Cárdenas    
    
*/

void ReversePrint(Node head) {
    Node pHead = head;
    if(pHead == null);
    else{
        Stack<Integer> pila = new Stack<Integer>();
        while(pHead != null){
            pila.push(pHead.data);
            pHead = pHead.next;
        }
        while(!pila.empty()){
            System.out.println(pila.pop());
        }
    }

}
