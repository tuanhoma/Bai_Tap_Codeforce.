#include <stdio.h>
#include <math.h>
int move(int a, int b){
	int tamp = a % b;
	if(tamp == 0){
		return 0;
	} else{
		return b - tamp;
	}
}





int main(){
	int t, count = 0;
	int a, b;
	scanf("%d", &t);
	while(t--){
		scanf("%d %d", &a, &b);
		printf("%d\n", move(a, b));
	}
	return 0;
}