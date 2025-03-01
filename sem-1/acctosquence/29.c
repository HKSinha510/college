// write a program to find the roots of equation ax^2 + bx + c = 0

#include <stdio.h>
#include <math.h>

int main(){
    float a, b, c, s, root1, root2;

    printf("Equation: ax^2 + bx + c = 0\n");

    printf("Enter the value of a: ");
    scanf("%f", &a);

    printf("Enter the value of b: ");
    scanf("%f", &b);

    printf("Enter the value of c: ");
    scanf("%f", &c);

    s = sqrt((b*b) - (4*a*c));
    root1 = (s-b)/(2*a);
    root2 = (-b-s)/(2*a);

    printf("\nRoots of the equations are: %.2f, %.2f", root1, root2); 

    return 0;
}