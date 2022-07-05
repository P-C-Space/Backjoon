num = int(input())

for i in range(num):
    string = input()
    score = 0
    sum = 0
    for j in string:
        if(j == "O"):
            score += 1
            sum += score
        else:
            score = 0
    print(sum)