N = int(input())
A = list(map(int, input().split()))

roundSize = N*2

roundSize += A[0] + A[-1]

for idx in range(N-1):
	roundSize += abs(A[idx] - A[idx+1])
	
print(roundSize)