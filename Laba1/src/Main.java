void main() {

    for (; ; ) {
        System.out.println("\n1 - задача №1\n" +
                "2 - задача №2\n" +
                "3 - задача №3\n" +
                "0 - выход\n" +
                "Выберите действие: ");

        Scanner in = new Scanner(System.in);

        int choise = in.nextInt();

        switch (choise) {

            case 1:
                String[] mass = new String[3];
                for (int i = 0; i < 3; i++) {
                    System.out.print("Введите строку под номером %d: ".formatted(i + 1));
                    mass[i] = in.next();
                }

                for (int i = 2; i >= 0; i--) {
                    System.out.println(mass[i]);
                }

                break;
            case 2:
                System.out.print("Введите число: ");
                int num = in.nextInt();
                if (num <= 10 && num >= -10) {
                    System.out.println("Число в диапазоне");
                } else {
                    System.out.println("Число вне диапазона");
                }
                break;
            case 3:
                System.out.print("Введите размер квадрата: ");
                int size = in.nextInt();
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        System.out.print("*  ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.print("Введите столицу: ");
                String captain = in.next();
                switch (captain){
                    case "Минск":
                        System.out.println("Беларусь");
                        break;
                    case "Москва":
                        System.out.println("Москва");;
                        break;
                    case "Киев":
                        System.out.println("Украина");
                    default:
                        System.out.println("Мимо");
                        break;

                }
            case 0:
                return;
            default:
                System.out.println("Некорректный ввод.");
                break;
        }
    }
}
