#include <stdio.h>
#include <math.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h>
int main(){
	int t;
	char b[] = "codeforces";
	scanf("%d", &t);
	getchar();
	while(t > 0){
	char a;
	scanf("%c", &a);
	getchar();
	if(a == 'c' || a == 'o' || a == 'd' || a == 'e' || a == 'f' || a == 'o' || a == 'r' || a == 'c' || a == 'e' || a == 's')
	printf("YES\n");
	else
	printf("NO\n");
	t--;
    }
    return 0;
}