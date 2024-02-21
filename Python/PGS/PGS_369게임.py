def solution(order):
    order = str(order)
    return order.count(str(3)) + order.count(str(6)) + order.count(str(9))