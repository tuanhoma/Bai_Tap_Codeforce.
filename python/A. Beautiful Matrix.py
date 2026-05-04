a = []
tmp_row = 0
tmp_collum = 0
result = 0

for i in range(5):
    row = list(map(int, input().split()))
    if 1 in row:
        tmp_row = i + 1
        tmp_collum = row.index(1) + 1
    a.append(row)

if tmp_row < 3:
    result += 3 - tmp_row
elif tmp_row > 3:
    result += tmp_row - 3

if tmp_collum < 3:
    result += 3 - tmp_collum
elif tmp_collum > 3:
    result += tmp_collum - 3

print(result)
