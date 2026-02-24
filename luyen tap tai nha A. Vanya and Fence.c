#include <stdio.h>
#include <math.h>
int main(){
	int n, h;
	int count = 0, count1 = 0;
	scanf("%d %d", &n, &h);
	int a[n];
	for(int i = 0; i < n; i++){
		scanf("%d", &a[i]);
		if(a[i] > h)
		count += 2;
		else
		count1++;
	}
	int tong = count + count1;
	printf("%d", tong);
	return 0;
}