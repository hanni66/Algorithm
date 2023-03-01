//
//  baek_23971.swift
//  algorithm
//
//  Created by 김하은 on 2023/03/01.
//

import Foundation

func b23971() {
    let num = readLine()!.split(separator: " ").map { Int(String($0))! }
    var newN = 1
    var newM = 1
    var p = 0
    var q = 0
    
    while(newN <= num[0]) {
        if (newN-1)*(num[2]+1) < num[0] && num[0] <= newN * (num[2]+1) {
            p = newN
        }
        newN = newN + 1
    }
    while(newM <= num[1]) {
        if (newM-1)*(num[3]+1) < num[1] && num[1] <= newM * (num[3]+1) {
            q = newM
        }
        newM = newM + 1
    }
    
    print(p*q)
}
