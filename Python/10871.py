num1, num2 = map(int,input().split())
#map(int,input...) input값을 전부 int형으로 변환
A = list(map(int,input().split()))

for i in range(num1):
    if A[i] < num2:
        print(A[i],end=" ")