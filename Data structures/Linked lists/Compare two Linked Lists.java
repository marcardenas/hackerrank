/*
  
    This code allows to compare two linked lists A and B
    Return 1 if they are identical and 0 if they are not. 
    
    -- Class node is already declared and defined
  
    By Marcelo Cárdenas    
    
*/

int CompareLists(Node headA, Node headB) {
    Node pHeadA, pHeadB;
    int data_a;
    int data_b;
    pHeadA = headA;
    pHeadB = headB;
    
    while(pHeadA!=null&&pHeadB!=null){
        data_a = pHeadA.data;
        data_b = pHeadB.data;
        if(data_a!=data_b){
            return 0;
        }
        else{
            pHeadA = pHeadA.next;
            pHeadB = pHeadB.next;
        }
        
    }
    if(pHeadA==null&&pHeadB!=null)
        return 0;
    if(pHeadA!=null&&pHeadB==null)
        return 0;
    return 1;
  
}
