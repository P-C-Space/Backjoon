def i_will_president(a,b):
    sum = 0
    a -= 1
    if(a == 0):
        for i in range(b+1):
            sum += i
        return sum
    else:
        for i in range(b+1):
            sum += i_will_president(a,i)
        return sum

n = int(input())
for i in range(n):
    a = int(input())
    b = int(input())
    print(i_will_president(a,b))