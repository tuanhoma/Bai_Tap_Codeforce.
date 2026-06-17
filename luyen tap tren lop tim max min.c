#include<stdio.h>
#include<math.h>
#include<ctype.h>
#include<string.h>
#include<stdlib.h>
void max(int n, int max = 0)





int main(){
	int n, max = 0, min = 100000000;
	int x;
	scanf("%d", &n);
	int a[n];
	for(int i = 0; i < n; i++){
		scanf("%d", &a[i]);
		if(max < a[i])
		max = a[i];
		
	}
	printf("x = "), scanf("%d", &x);
	for(int i = 0; i < n; i++){
		ptintf("%d ", a[i]);
		if(max < a[i])
		max = a[i];
		
	}
	for(int i = 0; i < n; i++){
		if(min > a[i])
		min = a[i];
	}
	printf("\nmax = %d", max);
	printf("\nmin = %d", min);
	printf("\nx = %d", x);
	
	return 0;
}