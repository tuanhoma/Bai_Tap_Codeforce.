a = list(input())
result = 0

for i in range(len(a)):
    if a[i] == '7':
        result += 1
    elif a[i] == '4':
        result += 1

if result == 4 or result == 7:
    print("YES")
else:
    print("NO")