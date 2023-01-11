//
//  leet_minimun.swift
//  algorithm
//
//  Created by 김하은 on 2023/01/12.
//

import Foundation

func minimumSum(_ num: Int) -> Int {
    let arr = Array(arrayLiteral: num).sorted()
    var numm = 0
    
    numm = Int(arr[1]+arr[2])
    
    print(numm)
    
    return numm
}
