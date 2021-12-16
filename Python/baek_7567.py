"""
제출자: 김하은
"""

s = list(str(input())) #그릇 모양 입력받기
h = 0 #기본 높이
for i in range(len(s)):
    if i==0:
        h += 10
    elif s[i] == s[i-1]:
        h += 5
    else:
        h += 10
print(h)
