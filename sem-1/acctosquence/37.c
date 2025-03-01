// multiplication table

#include <stdio.h>

int main(){
    float use;

    printf("Multiplication table of: ");
    scanf("%f", &use);

    for (int i = 1; i <= 10; i++){
        printf("%.2f * %d = %.2f\n", use, i, use*i);
    }

    return 0;
}