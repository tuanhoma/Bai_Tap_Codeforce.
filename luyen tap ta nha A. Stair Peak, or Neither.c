#include <stdio.h>
#include <math.h>
int main(){
	int t;
	scanf("%d", &t);
	while(t > 0){
		int a, b, c;
		scanf("%d %d %d", &a, &b, &c);
		if(b > a && b < c)
		printf("STAIR\n");
		else if(b > a && b > c)
		printf("PEAK\n");
		else
		printf("NONE\n");
		t--;
	}
	
	return 0;
}