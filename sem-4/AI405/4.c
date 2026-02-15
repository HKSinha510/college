#include <stdio.h>

void tempVar(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;

}

void usingMath(int *a, int *b) {
    *a = *a + *b;
    *b = *a - *b;
    *a = *a - *b;

}

void usingBitwise(int *a, int *b) {
    *a = *a ^ *b;
    *b = *a ^ *b;
    *a = *a ^ *b;

}


int main() {
    int a, b;

    printf("Enter num1: ");
    scanf("%d", &a);

    printf("Enter num2: ");
    scanf("%d", &b);


    printf("\nOriginal Values: %d %d\n", a, b);

    printf("\nValues swapped using:\n");
    tempVar(&a, &b);
    printf("temporary variable: %d %d\n", a, b);

    usingMath(&a, &b);
    printf("arithmetics operations: %d %d\n", a, b);

    usingBitwise(&a, &b);
    printf("XOR operator: %d %d\n", a, b);

    return 0;
}