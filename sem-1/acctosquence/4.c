// write a program to find sum of 3 numbers

#include <stdio.h>

void main(){
    float a,b,c;

    printf("Enter num1: ");
    scanf("%f", &a);

    printf("Enter num2: ");
    scanf("%f", &b);

    printf("Enter num3: ");
    scanf("%f", &c);

    printf("Sum: %.2f", a+b+c);
}