a = []
for i in range(3):#3개의 숫자
    a.append(int(input()))

temp = str(a[0]*a[1]*a[2])

b = list(0 for i in range(10))
# 0으로 초기화하여 10개의 리스트 

for i in temp: #해당하는 숫자부분 
    b[int(i)]+=1 #증가

for i in b: #출력
    print(i)
