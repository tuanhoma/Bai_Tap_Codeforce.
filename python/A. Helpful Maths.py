a = list(map(int, input().split('+')))
a.sort()
result = ""
for i in range(len(a)):
    result += str(a[i])
    if i != len(a) - 1:
        result += "+"

print(result)

