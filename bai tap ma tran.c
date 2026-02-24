#include<stdio.h>
int main(){
	int n, m, i, j;
	int count;
	scanf("%d %d", &n, &m);
	int a[n][m];
	for(  i = 0; i < n; i++){
		for(  j = 0; j < m; j++){
			scanf("%d", &a[i][j]);
		}
	}
	for(  i = 0; i < n; i++){
		for(  j = 0; j < m; j++){
			   count += a[i][j];
		}
		printf("%d", count);
		printf("\n");
	}
	return 0;
	
}