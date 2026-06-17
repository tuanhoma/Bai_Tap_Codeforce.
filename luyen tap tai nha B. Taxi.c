#include <stdio.h>
#include <math.h>
void input(int a[], int n){
	for(int i = 0; i < n; i++){
		scanf("%d", &a[i]);
	}
}



void mang(int a[], int n, int *count1, int *count2, int *count3, int *count4){
      *count1 = 0, *count2 = 0, *count3 = 0, *count4 = 0;
	for(int i = 0; i < n; i++){
		if(a[i] == 1)
		(*count1)++;
		else if(a[i] == 2)
		(*count2)++;
		else if(a[i] == 3)
		(*count3)++;
		else if(a[i] == 4)
		(*count4)++;
	}
}



void tinh(int count1, int count2, int count3, int count4){
	int taxi = 0;
	//nhom 4
	taxi = count4;
	
	//nhom3 
	taxi += count3;
    count1 = (count1 > count3) ? (count1 - count3) : 0;
    
    // Xử lý nhóm 2 học sinh
    taxi += count2 / 2; // Hai nhóm 2 học sinh ghép vào 1 taxi
    int remaining2 = count2 % 2; // Số nhóm 2 học sinh còn lại dư ra
    
    if (remaining2) {
        taxi++; // Nếu còn dư 1 nhóm 2 học sinh, cần thêm 1 taxi cho nhóm 2 học sinh còn lại
        count1 = (count1 > 2) ? (count1 - 2) : 0; //Nếu có ít nhất 2 nhóm 1 học sinh, ghép vào taxi này và giảm count1 đi 2. Nếu không, count1 được đặt về 0.
    }

    // Xử lý nhóm 1 học sinh
    taxi += (count1 + 3) / 4; // Mỗi taxi chở tối đa 4 nhóm 1 học sinh
	//Ghép các nhóm 1 học sinh vào các taxi còn trống.
	// dùng để ghép các nhóm1 học sinh lại với nhau nếu thừa nhiềunhoms 1 học sinh
	
	// In kết quả
    printf("%d\n", taxi);
}





int main(){
	int n;
	scanf("%d", &n);
	int a[n];
	input(a, n);
	int count1, count2, count3, count4;
    mang(a, n, &count1, &count2, &count3, &count4); // Đếm số lượng nhóm
    tinh(count1, count2, count3, count4); // Tính số lượng taxi
	return 0;
}