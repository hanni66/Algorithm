"""
제출자: 김하은
문제
게으른 근우는 열심히 놀다가 문득, 자신의 학점 평균이 얼마일지 궁금해졌다.
학사시스템도 들어가기 귀찮아하는 근우를 위해 구해주도록 하자.
"""

t = int(input()) # 학기의 수

for i in range(t):
    n = int(input()) # 과목의 수
    total_c = 0
    total_g = 0
    
    for _ in range(n):
        c, g = map(float, input().split())
        total_c += c
        total_g += c * g
        
    GPA = total_g / total_c
    print(int(total_c), '%.1f' %GPA)
