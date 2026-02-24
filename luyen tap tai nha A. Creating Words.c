#include <stdio.h>
#include <string.h>
#include <ctype.h>
int main(){
	int n;
	scanf("%d", &n);
	while(n > 0){
	    char a[4], b[4];
		scanf("%s %s", a, b);
			char temp = a[0];
			a[0] = b[0];
			b[0] = temp;
		printf("%s %s\n", a, b);
		n--;
	}
	return 0;
}