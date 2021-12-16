"""
제출자: 김하은
"""

w = input() #단어 입력받기
w2 = ""
for i in range(len(w)-1, -1, -1):
    w2 += w[i]
if w == w2:
    print(1)
else:
    print(0)
