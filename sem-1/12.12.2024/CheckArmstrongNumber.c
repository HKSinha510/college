#include <stdio.h>
#include <math.h>

void main(){
    // check whether the entered number(3 digit) is armstrong or not
    int arm_in, arm_out;
    printf("Enter a three digit number: ");
    scanf("%d", &arm_in);

    int a,b,c;
    a = arm_in / 100;
    b = (arm_in % 100) / 10;
    c = arm_in % 10;

    arm_out = pow(a, 3) + pow (b, 3) + pow(c, 3);
    
    if (arm_in == arm_out) {
        printf("%d is an armstrong number.\n", arm_in);
    } else {
        printf("%d is a not an armstrong number.\n", arm_out);
    }
}