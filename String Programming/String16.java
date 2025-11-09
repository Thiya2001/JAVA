/*import java.util.Scanner;
public class String16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String : ");
        String s = sc.nextLine();
        System.out.println(isRemoveDuplicate(s));
    }
    public static String isRemoveDuplicate(String s) {
        s = s.toLowerCase();
        String res = "";
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(res.indexOf(ch) == -1)
            res += ch;
        }
        return res;
    }
}*/

import java.util.Scanner;
public class String16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String : ");
        String s = sc.nextLine();
        System.out.println(isRemoveDuplicate(s));
    }
    public static String isRemoveDuplicate(String s) {
        String ans = "";
        char a[] = s.toCharArray();
        for(int i=0;i<a.length;i++) {
            if(a[i] == ' ')
            continue;
            for(int j=i+1;j<a.length;j++) {
                if(a[i] == a[j]) {
                    a[j] = ' ';
                }
            }
            ans += a[i];
        }
        return ans;
    }
}