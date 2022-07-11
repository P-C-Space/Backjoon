size = int(input()) #정수형

num = input() #문자형

sum = 0
for i in num:
    sum += int(i) #문자열 하나씩 정수형으로 변환후 덧셈

print(sum)