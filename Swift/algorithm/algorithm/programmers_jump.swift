//
//  programmers_jump.swift
//  algorithm
//
//  Created by 김하은 on 2023/02/18.
//

import Foundation

func solutionJump(_ n:Int) -> Int
{
    var answer = 0
    var N = n
    
    while N != 0 {
        if N % 2 == 1 {
            answer += 1
        }
        N = N/2
    }
    
    return answer
}
