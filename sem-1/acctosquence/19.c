// fibonacci series

#include <stdio.h>

void main(){
    int user;

    printf("Enter n: ");
    scanf("%d", &user);

    int fibarr[100] = {};

    for (int i=0; i < user; i++){
        if (i == 0) {
            fibarr[i] = 0;

        } else if (i == 1) {
            fibarr[i] = 1;

        } else {
            fibarr[i] = fibarr[i-1]+fibarr[i-2];
        }
    }

    for (int i=0; i < user; i++){
        printf("%d\n", fibarr[i]);
    }
}

