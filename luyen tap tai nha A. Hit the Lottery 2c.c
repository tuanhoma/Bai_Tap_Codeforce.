#include <stdio.h>

int bank(int n) {
    int count = 0;
    
    
    
    VD: "Giả sử chúng ta có n = 127. Chúng ta sẽ đi từng bước để tính số tờ tiền:
    "Bước 1: Tính số tờ 100"
    "count += n / 100; → count += 127 / 100; → count += 1; → count = 1.
    "n %= 100; → n = 127 % 100; → n = 27."
    // Số tờ 100
    if(n > 100){
    	count += n / 100;// tính số tờ 100.
        n %= 100;//cập nhật phần còn lại sau khi trừ đi các tờ 100.
	}
  
    // Số tờ 20
    if(n >= 20 && n < 100){
    	count += n / 20;
        n %= 20;
	}
	
	// Số tờ 10
	if(n >= 10 && n < 20){
		count += n /10;
		n %= 10;
	}
   
    // Số tờ 5
    if(n >= 5 && n < 10){
    	count += n / 5;
        n %= 5;
	}
    
    // Số tờ 1
    if(n >= 1 && n < 5){
    	  count += n;
	}
    
    return count;
}

int main() {
    int n;
    scanf("%d", &n); // Nhập số tiền
    
    int result = bank(n); // Tính số lượng tờ tiền
    printf("%d", result); // In kết quả
    
    return 0;
}