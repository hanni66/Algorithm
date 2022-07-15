//
//  baek_5691.swift
//  algorithm
//
//  Created by 김하은 on 2022/07/15.
//

import Foundation

func b5691() {
    // 평균과 중앙값을 같게 만드는 가장 작은 정수를 찾는 프로그램을 작성
    // 평균 = (A+B+C)/3
    // 중앙값 = A+B/2 == C
    // 0, 0이 입력되면 끝남.
    var array : [Int] = []
    while true {
        let input = readLine()!.split(separator: " ").map{ Int($0)! }
        let a = input[0]
        let b = input[1]
        let c = a - (b-a)
        
        if input[0] + input[1] == 0 { break }       // 0,0 을 입력받으면 종료
        
        if a == (a+b+c)/3 || b == (a+b+c)/3 || c == (a+b+c)/3{
            array.append(c)
        }
    }
    for i in 0..<array.count {
        print("\(array[i])")
    }
}
