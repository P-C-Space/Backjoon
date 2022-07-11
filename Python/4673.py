a =  [False for i in range(10000)]
def self_number(n):
    sum = n #처음 수
    temp = str(n) #문자형으로 바꾼후
    for i in temp:
        sum += int(i)
    return sum

for i in range(1,10001):  #숫자 1~1000.
    s_num=self_number(i)
    if(s_num<=10000):
        a[s_num-1] = True

for i in range(10000): #인덱스값 0~9999 : 1~10000
    if(a[i] == False):
        print(i+1)