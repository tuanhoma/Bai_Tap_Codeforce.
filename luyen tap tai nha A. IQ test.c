#include <stdio.h>
#include <math.h>
int main(){
	int n;
	scanf("%d", &n);
	int a[n];
	for(int i = 0; i < n; i++){
		scanf("%d", &a[i]);
	}
	int tamp = 0, tamp1 = 0;
	int count = 0, count1 = 0;
	for(int i = 0; i < n; i++){
		if(a[i] % 2 == 0){
			count++;
			tamp = i + 1;
		}

		else if(a[i] % 2 != 0){
			count1++;
			tamp1 = i + 1;
		}
	}
	if(count > count1)
	printf("%d", tamp1);
	else
	printf("%d", tamp);
	return 0;
}