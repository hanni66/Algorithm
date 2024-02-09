def solution(quiz):
    answer = []
    for i in quiz:
        quiz_exp = i.split('=')

        if eval(quiz_exp[0]) == eval(quiz_exp[1]):
            answer.append("O")
        else:
            answer.append("X")
    
    return answer