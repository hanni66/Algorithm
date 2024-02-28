def solution(array):
    answer = 0
    for i in str(array):
        if i == '7':
            answer += 1
    return answer

def solution(array):
    return str(array).count('7')

print("Test 1 :", solution([7,77,17]))
print("Test 2 :", solution([10,29]))