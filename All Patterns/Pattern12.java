public class Pattern12 {
    public static void main(String[] args) {
        char i , j;
        for(i='A';i<='E';i++) {
            for(j='A';j<='E';j++) {
                if(j == j) {
                System.out.print(" " + j + " ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
