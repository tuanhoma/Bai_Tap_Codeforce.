#include <stdio.h>
#include <math.h>
#include <string.h>
int main(){
	int a1, a2, a3, a4;
	int sum = 0;
	scanf("%d %d %d %d", &a1, &a2, &a3, &a4);
	char e[1000000];
	scanf("%s", e);
	for(int i = 0; i < strlen(e); i++){
		if(e[i] == '1')
		    sum += a1;
		else if(e[i] == '2')
		    sum += a2;
		else if(e[i] == '3')
		    sum += a3;
		else if(e[i] == '4')
		    sum += a4;
	}
	printf("%d", sum);
	return 0;
}