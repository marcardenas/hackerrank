/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N
  
  By Marcelo Cárdenas

*/

int GetNode(Node head,int n) {
     
    Stack<Integer> pila = new Stack<Integer>();
    Node pHead = head;
    
    int value = 0;
    
    while(pHead!=null){
        pila.push(pHead.data);
        pHead = pHead.next;
    }
    
    for(int i = 0; i<=n; i++)
        value = pila.pop();
    
    return value;

}
