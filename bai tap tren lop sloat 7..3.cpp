#include<stdio.h>
#include<math.h>
int main(){
	int n, i;
	printf("nhap gia tri = "), scanf("%d", &n);
	int s = 0;
	for(i = 1; i < n ; i++)
		
		if( n%i == 0 )
			s = s + i;	
	if( s == n && n > 0)
		printf("%d la so hoan hao", n);
		
	return 0;
}
