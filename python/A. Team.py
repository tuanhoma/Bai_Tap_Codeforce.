t = int(input())
result = 0
while t > 0:
    t -= 1
    tmp = 0
    for i in range(3):
        a = int(input())
        if a == 1:
            tmp += 1

    if tmp >= 2:
        result += 1

print(result)
