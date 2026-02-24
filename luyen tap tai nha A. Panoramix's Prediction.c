#include <stdio.h>
#include <math.h>
int is_prime_n(int n){
	if(n < 2)
	return 0;
	else{
		for(int i = 2; i <= sqrt(n); i++){
			if(n % i == 0){
				return 0;
			}
		}
	}
	return 1;
}



int has_prime_between(int n, int m) {
    for (int i = n + 1; i < m; i++) {
        if (is_prime_n(i)) {
            return 1; // Có số nguyên tố nằm giữa
        }
    }
    return 0; // Không có số nguyên tố nào giữa n và m
}


int is_prime_m(int m){
	if(m < 2)
	return 0;
	else{
		for(int i = 2; i <= sqrt(m); i++){
			if(m % i == 0){
				return 0;
			}
		}
	}
	return 1;
}


int main(){
	int n, m;
	scanf("%d %d", &n, &m);
	
	int result_a = is_prime_n(n);
	int result_b = is_prime_m(m);
	int between_prime = has_prime_between(n, m);
	
	if(result_a == 1 && result_b == 1 && m > n && between_prime == 0)
	printf("YES");
	else
	printf("NO");
	
	return 0;
}