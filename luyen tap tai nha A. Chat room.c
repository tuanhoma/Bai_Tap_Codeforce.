#include<stdio.h>
#include<math.h>
#include <string.h>
#include <stdlib.h>
#include <ctype.h>
int main(){
	int n;
	char a[100];
	scanf("%s", a);
	char b[] = "hello";//khai bao san chuoi ki tu "hello"
	int j = 0;
	for(int i = 0; i < strlen(a); i++){
		if(a[i] == b[j])
		j++;
	}
		if(j == 5)
		printf("YES");
		
		else
		printf("NO");

	return 0;
}