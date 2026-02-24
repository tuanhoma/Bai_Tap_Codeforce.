#include <stdio.h>
#include <math.h>
#include <string.h>
int main(){
	char a[] = "codeforces";
	int t;
	scanf("%d", &t);
	while(t > 0){
		char b[11];
		scanf("%s", b);
		int sum = 0;
	    for(int i = 0; i < strlen(a); i++){
	    	if(b[i] != a[i]){
	    		sum++;
			}
		}
		printf("%d\n", sum);
		t--;
	}
    return 0;
}