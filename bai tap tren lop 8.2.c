
int uoc(int n, int m){
	for(int i = 0; i < n; i++){
		if( n % i == 0)
		printf("%d", i);
	}
	for( int i = 0; i < m; i++){
		if( m % i == 0)
		printf("\n%d", i);
	}
}











#include<stdio.h>
#include<math.h>
int main(){
	int n,m;
	printf("Enter n = "), scanf("%d", &n);
	printf("Enter m = "), scanf("%d", &m);
	uoc( n, m );
	
	return 0;
}