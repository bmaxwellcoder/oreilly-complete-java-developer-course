package section2javaintro;

public class ArithmeticFun {

    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        // Binary operators
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = b % a;

        System.out.println("sum is " + sum);
        System.out.println("diff is " + difference);
        System.out.println("product is " + product);
        System.out.println("quotient is " + quotient);
        System.out.println("remainder is " + remainder);

        sum += 20; // Compound operator
        System.out.println("sum is " + sum);

        // Unary operators
        sum++;
        System.out.println("sum++ " + sum);

        sum--;
        System.out.println("sum-- " + sum);

        // Challenge: multiply product by 2 and store the value back into the product
        // variable
        product *= 2;
        System.out.println("product: " + product);
    }
}
