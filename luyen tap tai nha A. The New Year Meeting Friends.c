#include <stdio.h>
#include <math.h>
int mang(int a, int b, int c){
	int tamp = 0;
	//tim so trung binh
	if(a > b && a < c || a > c && a < b)
	tamp = a;
	else if(b > a && b < c || b > c && b < a)
	tamp = b;
	else if(c > a && c < b || c > b && c < a)
	tamp = c;
	
	
	//tim max
	int max = 0;
	if(a > b && a > c)
	max = a;
	else if(b > a && b > c)
	max = b;
	else if(c > b && c > a)
	max = c;

	
	//tim min
	int min = 0;
	if(a < b && a < c)
	min = a;
	else if(b < a && b < c)
	min = b;
	else if(c < a && c < b)
	min = c;
	
	int tong = 0;
	tong = (max - tamp) + (tamp - min);
	return tong;
}




int main(){
	int a, b, c;
	scanf("%d %d %d", &a, &b, &c);
    int result = mang(a, b, c);
	printf("%d", result);
	return 0;
}