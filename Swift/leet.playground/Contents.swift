import Foundation

class Solution {
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
            return (m + intToTho(num-1000))
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
               return(v + String(repeating: "I", count: num-5))
            }
        }
        return "error"
    }

    func intToHun(_ num: Int) -> String {
        if num <= 10 {
            return intToTen(num)
        } else if num == 20 {
            return (x + x)
        } else if num == 30 {
            return (x + x + x)
        } else if (10 < num && num <= 39 && num != 20 && num != 30) {
            return (String(repeating: "X", count: num/10) + intToTen(num%10))
        } else if num == 40 {
            return (x + l)
        } else if (40 < num && num < 50) {
            return (x + l + intToTen(num%10))
        } else if num == 50 {
            return l
        } else if num == 60 {
            return (l + x)
        } else if num == 70 {
            return (l + x + x)
        } else if num == 80 {
            return (l + x + x + x)
        } else if (50 < num && num < 90 && num != 60 && num != 70 && num != 80) {
            return (l + String(repeating: "X", count:(num-50)/10) + intToTen(num%10))
        } else if num == 90 {
            return (x + c)
        } else if (90 < num && num < 100) {
            return (x + c + intToTen(num%10))
        } else if num == 100 {
            return c
        }
        return "error"
    }

    func intToTho(_ num: Int) -> String {
        if num <= 10 {
            return intToTen(num)
        } else if (10 < num && num <= 100) {
            return intToHun(num)
        } else if num == 200 {
            return (c + c)
        } else if num == 300 {
            return (c + c + c)
        } else if (100 < num && num < 400 && num != 200 && num != 300) {
            return (String(repeating: "C", count: num/100) + intToHun(num%100))
        } else if num == 400 {
            return (c + d)
        } else if (400 < num && num < 500) {
            return (c + d + intToHun(num-400))
        } else if num == 500 {
            return d
        } else if num == 600 {
            return (d + c)
        } else if num == 700 {
            return (d + c + c)
        } else if num == 800 {
            return (d + c + c + c)
        } else if (500 < num && num < 900 && num != 600 && num != 700 && num != 800) {
            return (d + String(repeating: "C", count: (num-500)/100) + intToHun(num%100))
        } else if num == 900 {
            return (c + m)
        } else if (900 < num && num < 1000) {
            return (c + m + intToHun(num-900))
        } else if num == 1000 {
            return m
        }
        return "error"
    }
}
