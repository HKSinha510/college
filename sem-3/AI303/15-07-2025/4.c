#include <stdio.h>

int main() {
    int arr[5] = {0,8,3,56,2};
    int a = 0, b = 0;

    for (int i = 0; i < 5; i++){
        if (a < arr[i]){
            b = a;
            a = arr[i];
        }
    }

    printf("\n%d is the largest number\n", a);
    printf("%d is the second largest number", b);

    return 0;
}