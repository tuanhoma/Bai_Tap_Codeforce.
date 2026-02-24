#include <stdio.h>
#include <math.h>
void input(int n){
	int count_m = 0, count_c = 0;
	while(n > 0){
		int m, c;
		scanf("%d %d", &m, &c);
		if(m > c)
		count_m++;
		else if(m < c)
		count_c++;
		n--;
	}
	if(count_m > count_c)
	printf("Mishka");
	else if(count_m < count_c)
	printf("Chris");
	else
	printf("Friendship is magic!^^");
}

int main(){
	int n;
	scanf("%d", &n);
	
	//input
	input(n);
	
	return 0;
}