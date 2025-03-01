// write a program to calculate factorial of a number

#include <stdio.h>

int main(){
    float user, a, fac;

    printf("Enter a number: ");
    scanf("%f", &user);
    
    fac = 1;

    while (user > 1){
        fac *= user;
        user--;
    }
    printf("\nFactorial of %.2f is %.2f", a, fac);

    return 0;
}