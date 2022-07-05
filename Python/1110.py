num = int(input()) #초기값

count = 0 #사이클 수

if num < 10: #10보다 작을시 변경
    num = int(str(num)+"0")

temp = num


while(True):
    temp = int(str(temp%10) + str((temp//10 + temp % 10)%10))
    count += 1

    if(temp == num): #비교
        print(count)
        break
