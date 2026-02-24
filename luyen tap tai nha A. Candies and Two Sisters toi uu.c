#include <stdio.h>
#include <math.h>
void input(long long t){
	long long a, b;
	while(t--){
	int n;
	scanf("%d", &n);
	long long count = 0;
    if (n % 2 == 0) {
            count = (n / 2) - 1;//Nếu n kẹo chẵn, đếm số trường hợp chia kẹo dc là count = (n / 2) - 1 
        } else {
            count = n / 2;//count = n / 2.
        }
        printf("%lld\n", count);
	}
}


int main(){
	long long t;
	scanf("%lld", &t);
	input(t);
	return 0;
}