#include <stdio.h>
#include <ctype.h>
#include <string.h>
#include <stdlib.h>
int main(){
	int count = 0;
	char a[101];
	char b[101];
	scanf("%s", a);
	scanf("%s", b);
	for(int i = strlen(a) - 1, j = 0; i >= 0, j < strlen(b)  ; i--, j++){
		if( a[i] == b[j])
		count++;
	}
	if( count == strlen(a) && count == strlen(b))
	printf("YES");
	else
	printf("NO");
	
	return 0;
	
}