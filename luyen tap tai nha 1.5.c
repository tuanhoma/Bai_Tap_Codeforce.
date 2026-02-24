#include<stdio.h>
#include<math.h>
void max(int a, int b){
	if( a > b)
    	return a;
    return b;
} 


void prime(int l, int r){// phương pháp sàng sô nguyên tố trên đoạn từ L tới R
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




int main(){
	int l, r;
	scanf("%d %d %d", &r, &l, &n);
	sang(r, l);
	if( int n == prime[j - 1] = 0)
	printf("NO");
	else
	pritf("YES");
	
	
	return 0;
}