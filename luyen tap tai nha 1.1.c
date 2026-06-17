#include<stdio.h>
int main(){
	int i, j;
	int n, m;
	scanf("%d%d", &n, &m);
	int a[n][m];
	int s = 0;
	for( i = 0; i < n; i++){
		for( j = 0; j < m; j++){
			scanf("%d", &a[i][j]);
		}
	}
	printf("\n");
	for( i = 0; i < m; i++){
		for( j = 0; j < n; j++){
			s += a[j][i];
		}
		printf("\n%d", s);
	}
	return 0;
}