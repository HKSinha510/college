// area of rectangle

#include <stdio.h>

void main(){
    float l, b, area;

    printf("Enter length: ");
    scanf("%f", &l);

    printf("Enter breadth: ");
    scanf("%f", &b);

    area = l * b;
    printf("Area of Rectangle: %.2f\n", area);
}