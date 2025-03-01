#include <stdio.h>

void main() {
    float a, b, sm, avg;

    printf("Enter num1: ");
    scanf("%f", &a);

    printf("Enter num2: ");
    scanf("%f", &b);

    sm = a + b;

    avg = sm/2;

    printf("\nSum: %f\nAverage: %f", sm, avg);

}