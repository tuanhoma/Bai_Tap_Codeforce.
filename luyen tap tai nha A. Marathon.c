#include <stdio.h>
#include <math.h>
void input(int t, int a, int b, int c, int d){
	while(t > 0){
		scanf("%d %d %d %d", &a, &b, &c, &d);
		int count = 0;
			if(a < b)
			count++;
			if(a < c)
			count++;
			if(a < d)
			count++;
		printf("%d\n", count);
		t--;
	}
}




int main(){
	int a, b, c, d;
	int t;
	scanf("%d", &t);
	
	//input
	input(t, a, b, c, d);
	
	return 0;
}