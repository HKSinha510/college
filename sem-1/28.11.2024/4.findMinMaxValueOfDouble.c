#include <stdio.h>
#include <float.h>

void main(){
    double min, max;

    min = DBL_MIN;
    max = DBL_MAX;

    printf("Minimum value of double: %e\n", min);
    printf("Maximum value of double: %e\n", max);

}