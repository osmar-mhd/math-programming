public class RealNumbersProperties {
    
    public static int closureAddition(int a, int b){
        return a + b;
    }

    public static int closureMultiplication(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("Closure Addition: " + closureAddition(3, 5));
        System.out.println("Closure Multiplication: " + closureMultiplication(2, -3));
    }

}