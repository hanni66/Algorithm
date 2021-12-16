"""
제출자: 김하은
문제
어떤 반에 있는 학생들의 생일이 주어졌을 때,
가장 나이가 적은 사람과 가장 많은 사람을 구하는 프로그램을 작성하시오.
"""

n = int(input()) # 반에 있는 학생의 수
s = []

for _ in range(n):
    student = input().split()
    student[1:] = map(int, student[1:])
    s.append(student)

s.sort(key=lambda student: (student[3], student[2], student[1]))

print(s[-1][0])
print(s[0][0])
