// binary to decimmal and decimal to binary

#include <stdio.h>

int BtoD(long binary){
    int dec = 0;

    int base = 1;

    while (binary){
        int last = binary % 10;

        binary /= 10;
        dec += last * base;
        base *= 2;
    }

    return dec;
}

int DtoB(int decimal){
    int bin = 0;

    int rem, i = 1;

    while (decimal != 0) {
        rem = decimal % 2;
        
        decimal /= 2;
        bin += rem * i;
        
        i *= 10;
    }
    return bin;
}

int main(){
    long binary = 1100011;
    int decimal = 83;

    printf("%d in decimal is %d\n", binary, BtoD(binary));
    printf("%d in binary is %d", decimal, DtoB(decimal));


    return 0;
}
