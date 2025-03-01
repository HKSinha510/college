// area of square

#include <stdio.h>

void main(){
    float s, area;

    printf("Enter side: ");
    scanf("%f", &s);

    area = s * s;
    printf("Area of Square: %.2f\n", area);
}