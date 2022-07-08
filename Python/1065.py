def solve(i):
    a = str(i)
    temp = int(a[0]) - int(a[1]) #첫번째와 두번째 수 차이 체크
    for j in range(2,len(a)):
        if(int(a[j-1])-int(a[j]) != temp): #두번째 수 이후의 차이를 temp과 비교 후 다르다면 
            return False #False리턴
    return True #이상없다면 True

num = int(input())
cnt = 0
for i in range(1,num+1):
    if(i//100 >= 1):
        if(solve(i)):
            cnt += 1
    else:
        cnt += 1
print(cnt)