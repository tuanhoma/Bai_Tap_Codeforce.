#include<stdio.h>
#include<math.h>
int main(){
	int n, count = 1;//dat count tu 1 de mac dinh la co 1 nhom
	scanf("%d", &n);
	int a[n];
	for(int i = 0; i < n; i++){
		scanf("%d", &a[i]);	
	}
	for(int i = 0, j = 1; i,j < n; i++, j++){
		if(a[i] != a[j])
		count++;//tim xem co bao nhieu nhom
	}
	printf("%d", count);
	return 0;
}