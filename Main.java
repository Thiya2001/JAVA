import java.util.*;
class Main {
    public static void main(String args[]) {
        // chalk problem
       /* double noc,sum;
        Scanner in = new Scanner(System.in);
        noc= in.nextInt();
        sum=noc+(Math.sqrt(noc)+1);
        System.out.printf("%f",sum);*/

        // abudant or not
/*
        int noc,x=0;
        Scanner in = new Scanner(System.in);
        noc= in.nextInt();
        for(int i=1;i<noc;i++) {
            if(noc%i== 0) {
                x+=i;
            }
        }
            if(noc<x)
            {
                System.out.println("Abudant NO");
            }
            else {
                System.out.print("Not abudant No");

            }*/
       /*   Friendly pair
        int noc,noc1,x=0,y=0;
        Scanner in = new Scanner(System.in);
        noc= in.nextInt();
        noc1= in.nextInt();
        for(int i=1;i<noc;i++) {
            if (noc% i == 0) {
                x += i;
            }
        }
        for(int j=1;j<noc1;j++){
            if(noc1%j==0)
            {
                y+=j;
            }
        }

        if(x/noc==y/noc1)
        {
            System.out.println("friendly pair");
        }
        else{
            System.out.print("Not Friendly pair");
        }
*/
        int n, a[], sum = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[5];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            sum += a[i];

        }
        System.out.print(sum);
    }
}











































































































































































































































































































































































































































































































































































































































































































