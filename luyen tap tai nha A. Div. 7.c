#include<stdio.h>
#include<math.h>
int main(){
	int n;
	scanf("%d", &n);
	int a;
	for(int i = 0; i < n; i++){
		scanf("%d", &a);
	int up = a, down = a;
		while(1){
			if( up % 7 == 0){
				printf("%d\n", up);
				break;
			}
	
			if( down % 7 == 0){
				if(down < 10)
				goto firt;
				printf("%d\n", down);
				break;
			}
			firt:
			up++;
			down--;	
		}
	}
    return 0;
}