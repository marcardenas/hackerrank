/*

    This code get the maximum possible value
    from a matrix with a hourglass-shaped cells
    
    By Marcelo Cárdenas

*/

#include <stdio.h>

int main(){
    int arr[6][6];
    for(int arr_i = 0; arr_i < 6; arr_i++){
       for(int arr_j = 0; arr_j < 6; arr_j++){
          
          scanf("%d",&arr[arr_i][arr_j]);
       }
    }
    
    /* We take the values from a virtual HG template */
    
    int j, k;
    int max = -999999999;
    
    for(j = 0; j < 4; j++){
        for(k = 0; k < 4; k++){
            int sum = 0;
            int values[] = {arr[j][k], arr[j][k+1], arr[j][k+2], arr[j+1][k+1],
                            arr[j+2][k], arr[j+2][k+1], arr[j+2][k+2]};
            for(int t = 0; t < 7; t++){
                
                sum += values[t];
            }
            
            if(sum>max)
                max = sum;            
        }
    }
    
    printf("%d",max);
    
    return 0;
}

