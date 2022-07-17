Croatia = ['c=','c-','d-','lj','nj','s=','z=']

word = input()

cnt = len(word)
if('dz=' in word):
    for i in range(len(word)-2):
        temp = word[i] + word[i+1]+word[i+2]
        if(temp=='dz='):
            cnt -= 1 


for i in range(len(word)-1):
    temp = word[i] + word[i+1]
    for j in Croatia:
        if(j in temp):
            cnt -=1
            
    

print(cnt)