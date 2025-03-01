#include <stdio.h>
#include <limits.h>

void main(){
    int min, max;
    
    min = CHAR_MIN;
    max = CHAR_MAX;

    printf("Minimum value of char: %d\n", min);
    printf("Maximum value of char: %d\n", max);
}