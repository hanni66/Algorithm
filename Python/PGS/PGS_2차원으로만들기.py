def solution(num_list, n):
    answer = [[]]
    for _ in num_list:
        answer.append(num_list[0:n])
        num_list = num_list[n:]
    return list(filter(None, answer))

# def solution(num_list, n):
#     answer = []
#     for i in range(0, len(num_list), n):
#         answer.append(num_list[i:i+n])
#     return answer


print('Test 1 :', solution([1, 2, 3, 4, 5, 6, 7, 8],2))
print('Test 2 :', solution([100, 95, 2, 4, 5, 6, 18, 33, 948],3))