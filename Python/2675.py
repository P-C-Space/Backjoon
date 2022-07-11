size = int(input())
for j in range(size):
    repetition, string = input().split() #split() 공백으로 문자열 나누기
    text = ""
    for i in string:
        text += i*int(repetition)
    print(text)