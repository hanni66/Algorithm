//
//  baek_1157.swift
//  algorithm
//
//  Created by 김하은 on 2023/03/08.
//

import Foundation

func b1157() {
    let input = readLine()!.map{ String($0).uppercased() }
    var alphabet : [String:Int] = ["A":0, "B":0,"C":0,"D":0,"E":0,"F":0,"G":0,"H":0,"I":0,"J":0,"K":0,"L":0,"M":0,"N":0,"O":0,"P":0,"Q":0,"R":0,"S":0,"T":0,"U":0,"V":0,"W":0,"X":0,"Y":0,"Z":0]
    
    for i in input {
        for j in alphabet {
            if i == j.key {
                alphabet[j.key]! += 1
            }
        }
    }
    
    let maxValue = alphabet.values.max()
    let maxKeys = alphabet.filter{$0.value == maxValue}.map{ $0.key }
    
    if maxKeys.count > 1 {
        print("?")
    } else {
        print(maxKeys.joined())
    }
}
