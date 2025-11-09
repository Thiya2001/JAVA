public class CheckNumberPrimeOrNot {
    public static boolean isPrime(int num) {
        if(num == 1 || num == 0)
        return false;
        for(int i=2;i<num;i++) {
            if(num % i == 0)
            return false;
        }
        return true;
    }
    public static String rotate(String s) {
        char a[] = s.toCharArray();
        char f = a[0];
        for(int i=1;i<a.length;i++) {
            a[i - 1] = a[i];
        }
        a[a.length - 1] = f;
        return new String(a);
    }
    public static boolean isCyclicPrime(String s) {
        for(int i=0;i<s.length();i++) {
            int num = Integer.parseInt(s);
            if(!isPrime(num))
            return false;
            s = rotate(s);
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "1193";
        System.out.println(isCyclicPrime(s));
    }
}
