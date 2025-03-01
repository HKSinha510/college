#include <stdio.h>

void main() {
    float a, b, c, sm, avg;

    printf("Enter num1: ");
    scanf("%f", &a);

    printf("Enter num2: ");
    scanf("%f", &b);

    printf("Enter num3: ");
    scanf("%f", &c);

    sm = a + b + c;

    avg = sm/3;

    printf("\nSum: %f\nAverage: %f", sm, avg);

}