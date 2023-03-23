//
//  leet_724.swift
//  algorithm
//
//  Created by 김하은 on 2023/03/23.
//

import Foundation

class Solution724 {
    func pivotIndex(_ nums: [Int]) -> Int {
        let revernum : [Int] = nums.reversed()
        var leftsum = [Int](repeating: 0, count: nums.count)
        var rightsum = [Int](repeating: 0, count: nums.count)
        
        if leftsum.count == 1 {return 0}
        leftsum[0] = nums[0]
        rightsum[0] = revernum[0]
        
        for i in 1...nums.count-1 {
            leftsum[i] = leftsum[i-1] + nums[i]
            rightsum[i] = rightsum[i-1] + revernum[i]
        }
        
        let newright : [Int] = rightsum.reversed()
        
        for j in 0...nums.count-1 {
            if leftsum[j] == newright[j] {
                return j
            }
        }
        return -1
    }
}
