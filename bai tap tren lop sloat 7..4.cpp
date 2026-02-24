#include<stdio.h>
#include<math.h>
int main(){
	int n, i;
	printf("nhap gia tri = "), scanf("%d", &n);
	int s = 0;
	for(i = 1; i < n ; i++)
	{
		int k, s = 0;
		for(k = 1; k < i; k++)
		if( i%k == 0)  s = s+ i;
		if(s == i)  printf("%d", i);
		
	
	}	
	return 0;
}
