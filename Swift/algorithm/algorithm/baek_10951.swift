//
//  baek_10951.swift
//  algorithm
//
//  Created by 김하은 on 2022/06/29.
//

import Foundation

func b10951() {
    while let input = readLine(){
        print(input.split(separator: " ").map{ Int($0)! }.reduce(0, +))
    }
}
