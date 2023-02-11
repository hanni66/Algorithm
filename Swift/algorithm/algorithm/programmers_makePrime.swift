//
//  programmers_targetNumber.swift
//  algorithm
//
//  Created by 김하은 on 2023/02/04.
//

import Foundation

func solution1234567(_ nums:[Int]) -> Int {
    var count = 0
    var newArr: [Int] = []
    
    func combination(total: [Int], shouldSelect: Int, current index: Int, selected: [Int]) {
        if shouldSelect == 0 {
            newArr.append(selected.reduce(0,+))
        } else if index == total.count {
            return
        } else {
            var newSelected = selected
            newSelected.append(total[index])
            combination(total: total, shouldSelect: shouldSelect-1, current: index+1, selected: newSelected)
            combination(total: total, shouldSelect: shouldSelect, current: index+1, selected: selected)
        }
    }

    combination(total: nums, shouldSelect: 3, current: 0, selected: [])
    
    for i in newArr {
        if isPrime(i) == true {
            count += 1
        }
    }
    
    return count
}

func isPrime(_ num: Int) -> Bool {
    if(num<4) {
        return num == 1 ? false : true
    }
    for i in 2...Int(sqrt(Double(num))) {
        if(num % i == 0) { return false }
    }
    return true
}
