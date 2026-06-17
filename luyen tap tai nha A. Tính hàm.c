#include<stdio.h>
#include<math.h>
int main(){
	int n, tong = 0;
	scanf("%d", &n);
	for(int i = 1; i <= n; i++){
		tong += pow(-1,i) * i;
	}
	printf("%d", tong);
	return 0;
}