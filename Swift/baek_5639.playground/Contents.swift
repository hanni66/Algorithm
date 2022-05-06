import UIKit
import Foundation

var node = [Int]()

while let s = readLine(), let n = Int(s) {
    node.append(n)
}

func postOrder(start : Int, end : Int) {
    
    if start > end { return }
    
    var index = end+1
    for i in start...end {
        if node[start] < node[i] {
            index = i
            break
        }
    }
    
    postOrder(start: start+1, end: index - 1)
    postOrder(start: index, end: end)
    print(node[start])
}

postOrder(start: 0, end: node.count - 1)
