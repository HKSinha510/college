// find perimeter of circle, square, rectangle & triangle

#include <stdio.h>

float circle(){
    float pi, rad;
    
    pi = 3.14;

    printf("Enter radius") ;
    scanf("%f", &rad);

    return 2*pi*rad;
}

float square(){
    float s;

    printf("Enter side: ");
    scanf("%f", &s);

    return 4*s;
}

float rectangle(){
    float l, b;

    printf("Enter length: ");
    scanf("%f", &l);

    printf("Enter breadth: ");
    scanf("%f", &b);

    return 2*(l+b);
}

float triangle(){
    float b, h;

    printf("Enter base: ");
    scanf("%f", &b);

    printf("Enter height: ");
    scanf("%f", &h);

    return 0.5*b*h;
}

void main(){
    int user;

    printf("Enter the number for perimeter of following shapes:\n\
    1. Circle\n\
    2. Square\n\
    3. Rectangle\n\
    4. Triangle\n\n\
    Choice: ");
    scanf("%d", &user);

    switch (user)
    {
    case 1:
        printf("Perimeter of circle: %f", circle());
        break;

    case 2:
        printf("Perimeter of square: %f", square());
        break;

    case 3:
        printf("Perimeter of rectangle: %f", rectangle());
        break;

    case 4:
        printf("Perimeter of triangle: %f", triangle());
        break;
    
    default:
        printf("i");
        break;
    }
}