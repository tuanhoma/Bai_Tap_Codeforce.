#include <ctype.h>
#include <string.h>
#include <stdlib.h>
#include <stdio.h>
int main(){
	char a[1001];
	scanf("%s", a);
		a[0] = toupper(a[0]);
	printf("%s", a);
	return 0;
}