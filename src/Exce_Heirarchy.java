public class Exce_Heirarchy {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;

            String str = null;
            System.out.println(str.length());

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Generic Exception: " + e.getMessage());
        }
    }
}

