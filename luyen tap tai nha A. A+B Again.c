#include <stdio.h>
#include <math.h>
void input(int t){
	while(t > 0){
		int a;
		scanf("%d", &a);
		int sum = 0;
		
		//last number
		sum += a % 10;
		
		//first-number
		sum += a / 10;
		
		printf("%d\n", sum);
		t--;
	}
}







int main(){
	int t;
	scanf("%d", &t);
	
	//input
	input(t);
	
	return 0;
}