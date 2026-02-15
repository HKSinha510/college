#include <stdio.h>

int main() {
    long long bin, original;
    int decimal = 0, base = 1, digit;
    
    printf("Enter a binary number: ");
    scanf("%lld", &bin);
    
    original = bin;  // Store original for display
    
    // Convert binary to decimal
    while (bin > 0) {
        digit = bin % 10;        // Extract last digit
        decimal = decimal + digit * base;  // Add to result
        base = base * 2;         // Update base (1, 2, 4, 8, 16...)
        bin = bin / 10;          // Remove last digit
    }
    
    printf("Binary %lld = Decimal %d\n", original, decimal);
    
    return 0;
}