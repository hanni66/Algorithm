//
//  baek_1931.swift
//  algorithm
//
//  Created by 김하은 on 2022/05/31.
//

import Foundation

func b1931() {
    let N = Int(readLine()!)!   // 회의의 수 입력받기
    var array: [[Int]] = [[Int]].init(repeating: [Int].init(repeating: 0, count: 2), count: N)     // 시간을 입력할 2차원 배열 변수 생성
    
    for i in 0...N-1 {
        let input = readLine()!.split(separator: " ").map{ Int($0.description)! }
        array[i][0] = input[0]
        array[i][1] = input[1]
    }
    
    let sortedArray = array.sorted { o1, o2 in      // 뒤 원소를 기준으로 정렬
        if(o1[1] == o2[1]) {
            return o1[0] < o2[0]
        }else {
            return o1[1] < o2[1]
        }
    }
    
    
    var com = 0          // 비교할 변수
    var count = 0        // 횟수를 저장할 변수
    
    for i in 0...N-1 {
        if(sortedArray[i][0] >= com) {
            com = sortedArray[i][1]
            count += 1
        }
    }
    
    print(count)
}
