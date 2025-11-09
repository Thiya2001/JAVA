public class RemoveDuplicate {
    public static void main(String[] args) {
        int[][]a={{7,2,7,1,4},{8,6,2,2,1},{7,4,3,7,7},{4,1,3,2,1}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                int k;
                for(k=0;k<j;k++) {
                    if(a[i][j]==a[i][k]) {
                        break;
                }
            }
                    if(j == k){
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}