#include<stdio.h>
#include<math.h>
int main(){
	int a, b;
	int x[a];
	int n;
	scanf("%d", &n);
	for(int i = 0; i < n; i++){//dung de chay tung test case
		scanf("%d", &a);
		for(int i = 0; i < a; i++){//nhap moi mang trong test case
			scanf("%d", &x[i]);
			printf("%d ", x[i]);
		}
	}
	for(int i = 0; i < n; i++){
		for(int i = 0; i < a; i++){
             x[i] - 1;
             x[i + 1]
		}
	}
	return 0;
}