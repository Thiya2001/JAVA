/*import java.util.Scanner;
public class String15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String : ");
        String s = sc.nextLine();
        isHello(s);
    }
    public static void isHello(String s) {
        String check="";
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++) {
            int count=0;
            char ch = s.charAt(i);
            if(check.indexOf(ch)!= -1){
                continue;
            }
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j))
                    count++;
            }
            System.out.println(ch + " - " + count);
            check+=ch;
        }
    }
}*/

import java.util.Scanner;
public class String15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String : ");
        String s = sc.nextLine();
        isHello(s);
    }
    public static void isHello(String s) {
        char a[] = s.toCharArray();
        for(int i=0;i<a.length;i++) {
            if(a[i] == ' ')
            continue;
            int count = 1;
            for(int j=i+1;j<a.length;j++) {
                if(a[i] == a[j]) {
                count++;
                a[j] = ' ';
                }
            }
            System.out.println(a[i] + " : " + count);
        }
    }
}