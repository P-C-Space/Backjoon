string = input()
a = list(range(97,123))  # 97~122 a~z
for i in a :
    print(string.find(chr(i)),end=" ") 