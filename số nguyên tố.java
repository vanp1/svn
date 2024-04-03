
public class PrimeNumberCheck {

    public static void main(String[] args) {
        int num = 29;
        boolean flag = isPrime(num);
        if (flag) {
            System.out.println(num + " là số nguyên tố");
        } else {
            System.out.println(num + " không phải là số nguyên tố");
        }
    }

// da sua

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
