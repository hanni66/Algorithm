n, m = map(int, input().split())
order_dict = { i+1 : 0 for i in range(n)}

while m > 0:
  a, b = map(int, input().split())
  if a in order_dict:
    order_dict[a] += b
  m -= 1

max_value = max(order_dict.values())
print(max([key for key, value in order_dict.items() if value == max_value]))