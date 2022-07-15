//
//  programmersGymSuit.swift
//  algorithm
//
//  Created by 김하은 on 2022/07/13.
//

import Foundation

import Foundation

func solution(_ n:Int, _ lost:[Int], _ reserve:[Int]) -> Int {
    // 가지고 있는 체육복 개수 저장
    var c = [Int](repeating: 1, count: n)
    
    // 잃어버린 사람은 체육복 0벌로 만들기
    for l in lost {
        c[l-1] = 0
    }
    // 여벌 가져 온 사람은 +1 벌로 만들기
    for r in reserve {
        c[r-1] += 1
    }
    
    var counting = 0 // 체육복을 빌리지 못한 학생 수
    for i in 0..<n {
        if c[i] == 0 {  // 체육복이 없으면
            if i > 0 && c[i-1] > 1 { // 앞번호에게 빌림.
                c[i] = 1
                c[i-1] = 1
            } else if i < n-1 && c[i+1] > 1 { // 뒷번호에게 빌림.
                c[i] = 1
                c[i+1] = 1
            } else {    // 못 빌림.
                counting += 1
            }
        }
    }
    
    return n - counting
}
