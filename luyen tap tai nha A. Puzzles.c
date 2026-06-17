#include <stdio.h>
#include <math.h>
void input(int n,  int a[n]){
	for(int i = 0; i < n; i++){
		scanf("%d", &a[i]);
	}
}



void sap(int n, int m, int a[n]){
	for(int i = 0; i < n - 1; i++){
		for(int j = 0; j < n - i - 1; j++){
			if(a[j + 1] < a[i]){
				int tamp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = tamp;
			}
		}
	}
}



int tinh(int n, int m, int a[n]){
	int tamp = 100000;
for (int i = 0; i < n; i++) {
	int max = 0;
	int min = 100000;
	int tong = 0;
        // Tìm max và min trong cửa sổ hiện tại
        for (int j = i; j < m + 1; j++) {
            if (a[j] > max) max = a[j];
            if (a[j] < min) min = a[j];
        }
		//printf(" ");
		 tong = max - min;
		 if(tamp > tong)
		 tamp = tong;
	}
	return tamp;
}



int main(){
	int n, m;
	scanf("%d%d", &m, &n);
	int a[n];
	input(n, a);
	sap(n, m , a);
	int result = tinh(n, m, a);
	printf("\n%d", result);
	return 0;
	
	
}