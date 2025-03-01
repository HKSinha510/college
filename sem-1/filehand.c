#include <stdio.h>
#include <stdlib.h>

int main(){
    FILE* fp;

    fp = fopen("tet.txt", "w");

    if (fp == NULL){
        printf("lol, lmfao");
        exit(0);

    } else {
        fputs("Hello, my name is Hardik Kumar Sinha", fp);

    }

    return 0;
}