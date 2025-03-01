#include <stdio.h>

void main(){
    int fibarr[10] = {};

    for (int i=0; i < 10; i++){
        if (i == 0) {
            fibarr[i] = 0;
        } else if (i == 1) {
            fibarr[i] = 1;
        } else {
            fibarr[i] = fibarr[i-1]+fibarr[i-2];
        }
    }

    for (int i=0; i < 10; i++){
        printf("%d\n", fibarr[i]);
    }
}