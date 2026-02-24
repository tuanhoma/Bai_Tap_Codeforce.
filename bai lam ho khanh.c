#include <stdio.h>
#include <math.h>
int main(){
	int n;
	scanf("%d", &n);
	int temp = n;
	for(int i = 1; i <= n; i++){
		for(int j = 1; j <= temp; j++){
			if(j < temp || i == n )
			printf(" ");
			else
			printf("*");
		}
		temp--;
		printf("\n");
	}
	return 0;
}

