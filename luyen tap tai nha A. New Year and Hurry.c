#include <stdio.h>
#include <math.h>
int input(int n, int t){
	int tamp = 0;
	int count = 0;
	for(int i = 1 ; i <= n; i++){
		tamp += i * 5;
		if(tamp + t > 240 || count == n)
		break;
		count++;
	}
	return count;
}




int main(){
	int n, t;
	scanf("%d %d", &n, &t);
	
	//tinh toan
	int result = input(n, t);
	
	//in ra
	printf("%d", result);
	return 0;
	
}