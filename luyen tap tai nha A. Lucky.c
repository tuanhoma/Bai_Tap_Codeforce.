#include <stdio.h>
#include <math.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h>
void input(int t, char a[]){
	while(t > 0){
		scanf("%s", a);
		int sum = 0;
		int sum1 = 0;
		for(int i = 0; i < 3; i++){
			sum += a[i] - '0';// dung de tu ki tu chuyen ve so nguyen
			sum1 += a[i + 3] - '0';
		}
		if(sum == sum1)
		printf("YES\n");
		else
		printf("NO\n");
		t--;
	}
}




int main(){
	char a[6];
	int t;
	scanf("%d", &t);
	
	//input
	input(t, a);
	return 0;
}