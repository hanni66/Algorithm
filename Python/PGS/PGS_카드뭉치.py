def solution(cards1, cards2, goal):
    for i in goal:
        if len(cards1) and i == cards1[0]:
            del cards1[0]
        elif len(cards2) and i == cards2[0]:
            del cards2[0]
        else:
            return "No"
    return "Yes"

print(solution(["i", "drink", "water"], ["want", "to"], ["i", "want", "to", "drink", "water"]))
print(solution(["i", "water", "drink"], ["want", "to"], ["i", "want", "to", "drink", "water"]))