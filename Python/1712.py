A,B,C = map(int,input().split())
if(B>C):
    print(-1)
elif A == 0:
    print(1)
else:
    print(A//(C-B) + 1) 