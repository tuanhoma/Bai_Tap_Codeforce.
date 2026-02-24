#include <stdio.h>
#include <math.h>
int caculator(int k, int r){
	int tong = 0;
	int sum = 0;
	int i;
	//loop unlimited 'i'
	for(i = 1; ; i++){
	    sum = k * i;
		tong = (k * i) - r;
    //lap lai cho den khi thoa man dieu kien if va in ra 'i'
	if(tong % 10 == 0 || sum % 10 == 0)
	    return i;
	}
}




int main(){
	int k, r;
	scanf("%d %d", &k, &r);
	
	//caculator
	int result = caculator(k, r);
	printf("%d", result);
	return 0;
}