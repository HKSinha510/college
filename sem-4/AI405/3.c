#include <stdio.h>

int factorialIter(int f) {
    if (f < 0) {
        return -1;

    }
    
    int fac = 1;

    for (int i = f; i > 0; i--){
        fac = fac*i;

    }

    return fac;
}

int factorialRec(int f) {
    if (f < 0) {
        return -1;

    } else if (f < 1) {
        return 1;

    } else {
        return f * factorialRec(f-1);

    }
}


int main() {

    int num;

    printf("Enter a number: ");
    printf("%d", factorialIter(-1));

    return 0;
}
