// Write a program to compare three numbers and find the second largest no.
// write a program to compare n number and find the second largest no. 

#include <stdio.h>

int main() {
    int arr[60] = {0};
    int user, a = 0, b = 0;

    printf("Enter number of n: ");
    scanf("%d", &user);

    for (int i = 0; i < user; i++){
        printf("Enter value for index %d: ", i);
        int t = 0;
        scanf("%d", &t);
        arr[i] = t;

        if (a < t){
            b = a;
            a = t;
        }
    }

    printf("\n%d is the largest number\n", a);
    printf("%d is the second largest number", b);

    return 0;
}


