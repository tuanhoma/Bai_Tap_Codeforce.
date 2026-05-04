t = int(input())
result = 0
while t > 0:
    t -= 1
    x = str(input())
    if x == "++X" or x == "X++":
        result += 1
    else:
        result -= 1

print(result)


