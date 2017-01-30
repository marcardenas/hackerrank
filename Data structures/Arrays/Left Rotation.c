/*

    This code performs d left-rotations of an 1D
    array. The algorythm was improved, so you can
    perform operations with large arrays
    
    By Marcelo Cárdenas
    
*/

#include <stdio.h>
#include <stdlib.h>

void shiftLeft(int *arr, int n, int d);

int main() {

    int n, d;
    int *arr;
    
    arr = malloc(sizeof(int)*n);
    
    scanf("%d %d", &n, &d);
    
    for(int i = 0; i < n; i++)
        scanf("%d", (arr+i));

    shiftLeft(arr, n, d);
    
    for(int i = 0; i < n; i++)
        printf("%d ", *(arr+i));
    
    return 0;
}

void shiftLeft(int *arr, int n, int d){
    
    int *temp = malloc(sizeof(int) * d);
    
    /* Copy the first d elements on a temporal array */
    
    for(int i = 0; i < d; i++)
        *(temp+i) = *(arr+i);
    
    /* Shift the remaining n-d elements d times to the left */
    
    for(int i = 0; i < n - d; i++)
        *(arr + i) = *(arr+i+d);
    
    /* Paste the temporal array content on the ending of the array */
    
    for(int i = n-d; i < n; i++)
        *(arr+i) = *(temp + i-n+d);
}

