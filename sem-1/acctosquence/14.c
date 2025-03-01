#include <stdio.h>
#include <math.h>

void main(){
    float s1, s2, s3, s, area;

    printf("Enter side 1: ");
    scanf("%f", &s1);

    printf("Enter side 2: ");
    scanf("%f", &s2);

    printf("Enter side 3: ");
    scanf("%f", &s3);

    s = (s1+s2+s3)/2;
    double n = (s*(s-s1)*(s-s2)*(s-s3));
    area = sqrt(n);

    printf("Area of triangle: %f", area);
}