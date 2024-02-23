def solution(my_str, n):
    answer = []
    for _ in my_str:
        answer.append(my_str[0:n])
        my_str = my_str.replace(my_str, my_str[n:])
    return ' '.join(answer).split()

print('Test 1 :', solution("abc1Addfggg4556b",6))
print('Test 2 :', solution("abcdef123",3))