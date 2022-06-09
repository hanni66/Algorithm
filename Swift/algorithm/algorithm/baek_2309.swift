//
//  baek_2309.swift
//  algorithm
//
//  Created by 김하은 on 2022/06/08.
//

import Foundation

func b2309() {
    var h : [Int] = []           // 키를 입력받을 배열 생성
    var sum = 0       // 9명 키의 총 합을 저장할 변수
    
    for _ in 0..<9 {
        h.append(Int(readLine()!)!)
    }
    
    sum = h.reduce(0, +)
    
    choiceloop : for i in 0...9-2 {                // 2명을 고르기 위한 반복문
        for j in i+1...9-1 {
            if sum - (h[i] + h[j]) == 100 {    // 총 합에서 2명을 뺐을 때 100이 되면
                h[i] = 0
                h[j] = 0
                break choiceloop
            }
        }
    }
    
    h.sort()
    
    for i in 2..<9 {
        print(h[i])
    }
}
