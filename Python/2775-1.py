n = int(input())

for i in range(n):
    a = int(input())
    b = int(input())
    z = [y for y in range(1,b+1)] #0층 리스트
    for j in range(a):
        for k in range(1,b):
            z[k] += z[k-1] #리스트 재정렬
    print(z[b-1])