

public class Csbt {
    public static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int num = 1211; // Replace with any 3 digit number
        int reversedNum = reverse(num);

        if (num == reversedNum) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num+" is not a palindrome");
        }
    }
}
