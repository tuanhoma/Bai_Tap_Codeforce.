#include <stdio.h>
#include <math.h>
int max(int a, int b, int c, int d){
	int max = 0;
	if(a > b && a > c && a > d)
	max = a;
	else if(b > a && b > c && b > d)
	max = b;
	else if(c > a && c > b && c > d)
	max = c;
	else if(d > a && d > b && d > c)
	max = d;
	
	return max;
}

//caculator_outputc
void caculator_output(int a, int b, int c, int d){
	int result = max(a, b, c, d);
	a = result - a;
	b = result - b;
	c = result - c;
	d = result - d;
	
	//if a, b, c, d != 0 no print
	if(a != 0)
	printf("%d ", a);
	if(b != 0)
	printf("%d ", b);
	if(c != 0)
	printf("%d ", c);
	if(d != 0)
	printf("%d ", d);
	
}


int main(){
	int a, b, c, d;
	scanf("%d %d %d %d", &a, &b, &c, &d);
	
	//max
	max(a, b, c, d);
	
	//caculator_output
	caculator_output(a, b, c, d);
	return 0;
}
