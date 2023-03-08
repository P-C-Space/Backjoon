from re import A


a = int(input())
b = int(input())
sum = 0
for i in range(a,b+1):
    for j in range(2,i):
        if(i%j == 0):
            break
    sum += i

    
if(sum == 0):
    print(-1)
else:
    print(sum)