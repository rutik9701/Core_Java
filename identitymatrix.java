
public class identitymatrix {

    public static void main(String[] args) {

        int[][] arr = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    arr[i][j] = 1;

                } else {
                    arr[i][j] = 0;
                }
            }

        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");

        }

        boolean zero_check = true;
        boolean one_check = true;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    if (arr[i][j] != 1) {
                        one_check = false;
                    } else {
                        if (arr[i][j] != 1) {
                            zero_check = false;
                        }
                    }

                }

            }
            if (zero_check && one_check) {
                System.out.println("The given matrix is an identity matrix");
            } else {
                System.out.println("The given matrix is not an identity matrix");

            }
        }
    }
}
