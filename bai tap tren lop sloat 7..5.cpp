#include<stdio.h>
#include<math.h>
int main(){
	float e;
	do
	{
	printf("enter e = "), scanf("%f", e);
    }while( e <= 0 || e >= 1);
    
    float s = 0;
    int n = 1;
    while( 1.0/n >= e)
    {
    	s += 1.0/n;
    	n++;
	}
	printf(" s = %f", s);
	return 0;
}