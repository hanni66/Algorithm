"""
백준 1546
제출자: 김하은
"""
n = int(input())    # 과목 수
a = list(map(int, input().split()))  # 시험 점수
maxx = max(a)    # 시험 점수 중 가장 큰 값

b = [] # 새로운 점수
for i in a:
    b.append(i/maxx *100)    # 새로운 점수 넣기
    
avg = sum(b)/n    # 새로운 점수를 모두 더하고 과목수로 나누기
print(avg)    # 평균 출력
