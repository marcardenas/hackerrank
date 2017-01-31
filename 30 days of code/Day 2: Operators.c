/*

    Fundamental programming skills, no
    need to explain
    
    By Marcelo Cárdenas
    
*/

#include <stdio.h>

int main() {

    double mealCost;
    int tipPercent,  taxPercent;
    float tip, tax;
    double total;
    scanf("%lf", &mealCost);
    scanf("%d", &tipPercent);
    scanf("%d", &taxPercent);
    
    tip = mealCost * tipPercent/100.0;
    tax = mealCost * taxPercent/100.0;
    total = mealCost + tip + tax;
    
    
    total = round(total);
    
    printf("The total meal cost is %d dollars.", (int)total);
    return 0;
}
