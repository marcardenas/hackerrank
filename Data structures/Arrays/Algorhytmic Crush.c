/*

    The instructions for this exercise are 
    custom, and doesnt mean any but develop
    the algorythm design
    
    By Marcelo Cárdenas
    
*/

#include <stdio.h>
#include <stdlib.h>

int main() {

    int N, M;
    int *arr;
    long int max = 0;
    long int x = 0; 
    
    scanf("%d %d", &N, &M);
    arr = malloc(sizeof(long int)*N);
    
    for(int i = 0; i < N; i++) *(arr+i) = 0;
    
    for(int i = 0; i < M; i++){
        int a, b, k;
        scanf("%d %d %d", &a, &b, &k);
        
        *(arr+a) += k;
        
        if(b+1 <= N)
            *(arr+b+1) -= k;
    }
    
    for(int i = 1;i <= N; i++){
       
       x = x+*(arr+i);
       if(max < x) 
           max=x;
    }
    
    printf("%ld", max);   
    return 0;
}
