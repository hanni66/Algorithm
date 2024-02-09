"""
제출자: 김하은

a = sorted(a, key = lambda x: x[1])
sorted(key = lambda x: x[])
key 인자에 함수를 넘겨주면 해당 함수의 반환값을 비교하여 순서대로 정렬
"""
t = int(input())

for _ in range(t):
    n = int(input())
    a = []
    
    for _ in range(n):
        s,l = map(str, input().split())
        a.append([s,int(l)])
    
    a = sorted(a, key = lambda x: x[1]) #key는 a순으로 정렬
    print(a[-1][0])
