#include <stdio.h>
#include <math.h>
int main(){
	int t, count = 0;
	int a, b;
	scanf("%d", &t);
	while(t--){
		scanf("%d %d", &a, &b);
		first:
		for(int i = 1; i > 0; i++){
			if(a % b != 0){
				count++;
			}
		
			if (a % b == 0){
				printf("%d\n", count);
				count = 0;
				break;
			}
			a++;
		}
	}
	return 0;
}