def solve(i):
    a = str(i)
    temp = int(a[0]) - int(a[1])
    for j in range(2,len(a)):
        if(int(a[j-1])-int(a[j]) != temp):
            return False
    return True

num = int(input())
cnt = 0
for i in range(1,num+1):
    if(i//100 >= 1):
        if(solve(i)):
            cnt += 1
    else:
        cnt += 1
print(cnt)