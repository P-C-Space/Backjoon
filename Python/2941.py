Croatia = ['c=','c-','dz=','d-','lj','nj','s=','z=']

word = input()

cnt = len(word)
for i in Croatia:
    temp = word.find_all(i)
    if(temp > 0):
        cnt -= len(temp)

print(cnt)