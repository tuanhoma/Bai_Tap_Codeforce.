#include<stdio.h>
#include<math.h>
#include<stdlib.h>
#include<ctype.h>
#include<string.h>
int main(){
	char a[101];
	char b[101];
	char c[101];

	scanf("%s", a);

	scanf("%s", b);


	for(int i = 0, j = 0; i < strlen(a); i++, j++){
		if(a[i] != b[j])
		c[i] = '1';
		else
		c[i] = '0';
		
	}
	for(int i = 0; i < strlen(a); i++)
	printf("%c", c[i]);
	return 0;
	
	
}