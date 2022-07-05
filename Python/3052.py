a = []
for i in range(10):
    a.append(int(input())) #입력받고
    a[i] = a[i]%42 #나눈다

print(len(set(a))) # set - 중복된 값은 삭제