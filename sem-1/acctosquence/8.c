#include <stdio.h>

void main() {
    float p, r, t, si;

    printf("Enter principle: ");
    scanf("%f", &p);

    printf("Enter rate: ");
    scanf("%f", &r);

    printf("Enter time period: ");
    scanf("%f", &t);

    si = (p*r*t)/100;

    printf("\nSimple Interest: %f\n\n", si);

}