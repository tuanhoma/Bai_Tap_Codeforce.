#include<stdio.h>
#include<math.h>
int main(){
	int n, i;
	float s1 = 0 ;
	printf("enter = "), scanf("%d", &n);
	if( n > 0){
	for(i = 1; i <= n; i++)
		s1 += pow(-1,i-1)/i;
		printf("s1 = %f", s1);
		
	
}
    else(
	printf("N <= 0!"));
	return 0;
	
}