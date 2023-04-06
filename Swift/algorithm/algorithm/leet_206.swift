//
//  leet_206.swift
//  algorithm
//
//  Created by 김하은 on 2023/04/06.
//

import Foundation

public class ListNode {
    public var val: Int
    public var next: ListNode?
    public init() { self.val = 0; self.next = nil; }
    public init(_ val: Int) { self.val = val; self.next = nil; }
    public init(_ val: Int, _ next: ListNode?) { self.val = val; self.next = next;}
}

class Solution206 {
    func reverseList(_ head: ListNode?) -> ListNode? {
        var node = head // 현재 노드
        var pre: ListNode? = nil // 바로 전 노드
        
        while node != nil {
            let next = node?.next   // 다음 노드는 현재 노드의 다음노드
            node?.next = pre    // 현재 노드의 다음 노드를 이전노드로 바꾼다
            pre = node          // 이전 노드를 현재의 노드로 이동
            node = next         // 현재의 노드를 다음노드로 이동
        }
        
        return pre
    }
}
