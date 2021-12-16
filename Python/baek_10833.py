"""
제출자: 김하은
"""

n = int(input()) # 학교의 수
a = 0 # 남은 사과의 수
for _ in range(n):
    student, apple = map(int, input().split())
    a += apple % student
print(a)
