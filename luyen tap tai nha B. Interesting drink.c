#include <stdio.h>
#include <math.h>
void input(int n, int a[]){
	for(int i = 0; i < n; i++){
		scanf("%d", &a[i]);
	}
}


void calculator(int n, int a[], int m, int b[]){
	for(int j = 0; j < m; j++){
		int count = 0;
		for(int i = 0; i < n; i++){
			if(b[j] >= a[i])
			count++;
		}
		printf("%d\n", count);
	}
}


int main(){
	int n, m;
	scanf("%d", &n);
	int a[n];
	
	//input
    input(n, a);
	
	
    scanf("%d", &m);
    int b[m];
    for(int i = 0; i < m; i++){
    	scanf("%d", &b[i]);
	}
	
	printf("\n");
	//calculator
	calculator(n, a, m, b);

	return 0;
}