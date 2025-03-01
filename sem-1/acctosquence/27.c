// write program to find sum of two numbers using function 

#include <stdio.h>

float sum(float a, float b){
    return a+b;
}

int main(){
    float num1, num2;

    num1 = 24.1;
    num2 = 43.1;

    printf("Sum of two number: %.2f", sum(num1, num2));

    return 0;
}