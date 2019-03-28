public class FindMax {
    public static void main(String[] args) {
        int[][] number = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int max = 0;
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                if (max < number[i][j]) {
                    max = number[i][j];
                    index1 = i;
                    index2 = j;
                }
            }
        }
        System.out.println("Number Max in Array is " + max + " in posision " + index1 + " " + index2);
    }
}
