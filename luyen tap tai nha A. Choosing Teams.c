#include <stdio.h>
#include <math.h>
void input(int n, int a[]){
	for(int i = 0; i < n; i++){
		scanf("%d", &a[i]);
	}
}


int caculator(int n, int a[], int k){
	int sum = 0;
	for(int i = 0; i < n; i++){
		if(a[i] + k <= 5)
		sum++;
	}
	return sum / 3;
}



int main(){
	int n, k;
	scanf("%d %d", &n, &k);
	int a[n];
	
	//input
	input(n, a);
	
	//caculator
	int result = caculator(n, a, k);
	
	printf("%d", result);
	
	return 0;
}