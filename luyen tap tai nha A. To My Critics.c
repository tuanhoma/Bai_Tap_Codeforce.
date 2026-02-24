#include <stdio.h>
#include <math.h>
void input(int n, int a, int b, int c){
	while(n > 0){
		scanf("%d %d %d", &a, &b, &c);
		if(a + b >= 10 || a + c >= 10 || b + c >= 10)
		printf("YES\n");
		else
		printf("NO\n");
		n--;
	}
}



int main(){
	int n; 
	scanf("%d", &n);
	int a, b, c;
	
	//input
	input(n, a, b, c);
	
	return 0;
}