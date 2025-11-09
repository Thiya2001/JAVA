public class Array39 {
    public static void peekElement(int[] a) {
        if(a.length < 3) {
            System.out.println("Invalid");
            return;
        }
        int x = 0, y = 1, z = 2;
        for(int i=0;i<a.length-2;i++,x++,y++,z++) {
            if(a[y] > a[x] && a[y] > a[z])
            System.out.print(a[y] + " ");
        }
    }
    public static void main(String[] args) {
        int[] a = {2,8,7,7,9,1,2,3,1,0,4,0};
        peekElement(a);
    }
}
