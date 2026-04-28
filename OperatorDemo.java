class OperatorDemo {
    public static void main(String[] args) {

        int a = 5, b = 15;

        // Arithmetic Operators
        System.out.println("Addition : " + (a + b));
        System.out.println("Subtraction : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division : " + (a / b));
        System.out.println("Modulo : " + (a % b));
        System.out.println(5 + 10 + " sample : ");

        // Relational Operators
        System.out.println("Equal : " + (a == b));
        System.out.println("Not Equal : " + (a != b));
        System.out.println("Greater : " + (a > b));
        System.out.println("Less : " + (a < b));
        System.out.println("Greater or equal to : " + (a >= b));
        System.out.println("Lesser or equal to : " + (a <= b));

        // Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println("Logical AND : " + (x && y));
        System.out.println("Logical OR : " + (x || y));
        System.out.println("Logical NOT : " + (!x));

        // Assignment Operators
        int c = 10;
        c += 5;
        System.out.println("c += 5 : " + c);

        c -= 3;
        System.out.println("c -= 3 : " + c);

        c *= 2;
        System.out.println("c *= 2 : " + c);

        c /= 4;
        System.out.println("c /= 4 : " + c);

        c %= 3;
        System.out.println("c %= 3 : " + c);

        // Unary Operators
        int d = 5;
        System.out.println("Unary + : " + (+d));
        System.out.println("Unary - : " + (-d));
        System.out.println("Post Increment : " + (d++));
        System.out.println("After Post Increment : " + d);
        System.out.println("Pre Increment : " + (++d));
        System.out.println("Post Decrement : " + (d--));
        System.out.println("Pre Decrement : " + (--d));

        // Bitwise Operators
        int m = 6, n = 3;

        System.out.println("Bitwise AND : " + (m & n));
        System.out.println("Bitwise OR : " + (m | n));
        System.out.println("Bitwise XOR : " + (m ^ n));
        System.out.println("Bitwise Complement : " + (~m));

        // Shift Operators
        System.out.println("Left Shift : " + (m << 1));
        System.out.println("Right Shift : " + (m >> 1));
        System.out.println("Unsigned Right Shift : " + (m >>> 1));

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Maximum using ternary : " + max);

    }
}