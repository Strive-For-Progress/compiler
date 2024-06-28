#include <stdio.h>
#include <math.h>
int main () {
	const int num[6] = {2, 3, 13, 121, 77, 30751};
	const int mul[3] = {7,11,13};
	/*
		Output is :
		------------------------------------------
		Number Multiple Odd/Even Square Root Prime
		------------------------------------------
		2                 Odd    1.4142     Yes!
		3                 Odd    1.7321     Yes!
		13          13,   Odd    3.6056     Yes!
		121      11,      Odd    11.0000     No!
		77     7,11,      Odd    8.7750      No!
		30751  7,         Odd    175.3596    No!
		------------------------------------------
	*/
	puts("------------------------------------------");
	puts("Number Multiple Odd/Even Square Root Prime");
	puts("------------------------------------------");
	for (int r=0 ; r<6 ; r++){	
		int test = 0, isPrime = 1;

    	for (int j=2 ; j<=sqrt(num[r]) ;j++)
    		if (num[r]%j == 0) 	isPrime = 0;

    	printf("%5d   ",num[r]);  
		
		for (int k=0 ; k<3 ;k++)  
    		if (num[r] % mul[k]==0) printf("%d,",mul[k]);
    		else printf("  ");

    	(num[r]^1)?printf("     Odd    "):printf("     Even    ");

    	printf("%.4lf ",sqrt(num[r]));

    	(isPrime)?printf("    Yes!\n"):printf("    No!\n");
	}
	puts("------------------------------------------");
	return 0;
}