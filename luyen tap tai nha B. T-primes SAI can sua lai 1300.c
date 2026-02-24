#include <stdio.h>
#include <math.h>
int a[1000000];
void sang(){
	for(int i = 0; i < 1000000; i++){
		a[i] = 1;
	}
		a[0] = a[1] = 0;
	for(int i = 2; i < 1000; i++){
		if(a[i]){
			for(int j = i * i; j < 1000000; j += i){
			a[j] = 0;
			}
	    }
	}
}



void prime(int t) {
    while (t > 0) {
        int n;
        scanf("%d", &n);

        // Kiểm tra xem n có phải là bình phương của một số nguyên tố không
        int sqrt_n = sqrt(n);
        if (sqrt_n * sqrt_n == n && a[sqrt_n]) {
            printf("YES\n");
        } else {
            printf("NO\n");
        }

        t--;
    }
}



void caculator(int t, int n){
	while(t > 0){
		int count = 0;
		scanf("%d", &n);
		int tamp = n;
		for(int i = 1; i <= tamp; i++){
			if(n % i == 0)
			count++;
		}
		if(count == 3)
		printf("YES\n");
		else
		printf("NO\n");
		t--;
	}
}






int main(){
	int t, n;
	scanf("%d", &t);
	
	//sang
	sang();
	
	//prime
	prime(t);
	
	//caculator
	caculator(t, n);

	return 0;
}