#include <stdio.h>
#include <math.h>
#include <string.h>
#include <ctype.h>

#define MAX 256 // Số lượng ký tự ASCII
#define MIN 256 

typedef struct {
    char character;
    int count;
} CharCount;



int main(){
	char a[101];
	char b[101];
	char c[101];
	scanf("%s", a);
	scanf("%s", b);
	scanf("%s", c);
	PHẦN 1: LƯU HAI MẢNG VÀO 1 MẢNG DUY NHẤT
    // Gộp hai chuỗi a và b thành chuỗi tong
    char tong[202]; // Đủ lớn để chứa cả a và b
    strcpy(tong, a); //Sử dụng strcpy để sao chép a vào tong.
    strcat(tong, b); //Sử dụng strcat để nối b vào tong.
    CHUỖI TỔNG LÀ MAX
    CHUỖI CẦN SO SÁNH LÀ C
    
    PHẦN 2: ĐẾM SỐ LẦN KÍ TỰ XUẤT HIỆN TRONG CHUỖI VÀ SẮP XẾP THEO THỨ TỰ BẢNG CHỮ CÁI
    BƯỚC1: LƯU SỐ LẦN VÀ ĐẾM SỐ LẦN XUẤT HIỆN CỦA MẢNG TONG
    // Mảng để lưu số lần xuất hiện của mỗi ký tự
    int count[MAX] = {0};
    // Đếm số lần xuất hiện của mỗi ký tự trong chuỗi tong
    for (int i = 0; tong[i] != '\0'; i++) {
        count[(unsigned char)tong[i]]++;//(unsigned char) là chuyển sang số bảng mã ASCII vd count[a]++;
        //nghĩa là chữ cái trong mảng hiện tại sẽ đc đếm số lần lặp lại vd: lần đầu tiên thì count[a]++; có nghĩa chữ cái 'a' dc count++ là count = 1 xuất hiện lần đầu và lưu vào mảng đếm.
        //bởi vì (unsigned char) kí tự chữ dc đổi thành trong mảng mã ASCII nên được sắp xếp theo thứ tự chữ cái luôn 
    }
    
    
    BƯỚC2: LƯU SỐ LẦN VÀ ĐẾM SỐ LẦN XUẤT HIỆN CỦA CÁC KÍ TỰ TRONG MẢNG CẦN ĐỂ SO SÁNH
    // Mảng để lưu số lần xuất hiện của mỗi ký tự
    int count1[MIN] = {0};
    // Đếm số lần xuất hiện của mỗi ký tự trong chuỗi tong
    for (int i = 0; c[i] != '\0'; i++) {
        count1[(unsigned char)c[i]]++;
    }
    
    PHẦN 3: SO SÁNH CHUỖI TONG VÀ CHUỖI CẦN SO SÁNH CHUỖI C
    int dem = 0;
	printf("\n");
	for(int i = 0; i < MIN; i++){
		if(count[i] == count1[i])
		dem++;
	}
	
	if(dem == MIN)
	printf("YES");
	else
	printf("NO");
	return 0;
}