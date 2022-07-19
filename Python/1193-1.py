from re import A


n = int(input())

cnt = 1

while n > cnt:
    n -= cnt
    cnt += 1
if cnt % 2 == 0:
    a = n
    b = cnt - n + 1
else:
    a = cnt - n + 1
    b = n
print(a, '/', b, sep='')
### 1 12 123 1234 12345
### 홀수번째 분자먼저 3/1
### 짝수번째 분모먼저 1/2
#    n   cnt
# ex 14 - 1 13
#    13 - 2 11
#    11 - 3 8
#    8  - 4 4   
# cnt 5 -> 4 > 5  false => 홀수번째 종료 분자 먼저
# 분자 5-4+1 분모 4

#    5   1
#    4   2 
#    2   3 -> 홀수 분자먼저
#    분자 3-2+1 분모 2