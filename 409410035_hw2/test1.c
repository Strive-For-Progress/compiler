 void func() { printf("The result is fllowing ");}
 int main() {
    int i, even_sum=0, odd_sum= 0;
    for (i = 1; i <= 10; i = i + 1) {
        if (i % 2 == 0) {
            even_sum += i;
        }else if (i %2 == 1){
            odd_sum += i;
        }
    }
    int a = 8888;
    if (2 != -2) func();
    printf("Sum of even numbers  from 1 to 10  %d and Sum of odd numbers from 1 to 10 is %d\n", even_sum, odd_sum);
    printf("%d",a);
    return 0;
}
