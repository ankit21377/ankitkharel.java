import java.util.Scanner;

public class AllInOne {

    public static void printAsciiTable() {
        for (int i = 0; i < 128; i++) {
            System.out.println(i + " : " + (char) i);
        }
    }

    public static void calculateCompoundInterest(double principal, double rate, double time) {
        double amount = principal * Math.pow((1 + (rate / 100)), time);
        double ci = amount - principal;
        System.out.println("The Compound Interest is: " + ci);
    }

    public static void convertDays(int days) {
        int years = days / 365;
        days %= 365;
        int months = days / 30;
        days %= 30;
        System.out.println(years + " years " + months + " months and " + days + " days");
    }

    public static void countDigits(String n) {
        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            if (Character.isDigit(n.charAt(i))) {
                count++;
            }
        }
        System.out.println("Given string has " + count + " digits");
    }

    public static void countUpperLower(String a) {
        int low = 0, up = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (Character.isLowerCase(ch)) low++;
            else if (Character.isUpperCase(ch)) up++;
        }
        System.out.println("Uppercase: " + up + ", Lowercase: " + low);
    }

    public static void cube(int b) {
        double result = Math.pow(b, 3);
        System.out.println("Cube of " + b + " is " + result);
    }

    public static boolean isDuck(String n) {
        if (n.charAt(0) == '0') return false;
        for (int i = 1; i < n.length(); i++) {
            if (n.charAt(i) == '0') return true;
        }
        return false;
    }

    public static void printFactors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) System.out.println(i);
        }
    }

    public static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static void isHarshad(int n) {
        int sum = 0, temp = n;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        if (temp % sum == 0)
            System.out.println(temp + " is a Harshad number.");
        else
            System.out.println(temp + " is not a Harshad number.");
    }

    public static boolean isKaprekar(int num) {
        if (num == 1) return true;
        int square = num * num, count = 0, temp = square;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        for (int i = 1; i < count; i++) {
            int divisor = (int) Math.pow(10, i);
            int left = square / divisor, right = square % divisor;
            if (right != 0 && left + right == num)
                return true;
        }
        return false;
    }

    public static void multiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
            System.out.println();
        }
    }

    public static void printOdd(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) System.out.println(i);
        }
    }

    public static boolean isPalindrome(int n) {
        int rev = 0, temp = n;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return temp == rev;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void palindromePrime(int n) {
        if (isPalindrome(n) && isPrime(n))
            System.out.println("Given number is both palindrome and prime");
        else
            System.out.println("Given number is not palindrome and prime");
    }

    public static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    public static int sumOfN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    public static void sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        System.out.println("Sum of square of digits is: " + sum);
    }

    public static void swapWithTemp(int a, int b) {
        System.out.println("Before swap a: " + a + ", b: " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap a: " + a + ", b: " + b);
    }

    public static void swapWithoutTemp(int a, int b) {
        System.out.println("Before swap a: " + a + ", b: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap a: " + a + ", b: " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
    }
}
