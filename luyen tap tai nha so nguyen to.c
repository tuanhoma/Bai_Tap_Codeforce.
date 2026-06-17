#include <stdio.h>
#include <math.h>
//HÀM KIỂM TRA CÓ PHẢI SỐ NT KO 'YES' or "NO"
int nt(int n){// cách này chỉ dùng để kiểm tra từng số nguyên tố được nhập từ bàn phím chứ không phải sàng, chỉ để xem có phải số nt ko và in ra yes hoặc no
	for(int i = 2; i <= sqrt(n); i++){
		if(n % i == 0)
		return 0;// nếu n chia hết cho i thì ko phair số nguyên tố 
	}
	return n > 1;// Trả về đúng nếu n > 1 và không bị chia hết bởi số nào khác thì in ra "YES" là số nt
}



//HÀM SÀNG SỐ NGUYÊN TỐ
void sang(){
	for(int i = 0; i <= 1000000; i++)
	prime[i] = 1;// bước đầu tiên cho tất cả các số từ i -> n sẽ là số nguyên tố
	prime[0] = prime[1] = 0;// lọc 2 số 0 và 1 ko phải số nguyên tố
	for(int i = 2; i <= 1000; i++){
		if(prime[i]){
			for(int j = i * i; j <= 1000000; j += i)// lọc các số từ i * i = 4 sẽ += i cho tất cả số đã lọc đều không phải số nguyên tố
			      prime[j] = 0;
		}
	}
}


int main(){
	sang();
	int t;
	scanf("%d", &t);
	while(t--){// đây là cách các test case
		int n;
		scanf("%d", &n);
		if(prime[n])// tất cả các số có trong mảng qua bước lọc ở trên sẽ trở thành số nguyên tố
		    printf("YES");
	    else
	    printf("NO");// các số có trong mảng mà đã bị lọc ở hàm trên sẽ ko phải số nguyên tố
	}
	return 0;
}