// write a program using structure to print the empolyee id and name

#include <stdio.h>

void main(){
    struct Emp{
        char* id;
        char* name;
    };

    struct Emp E1;
    E1.id = "dev2";
    E1.name = "utkarsh";

    printf("Employee 1:\nid: %s\nname: %s", E1.id, E1.name);   
}