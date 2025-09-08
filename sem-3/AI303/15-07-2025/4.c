
// Uses array, more memory 🤮
#include <stdio.h>

int main() {
    int arr[] = {0, 3, 56, 56, 8, 41, 2, 2};
    int a = 0, b = 0;
    int len_arr = sizeof(arr) / sizeof(arr[0]);

    for (int i = 0; i < len_arr; i++){
        int t = arr[i];

        if (t > a){
            b = a;
            a = t;
        } else if (t > b && t != a){
            b = t;
        }
    }

    printf("\n%d is the largest number\n", a);
    printf("%d is the second largest number", b);

    return 0;
}


// First attempt, original
#include <stdio.h>

int main() {
    int arr[60] = {0};
    int user, a = 0, b = 0;

    printf("Enter number of n: ");
    scanf("%d", &user);

    for (int i = 0; i < user; i++){
        printf("Enter value for index %d: ", i);
        int t = 0;
        scanf("%d", &t);
        arr[i] = t;

        if (t > a){
            b = a;
            a = t;
        } else if (t > b && t != a){
            b = t;
        }
    }

    printf("\n%d is the largest number\n", a);
    printf("%d is the second largest number", b);

    return 0;
}