num1, num2 = input().split()

def back_number(num):
    temp = ""
    for i in range(len(num)-1,-1,-1):
        temp += num[i]
    return temp

num1 = back_number(num1)
num2 = back_number(num2)

print(max(int(num1),int(num2)))