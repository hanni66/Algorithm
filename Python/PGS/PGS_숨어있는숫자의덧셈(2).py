import re

def solution(my_string):
    number = re.findall(r'\d+', my_string)
    return sum(map(int, number))

print(solution("aAb1B2cC34oOp"))