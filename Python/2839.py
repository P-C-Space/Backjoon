n = int(input())

rsult = -1
cnt = -1
if(n<5):
    if(n%3==0):
        rsult = 1
else:
    if(n%5==0):
        rsult = n//5
    else:
        for i in range(n,0,-5):
            cnt +=1
            if(i%3 == 0):
                rsult = cnt + i//3 
print(rsult)
            
        

