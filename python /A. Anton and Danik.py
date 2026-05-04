n = int(input())
a = list(input())
tmp_a = 0
tmp_d = 0

for i in range(n):
    if a[i] == "A":
        tmp_a += 1
    else:
        tmp_d += 1

if tmp_a > tmp_d:
    print("Anton")
elif tmp_a < tmp_d:
    print("Danik")
else:
    print("Friendship")
