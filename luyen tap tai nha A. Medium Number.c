#include <stdio.h>
#include <math.h>
void calculator(int t){
	while(t > 0){
		int a[3];
		int max = 0;
		int min = 100000;
		for(int i = 0; i < 3; i++){
			scanf("%d", &a[i]);
		}
		
		
		int sum = 0;
		for(int i = 0; i < 3; i++){
			if(max < a[i])
			max = a[i];
			if(min > a[i])
			min = a[i];
			sum += a[i];
		}
		
		
		int medium = sum - max - min;
		printf("%d\n", medium);
		t--;
	}
}




int main(){
	int t;
	scanf("%d", &t);
	
	//calculator
	calculator(t);
	
	return 0;
}