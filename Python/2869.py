a = list(map(int,input().split())) #입력 3개
cnt = (a[2]-a[0]-1) // (a[0]-a[1]) + 2
print(int(cnt))
