// Write a program in c to display month by it's number

#include <stdio.h>

int main()
{
    char* arr[] = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    int user = 0;
    printf("Enter month in number: ");
    scanf("%d", &user);

    printf("%d is %s",  user, arr[user-1]);
    
    return 0;
}
