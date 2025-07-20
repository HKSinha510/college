// write a prrogram to find the square root of a number

#include <stdio.h>
#include <math.h>

int main()
{
    int user = 0;
    printf("Enter a number: ");
    scanf("%d", &user);

    printf("%f", pow(user, 0.5));

    return 0;
}
