#include <stdio.h>
#include <math.h>
void output(int a, int b){
	int result = 0;
	int min = 0;
	if(a <= b)
		min = a;
	else if(b <= a)
        min = b;
        
    int tong = (a + b) - min - min;
    result = tong / 2;
    printf("%d %d", min, result);
}




int main(){
	int a, b;
	scanf("%d %d", &a, &b);
    
    //output
    output(a , b);
    return 0;
 }
