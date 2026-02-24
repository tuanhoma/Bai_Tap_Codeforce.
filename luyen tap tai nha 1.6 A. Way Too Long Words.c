#include<stdio.h>
#include<string.h>
#include<ctype.h>
#include<stdlib.h>
int main(){
	char  a[101];
	int n;
	scanf("%d", &n);
	getchar();
	for( int i = 0; i < n; i++){
		scanf("%s", a);
		if(strlen(a) > 10){
	printf("%.1s", a);
	printf("%d", strlen(a) - 2);
	for(int i = 0; i <= strlen(a) - 1; i++){
		if( i == strlen(a) - 1)
		printf("%c\n", a[i]);
	}
}
	else
	printf("%s\n", a);
    }
	return 0;
}