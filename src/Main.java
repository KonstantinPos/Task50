public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[6][7];
        int max1 = 0;
        int max2 = 0;
       
        //создаем массив из случайных чисел
        System.out.println("Массив до преобразования");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 9);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //находим самый большой элемент
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[max1][max2] < arr[i][j]) {
                    max1 = i;
                    max2 = j;

                }

            }
            int temp = arr[i][0];
            arr[i][0] = arr[max1][max2];
            arr[max1][max2] = temp;

            System.out.println(arr[max1][max2]);
            max1 = i;
            max1++;
            max2 = 0;
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
