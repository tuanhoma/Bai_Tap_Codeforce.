#include<stdio.h>
#include<math.h>
int main(){
	int n;
	int x , s;
	if( x >= 1 &&  x <= 150)
	scanf("%d", &x);
	char n[5];
	scanf("%s", n);
	if( '+' )
	s = ++x - 1;
	else if( '-')
	s = --x - 1;
	else if( '+' && '-' )
	s = ++x - 1;
	s = --x - 1;
	
	printf("%d", s );
	return 0;
}