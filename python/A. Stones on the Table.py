n = int(input())
b = input()
a = list(b)
result = 0

for i in range(n - 1):
    if a[i] == a[i + 1]:
        result += 1

print(result)