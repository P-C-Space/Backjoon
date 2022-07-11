alpha = ['ABC','DEF','GHI','JKL','MNO','PQRS','TUV','WXYZ']

word = input()

sum = 0
for i in word:
    for j in range(len(alpha)):
        temp = alpha[j].find(i)
        if(temp != -1):
            sum += j + 3
print(sum)

#문자열.find(문자)
#해당 문자가 존재하면 해당위치의 인덱스값 
#없으면 -1