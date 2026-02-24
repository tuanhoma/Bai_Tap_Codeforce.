#include <stdio.h>
#include <math.h>
int main(){
	int n;
	int count = 0;
	scanf("%d", &n);
	int a[n][2];
	for(int i = 0; i < n; i++){
		for(int j = 0; j < 2; j++){
			scanf("%d", &a[i][j]);
		}
	}
	
	for(int i = 0; i < n; i++){
		for(int j = 0; j < n ; j++){
			if( a[i][0] == a[j][1])
			count++;
		}
	}
	printf("%d", count);
	return 0;
}