int main() {
    int num1, num2, num3, largest;
    do {
        printf("Enter three numbers: ");
        scanf("%d %d %d", &num1, &num2, &num3);
        largest = num1;
        if (num2 >= largest) {
            largest = num2;
        }
        if (largest <= num3 ) {
            largest = num3;
        }
        printf("The largest number is %d\n", largest);
    }while(2 != 3);

    return 0;
}
