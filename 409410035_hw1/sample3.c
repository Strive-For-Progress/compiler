#include <stdio.h>

int main() {
    int a = 5; // 0101 in binary
    int b = 3; // 0011 in binary

    // Bitwise AND
    int c = a & b; // 0001 in binary
    printf("a & b = %d\n", c);

    // Bitwise OR
    int d = a | b; // 0111 in binary
    printf("a | b = %d\n", d);

    // Bitwise XOR
    int e = a ^ b; // 0110 in binary
    printf("a ^ b = %d\n", e);

    // Bitwise NOT
    int f = ~a; // 1010 in binary (2's complement)
    printf("~a = %d\n", f);

    // Left shift
    int g = a << 1; // 1010 in binary (shifted left by 1)
    printf("a << 1 = %d\n", g);

    // Left shift and assign
    a <<= 1; // Shift a left by 1 and assign the result to a
    printf("a after <<=: %d\n", a);

    // Right shift
    int h = a >> 1; // 0101 in binary (shifted right by 1)
    printf("a >> 1 = %d\n", h);

    return 0;
}
