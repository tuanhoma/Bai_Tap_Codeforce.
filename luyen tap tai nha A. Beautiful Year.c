#include <stdio.h>
#include <string.h>
#include <ctype.h>
int main(){
	int n = 0, count = 0;
	int a[4];
	scanf("%s", a);
	a[4] += 26;
	first:
	for(int i = 1; i > 0; i++){
		for(int j = 0; j < 4; j++){
			for(int b = 0; b < 4; b++){
				if(a[j] != a[b])
				count++;
				if(count == 12)
				goto end;
				else
				goto first;
			}
		}
	}
	end:
		printf("%d ", a);
}