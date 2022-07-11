string = input()
a = [0 for n in range(26)]
string = string.upper()

for i in string:
    a[ord(i)-65] += 1

max = -1
text = ""
for i in range(len(a)):
    if(max < a[i]):
        max = a[i]
        text = chr(i+65)
    elif(max == a[i]):
        text = "?"
print(text)


#.upper()  대문자로 변경
#.lower() 소문자로 변경
#.isupper() 대문자인지 확인
#.islower() 소문자인지 확인