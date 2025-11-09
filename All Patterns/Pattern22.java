public class Pattern22 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 0; i < n; i++) {
            int odd = 1, even = 2;
            char data = 'A';
            for(int j = 0; j < n; j++) {
                if (i >= j) {
                    if(i % 2 == 0) {
                        System.out.print(odd + "  ");
                        odd += 2;
                    }
                    else {
                        System.out.print(data + "  ");
                        data++;
                    }
                }
                else {
                    System.out.print(even + "  ");
                    even+=2;
                }
            }
            System.out.println();
        }
    }
}
