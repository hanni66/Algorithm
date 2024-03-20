def solution(id_pw, db):
  answer = ""

  for user in db :
    if id_pw[0] == user[0] and id_pw[1] == user[1] :
      answer = "login"
      break
    elif id_pw[0] == user[0] and id_pw[1] != user[1] :
      answer = "wrong pw"
      break
    elif id_pw[0] != user[0] and id_pw[1] == user[1] :
      answer = "wrong id"
    else: 
      answer = "fail"

  return answer

# := 연산자 공부하기
def solution(id_pw, db):
    if db_pw := dict(db).get(id_pw[0]):
        return "login" if db_pw == id_pw[1] else "wrong pw"
    return "fail"

print("Test 1 :", solution(["meosseugi", "1234"], [["rardss", "123"], ["yyoom", "1234"], ["meosseugi", "1234"]]))
print("Test 2 :", solution(["programmer01", "15789"], [["programmer02", "111111"], ["programmer00", "134"], ["programmer01", "1145"]]))
print("Test 3 :", solution(["rabbit04", "98761"], [["jaja11", "98761"], ["krong0313", "29440"], ["rabbit00", "111333"]]))