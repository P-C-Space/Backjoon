n = int(input()) #입력받을 문자수

cnt = n #그룹단어 체크 초기화

for i in range(n): # 입력받을 수만큼 반복
    word = input() # 문자입력받기
    a = list(False for i in range(26) ) #알파벳개수만큼 리스트 초기화
    for j in range(len(word)-1): #문자체크
        a[ord(word[j])-97] = True #해당 문자 나타남 = True
        if(word[j] != word[j+1]): #지금과 다음 문자가 다르다면
            if(a[ord(word[j+1])-97] == True): #다음문자가 이전에 나와서 True인지 확인
                cnt -= 1 #True라면 그룹단어개수 감소후 
                break #조기종료

print(cnt)