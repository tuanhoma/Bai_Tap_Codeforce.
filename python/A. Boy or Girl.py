tmp = str(input())
a = sorted(tmp)

result = 1
tmp_a = a[0]
for i in range(1, len(a)):
    if tmp_a != a[i]:
        result += 1
    tmp_a = a[i]

if result % 2 == 0:
    print("CHAT WITH HER!")
else:
    print("IGNORE HIM!")



