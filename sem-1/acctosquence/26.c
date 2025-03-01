// write a program using pointer to find the address and value stored by a pointer variable

#include <stdio.h>

void main(){
    int a = 10;
    int * ptr;

    ptr = &a;

    printf("Value: %d\n", *ptr);
    printf("Memory Address: %p\n", ptr);
}