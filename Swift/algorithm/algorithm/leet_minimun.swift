//
//  leet_minimun.swift
//  algorithm
//
//  Created by 김하은 on 2023/01/12.
//

import Foundation

func largestOddNumber(_ num: String) -> String {
    var inum = Int(num)!
    var startnum = num.startIndex
    var lastnum : String.Index
    
    if (inum%2 != 0) {
        return num
    } else {
        for i in 1...5 {
            let poow = pow(10, i)
            let intpow = (poow as NSDecimalNumber).intValue
            if (inum / intpow)%2 != 0 {
                lastnum = num.index(startnum, offsetBy: -(1+i))
                return String(num[startnum...lastnum])
            }
        }
    }
    return "error"
}

func largestOddNumber1(_ num: String) -> String {
    var newnum = num
    
    for i in newnum.reversed() {
        if (Int(String(i))!) % 2 == 0 {
            newnum.removeLast()
            continue
        }
        break
    }
    
    return newnum
}
