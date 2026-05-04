a, b = map(int, input().split())# là input().split() tách một chuỗi ra thành từng kí tự, map(int là chuyển từng kí tự đó thành số nguyên.
result = 0

while a <= b:
    a *= 3
    b *= 2
    result += 1

print(result)