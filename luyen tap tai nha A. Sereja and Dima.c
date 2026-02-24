#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n); // Đọc số lượng lá bài

    int a[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &a[i]); // Đọc giá trị các lá bài
    }

    int left = 0, right = n - 1; // Con trỏ trái và phải
    int sereja = 0, dima = 0; // Điểm của Sereja và Dima
    int serejaTurn = 1; // Lượt của Sereja (1: Sereja, 0: Dima)

    while (left <= right) {
        int chosenCard; // Lá bài được chọn

        // Chọn lá bài có giá trị lớn hơn
        if (a[left] > a[right]) {
            chosenCard = a[left];
            left++;
        } else {
            chosenCard = a[right];
            right--;
        }

        // Cộng điểm cho người chơi tương ứng
        if (serejaTurn) {
            sereja += chosenCard;
        } else {
            dima += chosenCard;
        }

        // Đổi lượt
        serejaTurn = !serejaTurn;
    }

    // In kết quả
    printf("%d %d\n", sereja, dima);
    return 0;
}