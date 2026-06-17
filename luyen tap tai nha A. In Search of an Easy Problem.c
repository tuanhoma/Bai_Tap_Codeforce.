#include<stdio.h>
#include<math.h>
int main(){
	int n, a;
	int count = 0, count1 = 0 ;
	scanf("%d", &n);
	for(int i = 0; i < n; i++){
		scanf("%d", &a);
		if( a == 0)
		count += 0;
		else
		count1 += 1;
	}
	int tong = count + count1;
	if(tong == 0)
	printf("EASY");
	else
	printf("HARD");
	return 0;
}