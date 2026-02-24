#include<stdio.h>
#include<math.h>
#include<ctype.h>
#include<string.h>
#include<stdlib.h>
int main(){
	char a[100];
	int max = 0;
	scanf("%s", a);
	for( int i = 0; i < strlen(a); i++){
		if( a[strlen(i)] <= 1)
		printf("%c", a[strlen(i)]);
		printf("+");
	}
}