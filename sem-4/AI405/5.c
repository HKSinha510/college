#include <stdio.h>
#include <stdbool.h>

bool checkDiv(int a) {
    double sv, num;

    sv = a / 5;
    num = sv * 5;
    

    if (a == num){
        return 1;

    } else {
        return 0;

    }
}

int main() {
    printf("%d", checkDiv(10));
    

    return 0;
}