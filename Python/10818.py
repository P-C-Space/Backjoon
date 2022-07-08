num = int(input())
a = list(map(int,input().split()))
max = -1000000
min = 1000000
for i in range(num):
    if(max<a[i]):
        max = a[i]
    if(min>a[i]):
        min = a[i]
print(min, max)