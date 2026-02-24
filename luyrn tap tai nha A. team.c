#include<stdio.h>
#include <ctype.h>
#include <string.h>
#include <stdlib.h>

int main(){
	int a, b, c;
	int n;
	int tong, dem;
	scanf("%d", &n);
	for( int i = 0; i < n; i++){
	scanf("%d %d %d", &a, &b, &c);
	tong = a + b + c;
	if( tong >= 2)
	dem++;
	}
    printf("%d", dem);
	return 0;
}