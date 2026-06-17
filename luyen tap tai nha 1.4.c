#include<stdio.h>
#include<math.h>
int prime[1000001];


void sieve(){// phương pháp sàng số nguyên tố từ 2 đến n
	//coi tat ca cac so tu 0 cho toi n la so nguyen to
	//prime[i] = 1 la so nguyen to
	// prime[i] = 0 la so nguyen to
	for(int i = 0; i <= 1000000; i++)
	prime[i] = 1;
	// loai 0 va 1
	prime[0] = prime[1] = 0;
	for( int i = 2; i <= 1000; i++)
	//neu i la so nguyen to
	if(prime[i]){
		//duyet tat ca cac boi cua i va cho no khong la so nguyen to 
		for(int j = i*i; j <= 1000000; j += i)
		prime[j] = 0;//j khong con la so nguyen to nua
		//vd: 2 la so nguyen so no se loai tat cả cac bội cua 2 bội là i + i = n -> n + i = bội vd: 2 + 2 = 4 -> 4 + 2 = 6 đó là bội
		 
	}
}





void sang(int l, int r){// phương pháp sàng sô nguyên tố trên đoạn từ L tới R
	//( r - l + 1);//lượng số nguyên tố cần sàng
	for( int i = 0; i <= (r - 1 + 1) ; i++ )
	    prime[i] = 1; //cho tất cả từ R trở về L là số nguyên tố
	    int j;
	for( int i = 2; i <= sqrt(r); i++){
		if( i*i > (l + i -1)/i * i)
	    j = i*i;
		else
		j = (l + i -1)/ (i * i);
		for( j ; j <= r; j += i)
		prime[j - 1] = 0;// đây là sàng loại bỏ các số không phải là số nguyên tố từ L tới R;
	}
}



int nt(int n){
	for(int i = 2; i <= sqrt(n); i++){
		if( n % i == 0 )
		return 0;
	}
    return 1;
}


int main(){
int l, r, n;
	scanf("%d %d %d", &r, &l, &n);
		for( int i = 0; i <= (r - 1 + 1) ; i++ )
	    prime[i] = 1; //cho tất cả từ R trở về L là số nguyên tố
	    int j;
	for( int i = 2; i <= sqrt(r); i++){
		if( i*i > (l + i -1)/i * i)
	    j = i*i;
		else
		j = (l + i -1)/ (i * i);
		for( j ; j <= r; j += i)
		prime[j - 1] = 0;// đây là sàng loại bỏ các số không phải là số nguyên tố từ L tới R;
		
	}
	if(prime[j - 1] == n)
	printf("NO");
	else
	printf("YES");
	return 0;
}
