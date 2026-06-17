#include <stdio.h>
#include <math.h>
void input(int t, int a[3]){
	while(t > 0){
		for(int i = 0; i < 3; i++){
			scanf("%d", &a[i]);
		}
		t--;
	}
}


void sum(int t, int a[3]){
	while(t > 0){
		int max = 0;
		int tong = 0;
		for(int i = 0; i < 3; i++){
			scanf("%d", &a[i]);
			if(max < a[i])
			max = a[i];
			tong += a[i];
		}
		int tamp = tong - max;
		if(tamp == max)
		printf("YES\n");
		else
		printf("NO\n");
		t--;
	}
}


int main(){
	int t;
	scanf("%d", &t);
	int a[3];

	//main
	sum(t, a);
	
	return 0;
}