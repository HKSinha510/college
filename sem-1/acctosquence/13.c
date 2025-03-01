#include <stdio.h>

void main(){
    float r, pi, area;
    pi = 3.14;

    printf("Enter radius: ");
    scanf("%f", &r);

    area = pi * r * r;

    printf("\nArea of circle: %f\n", area);
}
