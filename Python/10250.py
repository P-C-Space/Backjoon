n = int(input())

for i in range(n):
    H, W, N = map(int,input().split()) 
    cnt = 1
    a=1
    b=1
    while N > cnt:
        a+= 1
        if(a>H):
            a=1
            b+=1
        cnt+=1
        print(a,b,cnt)
    if(b<10):
        print(a,'0'+str(b),sep="")
    else:
        print(a,b,sep="")
