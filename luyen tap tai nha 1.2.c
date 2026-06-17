#include<stdio.h>
int main(){
	int t;
	int n, m;
	scanf("\n%d %d", &n, &m);
	int a[n][m];
	for( int i = 0; i < n; i++){
		for( int j = 0; j < m; j++){
			scanf("%d", &a[i][j]);
		}
	}
	printf("\n");
	for( int i = 0; i < n; i++){
		for( int j = 0; j < m; j++){
			if( a[i][j] == 2 || a[i][j] % 2 != 0){
			printf("%d ", a[i][j]);}
		}
	}
	printf("\n");
	for( int i = 0; i < n; i++){
		for( int j = 0; j < m; j++){
			if( a[j][i] == 2 || a[j][i] % 2 != 0){
			printf("%d ", a[j][i]);}
		}
	}
	return 0;
}