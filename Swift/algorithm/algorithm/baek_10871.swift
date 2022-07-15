//
//  baek_10871.swift
//  algorithm
//
//  Created by 김하은 on 2022/07/15.
//

import Foundation

func b10871() {
    let input = readLine()!.split(separator: " ").map{ Int($0)! }
    var input1 : [Int] = []

    while true {
        input1 = readLine()!.split(separator: " ").map{ Int($0)! }
        if input1.count == input[0] { break }
    }

    for i in 0..<input[0] {
        if input1[i] < input[1] {
            print(input1[i], terminator: " ")
        }
    }
}
