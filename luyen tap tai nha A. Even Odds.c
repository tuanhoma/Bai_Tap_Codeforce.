#include<stdio.h>
#include<math.h>
long long numbermang(long long n, long long m, long long a[n], long long b[n], long long c[n]){
	                for(int i = 0, j = 1; i < n; i++, j++){
		a[i] = j;
		b[i] = j;
	}
	int temp;
	for(int i = 0, j = 0; i < n; i++){//luu cac gia ri chan vao b[i]
	    if(b[i] % 2 == 0){
	    	temp = b[i];
	        b[j] = temp;
	        j++;
		}
	}
	int temp1;
	for(int i = 0, j = 0; i < n; i++){//luu cac gia tri le vao a[i]
	    if(a[i] % 2 != 0){
	    	temp1 = a[i];
	        a[j] = temp1;
	        j++;
		}
	}
	if(n % 2 != 0)
	for(int j = 0, i = 0; j < n; j++){//c[i] de luu tat ca cac so le va chan theo thu tu trong mang c[j]
		if(a[j] % 2 != 0 && j <= n/2)
		c[j] = a[j];
		else if(b[i] % 2 == 0){
			c[j] = b[i];
			i++;
		}
	}
	else if(n % 2 == 0)
	for(int j = 0, i = 0; j < n; j++){//c[i] de luu tat ca cac so le va chan theo thu tu trong mang c[j]
		if(a[j] % 2 != 0 && j < n/2)
		c[j] = a[j];
		else if(b[i] % 2 == 0){
			c[j] = b[i];
			i++;
		}
	}
}


int main(){
	long long n, m;
	scanf("%lld %lld", &n, &m);
	long long a[n], b[n], c[n];

	long long numbermang(long long n, long long m, long long a[n], long long b[n], long long c[n]);
	//for(int i = 0; i < n; i++){//dung de thu nghiem trc khi nop
	//	printf("%d ", c[i]);}
	
	for(int i = 0; i < n; i++){
		if(i == m - 1)
	    printf("%lld", c[i]);
	}
	return 0;
}