num1, num2 = map(int,input().split())
num = list(map(int, input().split()))

for i in range(0,num1,1):
    if(num[i]<num2):
        print(i,end=" ")