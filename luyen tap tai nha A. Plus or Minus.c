#include <stdio.h>
#include <math.h>
void caculator(int t, int a, int b, int c){
	while(t > 0){
		scanf("%d %d %d", &a, &b, &c);
		if(a + b == c)
		printf("+\n");
		else if(a - b == c)
		printf("-\n");
		t--;
	}
}





int main(){
    int t;
	scanf("%d", &t);
	int a, b, c;	
	
	//input
	caculator(t, a, b, c);
	return 0;
}