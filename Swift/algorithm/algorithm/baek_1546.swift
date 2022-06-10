//
//  baek_1546.swift
//  algorithm
//
//  Created by 김하은 on 2022/06/10.
//

import Foundation

func b1546() {
    let n = Double(readLine()!)!
    let a = readLine()!.split(separator: " ").map { Double(String($0))! }
    let maxx = a.max()!
    let b = a.map { $0 / maxx * 100 }
    var sum = 0.0
    
    for x in b {
        sum += x
    }
    
    print(sum / n)
}
