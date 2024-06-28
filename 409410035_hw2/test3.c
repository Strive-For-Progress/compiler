int main() {
    int n, i, j;
    while (1) {
        printf("Enter the number of rows: ");
        scanf("%d", &n);
        for (i = 1; i <= n; i+=1) {
            for (j = 1; j <= i; j+=1) {
                printf("%d ",i+j);
            }
            printf("\n");
        }
    }
    return 0;
}
