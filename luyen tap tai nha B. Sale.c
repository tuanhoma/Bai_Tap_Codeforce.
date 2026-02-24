#include <stdio.h>
#include <math.h>
void input(int n, int a[]){
	for(int i = 0; i < n; i++){
		scanf("%d", &a[i]);
	}
}


void list(int n, int a[]){
	for(int i = 0; i < n - 1; i++){
		for(int j = 0; j < n - i - 1; j++){
			if(a[j] > a[j + 1]){
				int temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp; 
			}
		}
	}
}


int caculator(int n, int a[], int m){
	int count = 0;
	int sum = 0;
	for(int i = 0; i < n; i++){
		if(a[i] < 0){
			sum += a[i] * (-1);
			count++;
				if(count == m)
				break;
		}
	}
	return sum;
}


int main(){
	int n, m;
	scanf("%d %d", &n , &m);
	int a[n];
	
	//input
	input(n, a);
	
	//list
	list(n, a);
	
	//caculatot
	int result = caculator(n, a, m);
	
	printf("%d", result);
	return 0;
}