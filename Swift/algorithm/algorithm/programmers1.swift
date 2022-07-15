//
//  programmers1.swift
//  algorithm
//
//  Created by 김하은 on 2022/06/02.
//

import Foundation

func solutionSum(_ a:Int, _ b:Int) -> Int {  // 수열 공식 이용
    return Int(a + b) * Int(max(a, b) - min(a, b) + 1) / Int(2)
}
