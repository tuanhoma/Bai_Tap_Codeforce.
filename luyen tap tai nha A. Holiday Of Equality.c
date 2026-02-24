#include <stdio.h>
#include <math.h>
void input(int n, int a[]){
	for(int i = 0; i < n; i++){
		scanf("%d", &a[i]);
	}
}



int max_number(int n, int a[]){
	int max = 0;
	for(int i = 0; i < n; i++){
		if(max < a[i])
		max = a[i];
	}
	return max;
}



int calculator(int n, int a[]){
	int max = max_number(n, a);
	int sum = 0;
	for(int i = 0; i < n; i++){
		if(max > a[i])
		sum += max - a[i];
	}
	return sum;
}



int main(){
	int n;
	scanf("%d", &n);
	int a[n];
	
	//input
	input(n, a);
	
	//max
	max_number(n, a);
	
	//calculator
	int result = calculator(n, a);
	printf("%d", result);
	
	return 0;
}