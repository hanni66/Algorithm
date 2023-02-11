//
//  leet-ClosestDivisors.swift
//  algorithm
//
//  Created by 김하은 on 2023/01/28.
//

import Foundation

func closestDivisors(_ num: Int) -> [Int] {
    var num1 : Int = num
    
    var arr : [Int] = []
    
    if (num1 < 4) {
        arr = [num1]
    }
    
    print(Int(sqrt(Double(num1))))
          
    for i in 2...Int(sqrt(Double(num1))) {
        if (Int(sqrt(Double(num1))) % i == 0) {
            // 소수가 아님
            num1 += 1
            return [Int(sqrt(Double(num1))), num1/Int(sqrt(Double(num1)))]
            
        } else {
            arr = [i, num1/i]
            print("2",num1)
            print(arr)
        }
    }
    print(arr)
    return arr
}
