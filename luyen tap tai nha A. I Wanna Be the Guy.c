#include <stdio.h>
#include <math.h>
#include <stdlib.h>
int compare(const void *a, const void *b) {// hàm dùng để xắp xếp các số từ bé đến lớn trong mảng
    return (*(int *)a - *(int *)b);
}


int main() {
    int n;
    scanf("%d", &n);
    int c[n];
    int tamp = 1;
    for (int i = 0; i < n; i++) {// dùng để gán giá trị từ 1 đến n vào mảng
        c[i] = tamp;
        tamp++;
    }
///////////////////////////
    int x;
    scanf("%d", &x);
    int a[x];
    for (int i = 0; i < x; i++) {
        scanf("%d", &a[i]);
    }

    int y;
    scanf("%d", &y);
    int b[y];
    for (int i = 0; i < y; i++) {
        scanf("%d", &b[i]);
    }
    //BƯỚC 1: dùng để lưu giá trị từ mảng a và b vào mảng result mà không lặp 
    // Mảng kết quả (tối đa x + y phần tử)
    int result[x + y];
    int visited[1000] = {0};  // Mảng đánh dấu (giả sử giá trị không vượt quá 1000)
    int index = 0;  // Vị trí hiện tại trong mảng kết quả

    // Thêm các phần tử từ mảng a vào mảng kết quả
    for (int i = 0; i < x; i++) {
        if (visited[a[i]] == 0) {  // Nếu giá trị chưa xuất hiện
            visited[a[i]] = 1;     // Đánh dấu giá trị đã xuất hiện
            result[index++] = a[i];  // Thêm vào mảng kết quả
        }
    }

    // Thêm các phần tử từ mảng b vào mảng kết quả
    for (int i = 0; i < y; i++) {
        if (visited[b[i]] == 0) {  // Nếu giá trị chưa xuất hiện
            visited[b[i]] = 1;     // Đánh dấu giá trị đã xuất hiện
            result[index++] = b[i];  // Thêm vào mảng kết quả
        }
    }
    BƯỚC 2: dùng để xắp xếp các số từ bé đến lớn trong mảng result
    // Sắp xếp mảng kết quả
    qsort(result, index, sizeof(int), compare);
    
    BƯỚC 3: dùng để so sánh mảng result và mảng c[] 
    int count = 0;
    // In ra mảng kết quả
    for (int i = 0; i < n; i++) {
    	if(c[i] == result[i])
        count++;
    }
    if(count == n)
    printf("I become the guy.");
    else
    printf("Oh, my keyboard!");
    return 0;
}