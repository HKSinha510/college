#include <stdio.h>
#include <math.h>

void main() {
    float eng, mat, hin, sci, sst, agg, per;

    printf("Enter your english marks: ");
    scanf("%f", &eng);

    printf("Enter your mathematics marks: ");
    scanf("%f", &mat);

    printf("Enter your hindi marks: ");
    scanf("%f", &hin);

    printf("Enter your science marks: ");
    scanf("%f", &sci);

    printf("Enter your social science marks: ");
    scanf("%f", &sst);

    agg = eng + mat + hin + sci + sst;

    per = agg / 5;

    if (per > (0.3 * 100)) {
        printf("\nStudent passed with %f percent\n", per);
    } else {
        printf("\nStudent failed with %f percent\n", per);
    }
}