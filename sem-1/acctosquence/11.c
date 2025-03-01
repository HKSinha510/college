#include <stdio.h>

void main() {
    float a, b, c;

    printf("Enter value of A: ");
    scanf("%f", &a);

    printf("Enter value of B: ");
    scanf("%f", &b);

    printf("Enter value of C: ");
    scanf("%f", &c);

    if ((a > b) && (a > c)) {
        printf("A is the largest\n");
    } else if ((b > c) && (b > a)) {
        printf("B is the largest\n");
    } else if ((c > b) && (c > a)) {
        printf("C is the largest\n");
    } else {
        printf("invalid\n");
    }

}