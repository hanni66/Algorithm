import Foundation
// 1차시 문제 풀이 : 입력받아 Array에 넣는 것이 틀림.
// 입력받아 Array에 바로 mapping해주기
//var input = Array(readLine()!).map{Int(String($0))!}
// 배열을 정렬해준다.
//input.sort(by: >)
// 배열 출력
//print(input)

// 답안 보고 작성
let input = readLine()! // 입력받기
var array: [Int] = []   // 배열 생성

for i in input {        // 입력 받은 수 배열에 넣기
    array.append(Int(String(i))!)
}

array.sort(by: >)       // 배열 내림차순 정렬

for i in 0..<array.count {  // array.length가 swift에서는 array.count 인 것 같다.
    print("\(array[i])", terminator: "")
}


