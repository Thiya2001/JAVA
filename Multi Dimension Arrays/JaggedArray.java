public class JaggedArray {
    public static void main(String[] args) {
        int[][] a = {
            {7,2,7,1,4},
            {8,6,2,2,1},
            {7,4,3,7,7},
            {4,1,3,2,1},
        };
        for (int i=0;i<a.length;i++) {
            int[] temp = new int[a[i].length];
            int size = 0;
            for (int j=0;j<a[i].length;j++) {
                int current = a[i][j];
                boolean exists = false;
                for (int k=0;k<size;k++) {
                    if (temp[k] == current) {
                        exists = true;
                        break;
                    }
                }
                if (!exists) {
                    temp[size] = current;
                    size++;
                }
            }
            for (int k=0;k<size;k++) {
                System.out.print(temp[k] + " ");
            }
            System.out.println();
        }
    }
}
