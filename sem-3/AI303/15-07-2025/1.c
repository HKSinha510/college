// Write a program to compare three numbers and find the second largest no.

#include <stdio.h>

int main()
{
    int num1, num2, num3;

    printf("Enter num1: ");
    scanf("%d", &num1);

    printf("Enter num2: ");
    scanf("%d", &num2);

    printf("Enter num3: ");
    scanf("%d", &num3);

    if (((num1 > num2) && (num1 < num3)) || ((num1 > num3) && (num1 < num2))) {
        printf("%d is second largest number", num1);

    } else if (((num2 > num1) && (num2 < num3)) || ((num2 > num3) && (num2 < num1))) {
        printf("%d is second largest number", num2);

    } else if (((num3 > num1) && (num3 < num2)) || ((num3 > num2) && (num3 < num1))) {
        printf("%d is second largest number", num3);

    } else {
        printf("Logic Error");

    }
    
    return 0;
}
