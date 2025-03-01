// find the smallest of 3 number

#include <stdio.h>

void main() {
    float a, b, c;

    printf("Enter value of A: ");
    scanf("%f", &a);

    printf("Enter value of B: ");
    scanf("%f", &b);

    printf("Enter value of C: ");
    scanf("%f", &c);

    if ((a < b) && (a < c)) {
        printf("\nA is the smallest\n");

    } else if ((b < c) && (b < a)) {
        printf("\nB is the smallest\n");

    } else if ((c < b) && (c < a)) {
        printf("\nC is the smallest\n");

    } else {
        printf("invalid\n");
    }
}