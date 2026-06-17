#include<stdio.h>
#include<math.h>
int main(){
	int n;
	int j, tamp = 0, min = 0;
	int tong = 0;
	int c, b;
	scanf("%d", &n);
	int a[n][2];
	for(int i = 0; i < n; i++){
		for( j = 0 ; j < 2; j++){
			scanf("%d", &a[i][j]);
		}
	}
	for(int i = 0; i < n; i++){
		for( j = 1 ; j < 2; j++){
			
			tong += a[i][j];
			if(tong > min) 
			min = tong;
		}
		tong -= a[i + 1][0];
		tamp = 1;
	
	}
	printf("%d", min);
	return 0;
}