// write a program to find division of two number

#include <stdio.h>

void main(){
    float a,b;

    a = 9;
    b = 3;

    if (b == 0) {
        printf("Invalid input");
        return;
    }

    printf("Quotient: %.2f", a/b);
}