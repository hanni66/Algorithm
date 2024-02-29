def solution(answers):
    answer = []
    p1, p2, p3 = [1,2,3,4,5], [2,1,2,3,2,4,2,5], [3,3,1,1,2,2,4,4,5,5]
    score = [0, 0, 0]
    
    for i in range(len(answers)):
        if answers[i] == p1[i%len(p1)]:
            score[0] += 1
        if answers[i] == p2[i%len(p2)]:
            score[1] += 1
        if answers[i] == p3[i%len(p3)]:
            score[2] += 1
    
    for index, value in enumerate(score):
        if value == max(score):
            answer.append(index+1)
    return answer

print("Test 1 :", solution([1,2,3,4,5]))
print("Test 2 :", solution([1,3,2,4,2]))
print("Test 2 :", solution([5,5,5,5,5,5,5,5]))