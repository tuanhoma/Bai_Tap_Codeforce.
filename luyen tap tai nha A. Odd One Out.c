#include <stdio.h>
#include <math.h>
void input(int t, int a, int b, int c){
	while(t > 0){
		scanf("%d %d %d", &a, &b, &c);
		if(a != b && a != c)
		printf("%d\n", a);
		else if(b != a && b != c)
		printf("%d\n", b);
		else if(c != a && c != b)
		printf("%d\n", c);
		t--;
	}
}



int main(){
	int t;
	int a, b, c;
	scanf("%d", &t);
	
	//input
	input(t, a, b, c);
	
	return 0;
}