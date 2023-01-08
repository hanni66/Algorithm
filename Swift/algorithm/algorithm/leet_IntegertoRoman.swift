import Foundation

class Solution_1111 {
    let i = "I"  // 1
    let v = "V"  // 5
    let x = "X"  // 10
    let l = "L"  // 50
    let c = "C"  // 100
    let d = "D"  // 500
    let m = "M"  // 1000

    func intToRoman(_ num: Int) -> String {

        if num <= 10 {
            return intToTen(num)
        } else if (10 < num && num <= 100) {
            return intToHun(num)
        } else if (100 < num && num <= 1000) {
            return intToTho(num)
        } else {
            return (m + intToTho(num))
        }
    }

    func intToTen(_ num: Int) -> String {
            if num <= 5 {
                if num == 0 {
                    return x
                } else if num == 4 {
                    return i + v
                } else if num == 5 {
                    return v
                } else {
                   return String(repeating: "I", count: num)
                }
            } else if (5 < num && num <= 10) {
                if num == 9 {
                    return (i + x)
                } else if num == 10 {
                    return x
                } else {
                   return(v + String(repeating: "I", count: num))
                }
            }
        }

    func intToHun(_ num: Int) -> String {
            if num <= 10 {
                return intToTen(num)
            } else if (10 < num && num < 39) {
                return (String(repeating: "X", count: num/10) + intToTen(num%10))
            } else if num == 40 {
                return (x + l)
            } else if 40 < num && num < 50 {
                return (x + l + intToTen(num%10))
            } else if num == 50 {
                return l
            } else if (50 < num && num < 90) {
                return (l + String(repeating: "X", count: (num-50)/10) + intToTen(num%10))
            } else if num == 90 {
                return (x + c)
            } else if (90 < num && num < 100) {
                return (x + c + intToTen(num%10))
            } else if num == 100 {
                return c
            }
        }

    func intToTho(_ num: Int) -> String {
        if num <= 10 {
            return intToTen(num)
        } else if (10 < num && num <= 100) {
             return intToHun(num)
        } else if (100 < num && num < 400) {
            return (String(repeating: "C", count: num/100) + intToHun(num%10))
        } else if num == 400 {
            return (c + d)
        } else if (400 < num && num < 500) {
            return (c + d + intToHun(num%10))
        } else if num == 500 {
            return d
        } else if (500 < num && num < 900) {
            return (d + String(repeating: "C", count: (num-500)/100) + intToHun(num%10))
        } else if num == 900 {
            return (c + m)
        } else if (900 < num && num < 1000) {
            return (c + m + intToHun(num%10))
        } else if num == 1000 {
            return m
        }
    }
}