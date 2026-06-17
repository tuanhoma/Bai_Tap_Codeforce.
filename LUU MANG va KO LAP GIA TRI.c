#include <stdio.h>
// Hàm thêm các phần tử từ mảng a vào mảng result
void addUniqueElements(int a[], int result[], int visited[], int *index, int size) {
    for (int i = 0; i < size; i++) {
        if (visited[a[i]] == 0) {  // Nếu giá trị chưa xuất hiện
            visited[a[i]] = 1;     // Đánh dấu giá trị đã xuất hiện
            result[(*index)++] = a[i];  // Thêm vào mảng kết quả
        }
    }
}
int main(){
	 // Khởi tạo mảng kết quả và mảng đánh dấu
    int result[x + y];  // Mảng kết quả (tối đa x + y phần tử)
    int visited[1000] = {0};  // Mảng đánh dấu (giả sử giá trị không vượt quá 1000)
    int index = 0;  // Vị trí hiện tại trong mảng kết quả

    // Thêm các phần tử từ mảng a vào mảng kết quả
    addUniqueElements(a, result, visited, &index, x);
}