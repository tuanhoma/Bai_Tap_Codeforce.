#include <stdio.h>
#include <math.h>
// nl is a mililiter enough to toast
int drink(int nl, int k, int l){
	int sumnl = (k * l) / nl;
	sumnl;
	return sumnl;
}

//slice of lime enough for toast
int lemon(int c, int d){
	int lime = c * d;
	return lime;
}

//salt enough for toast
int salt(int p, int np){
	int salt1 = p / np;
	return salt1;
}

//min acn make of the people
int min(int nl, int k, int l, int c, int d, int p, int np, int n){
	int result_drink = drink(nl, k, l);
	int result_lemon = lemon(c, d);
	int result_salt = salt(p, np);
	int min = 0;
	if(result_drink <=  result_lemon &&  result_drink <= result_salt)
	min = result_drink / n;
	else if(result_lemon <= result_drink && result_lemon <= result_salt)
	min = result_lemon / n;
	else if(result_salt <= result_drink && result_salt <= result_lemon)
	min = result_salt / n;
	return min;
}





int main(){
	int n, k, l, c, d, p, nl, np;
	scanf("%d %d %d %d %d %d %d %d", &n, &k, &l, &c, &d, &p, &nl, &np);
	
	//result_min;
	int result = min(nl, k, l, c, d, p, np, n);
	printf("%d", result);
	return 0;
}