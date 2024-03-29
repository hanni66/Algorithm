//
//  programmersTest.swift
//  algorithm
//
//  Created by 김하은 on 2022/08/06.
//

import Foundation

func solutionTest(_ id_list:[String], _ report:[String], _ k:Int) -> [Int] {
    var dict: [String: [String]] = [:]
        var arr: [Int] = Array(repeating: 0, count: id_list.count)
        var ids: [String: Int] = [:]
        
        // 이름에 해당하는 index dictionary 생성
        for (index, id) in id_list.enumerated() {
            ids[id] = index
        }
        
        // [ 신고당한사람 : [신고자] ]
        for repo in report {
            let arr = repo.split(separator: " ").compactMap{ String($0) }
            let name = arr[1]
            let singo = arr[0]
            if dict[name] == nil {
                dict.updateValue([singo], forKey: name)
            } else {
                if !dict[name]!.contains(singo) {
                    dict[name]!.append(singo)
                }
            }
        }

        for name in dict.keys {
            if dict[name]!.count >= k {
                for n in dict[name]! {
                    arr[ids[n]!] += 1
                }
            }
        }
        
        return arr
}
