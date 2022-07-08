num = int(input())

for i in range(num):
    b =list(map(int,input().split()))
    avg = sum(b[1:])/b[0] #평균 구하기
    count = 0 #평균이상인 사람 계산
    for j in b[1:]:
        if j > avg:
            count +=1 
    print('{:.3f}%'.format(count/b[0]*100))

