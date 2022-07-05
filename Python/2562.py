a = []
max = 0
index = 0
for i in range(9):
    a.append(int(input()))
    if(max < a[i]):
        max = a[i]
        index = i+1 

print(max)
print(index)