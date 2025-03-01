#include <stdio.h>
#include <float.h>

void main(){
    float min, max;

    min = FLT_MIN;
    max = FLT_MAX;

    printf("Minimum value of Float: %e\n", min);
    printf("Maximum value of Float: %e\n", max);
}