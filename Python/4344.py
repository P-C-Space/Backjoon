num = int(input())

a = list(0 for i in range(num))

for i in range(num):
    a[i].append(list(map(int,input().split())))

for i in range(num):
    sum = 0 #총점
    avg = 0 #평균
    count = 0 #평균넘는 인원 수
    for j in (1,len(a[i])):
        sum += a[i][j]
    
    avg = sum/a[i][0]
    for j in (1,len(a[i])):
        if(avg<a[i][j]):
            count += 1
    print("%.3f%",count/a[i][0])

