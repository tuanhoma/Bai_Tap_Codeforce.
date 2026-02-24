#include<stdio.h>
#include <ctype.h>
#include <string.h>
#include <stdlib.h>
int main(){
	int x = 0;
	int n;
	char c[5];
	scanf("%d", &n);
	for( int i = 0; i < n; i++){
		scanf("%s", c);
	if( c[1] == '+'){
		x++;
	}
	else if( c[1] == '-'){
		x--;
	}
}
    printf("%d", x);
	return 0;

}
