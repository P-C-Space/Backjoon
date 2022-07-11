#65~90 대문자
#97~122 소문자

string = input()
a = [-1 for n in range(26)]
count = 0
for i in string:
    if(a[ord(i)-97] == -1):
        a[ord(i)-97] = count
    count+=1
# *리스트 괄호없이 출력
print(*a)
