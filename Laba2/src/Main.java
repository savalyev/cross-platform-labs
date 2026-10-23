void main() {

    for (; ; ) {
        System.out.println("\n1 - задача №1\n" +
                "2 - задача №2\n" +
                "0 - выход\n" +
                "Выберите действие: ");

        Scanner in = new Scanner(System.in);

        int choise = in.nextInt();

        switch (choise) {

            case 1:
                int size;
                do {
                    System.out.print("Введите размер массива: ");
                    size = in.nextInt();
                } while (size <= 0);

                double[] arr = new double[size];

                System.out.println("Заполните массив");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print("Введите элемент массива %d: ".formatted(i + 1));
                    arr[i] = in.nextDouble();
                }

                System.out.println("Ваш массив: ");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }

                double proiz = 1;
                for (int i = 1; i < arr.length; i += 2) {
                    proiz *= arr[i];
                }

                System.out.println("\nПроизведение элементов на нечетных позициях:  " + proiz);
                break;

            case 2:
                int matrixSize;
                do {
                    System.out.print("Введите размер массива: ");
                    matrixSize = in.nextInt();
                } while (matrixSize <= 0);
                int[][] matrix = new int[matrixSize][matrixSize];

                Random rand = new Random();
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        matrix[i][j] = rand.nextInt(11);
                    }
                }

//                System.out.println("Заполните матрицу: ");
//                for (int i = 0; i < matrix.length; i++) {
//                    for (int j = 0; j < matrix[i].length; j++) {
//                        System.out.print("Введите элемент массива на позиции [%d][%d]): ".formatted(i + 1, j + 1));
//                        matrix[i][j] = in.nextInt();
//                    }
//                }

                System.out.println("Ваша матрица: ");
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.print(matrix[i][j] + "  ");
                    }
                    System.out.println();
                }

                int count = 0;
                int sum = 0;
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (i + j >= matrixSize) {
                            if (matrix[i][j] < 0) {
                                count++;
                                sum += matrix[i][j];
                            }
                        }
                    }
                }

                System.out.println("Сумма отрицательных элементов: " + sum);
                System.out.println("Количество отрицательных элементов: " + count);
                break;
            case 0:
                in.close();
                return;
            default:
                System.out.println("Мимо");
                break;
        }
    }
}
