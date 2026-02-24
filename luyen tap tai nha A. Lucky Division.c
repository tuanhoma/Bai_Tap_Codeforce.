#include <stdio.h>
#include <math.h>
int main(){
	int n;
	int c[] = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};
	int a[5] = {'7', '4'};
	scanf("%d", &n);
	for(int i = 0; i < 14; i++){
		if(n % c[i] == 0){
			printf("YES");
			goto end;
		}
	}
	printf("NO");
	end:
	return 0;
	
}