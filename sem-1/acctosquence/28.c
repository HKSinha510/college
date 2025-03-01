// write a program to print the value of number of days in a week using enum

#include <stdio.h>

int main(){
    enum week {monday, tuesday, wednesday, thursday, friday, saturday, sunday};
    enum week day;
    day = wednesday;

    printf("day: %d", day);

    return 0;
}