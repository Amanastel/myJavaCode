function reverse(num) {
    return parseInt(num.toString().split("").reverse().join(""));
}


let num = 13212; // Replace with any 3 digit number
let reversedNum = reverse(num);
console.log(typeof reversedNum)

console.log(reversedNum)
if (num === reversedNum) {
    console.log(`${num} is a palindrome`);
} else {
    console.log(`${num} is not a palindrome`);
}
