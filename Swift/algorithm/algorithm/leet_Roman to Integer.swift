//
//  leet_Roman to Integer.swift
//  algorithm
//
//  Created by 김하은 on 2022/07/05.
//

import Foundation

class Solution13 {
    private let dict: [Character:Int] = ["I":1,"V":5,"X":10,"L":50,"C":100,"D":500,"M":1000]
    
    func romanToInt(_ s: String) -> Int {
        var num = 0
        var result = 0
        
        for i in s {
            let val = dict[i] ?? 0
            result += val <= num ? num : -num
            num = val
        }
        result += num
        return result
    }
}
