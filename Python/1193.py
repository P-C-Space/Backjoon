n = int(input()) #몇번째 숫자인지

size = 1 #사이즈 1부터 시작

asc = True # 지그재그를 위한 boolean함수
x = 0 # 최종 분수, 분모값
y = 0
while n > 0: # n이 0보다 크다면 루프
    for i in range(size): #size크기만큼 반복
        if(asc == False): #지그재그 확인
            if(n == 1):  
                x = i+1
                y = size - i
        else:
            if(n==1):
                x = size - i
                y = i + 1
        n -=1
        if(n < 1):
            break
            
    if(asc):
        asc = False
    else:
        asc = True
    size += 1
print(x,'/',y,sep='')