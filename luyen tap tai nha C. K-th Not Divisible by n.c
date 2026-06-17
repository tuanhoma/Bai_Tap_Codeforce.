#include <stdio.h>
#include <math.h>
void solve(int t) {
    while (t > 0) {
        int n, k;
        scanf("%d %d", &n, &k);
        // Calculate the k-th number not divisible by n
        int result = k + (k - 1) / (n - 1);//Công thức này bù trừ cho các số bị bỏ qua (các số chia hết cho n).
        printf("%d\n", result);
        t--;
    }
}



int main(){
	int t;
	scanf("%d", &t);
	
	//input
	solve(t);
	
	return 0;
}