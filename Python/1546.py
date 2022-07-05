num = int(input())

a = list(map(int,input().split()))

max = 0
for i in range(num):
    if(max < a[i]):
        max = a[i]

sum = 0.0
for i in range(num):
    sum += a[i]/max*100

print(sum/num)