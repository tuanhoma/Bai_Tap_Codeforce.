#include<stdio.h>
#include<math.h>
#include <ctype.h>
#include <string.h>
#include <stdlib.h>
int main(){
	int n;
	int count = 0, count1 = 0;
	scanf("%d", &n);
	char a[n];
	scanf("%s", a);
	for( int i = 0; i < strlen(a); i++){
		if( a[i] == 'D')
		count++;
		else
		count1++;
	}
	if(count > count1)
	printf("Danik");
	else if(count < count1)
	printf("Anton");
	else
	printf("Friendship");
	return 0;
}