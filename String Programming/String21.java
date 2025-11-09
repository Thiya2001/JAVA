public class String21 {
    public static void solve(String s) {
        char a[] = s.toCharArray();
        String nums= "";
        for(int i=1;i<a.length;i++) {
            if(Character.isDigit(a[i])) {
                nums += a[i];
            }
            else {
                nums += " "; //This if condition only stored digit nums = "10 2 13 4"
            }
        }
        String b[] = nums.split(" ");
        for(int i=0,x=0;i<a.length;i++) {
            if(Character.isLetter(a[i])) {
                for(int k=1;k<=Integer.parseInt(b[x]);k++)
                System.out.print(a[i] + " ");
                System.out.println();
                x++;
            }
        }
    }
    public static void main(String[] args) {
        String s = "a10b2c13d4";
        solve(s);
    }
}