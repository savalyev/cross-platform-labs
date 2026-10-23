void main() {

    for (; ; ) {
        System.out.println("\n1 - задача №1\n" +
                "2 - задача №2\n" +
                "3 - задача №3\n" +
                "4 - задача №4\n" +
                "0 - выход\n" +
                "Выберите действие: ");

        Scanner in = new Scanner(System.in);

        int choise = in.nextInt();
        in.nextLine();

        switch (choise) {

            case 1:
                System.out.print("Введите строку: ");
                String s = in.next();
                if (s.endsWith(".txt")) {
                    System.out.println("Да, строка заканчивается на .txt");
                } else {
                    System.out.println("Нет, строка не заканчивается на .txt");
                }
                break;

            case 2:
                System.out.print("Введите ФИО через пробел: ");
                String fio = in.nextLine().trim();
                String[] arr = fio.split("\\s+");
                System.out.println(arr[0] + " " + arr[1].charAt(0) + ". " + arr[2].charAt(0) + ".");
                break;
            case 3:
                System.out.println("Введите размер массива: ");
                int size;
                do {
                    size = in.nextInt();
                } while (size < 1);

                Employee[] arrEmployee = new Employee[size];
                for (int i = 0; i < arrEmployee.length; i++) {
                    System.out.println("Заполните данные о сотруднике №" + (i + 1));
                    System.out.print("Введите имя: ");
                    String name = in.next();
                    System.out.print("Введите зарплату: ");
                    double salary = in.nextDouble();
                    arrEmployee[i] = new Employee(name, salary);
                }
                Report.generateReport(arrEmployee);
                break;

            case 4:
                String text = "aAa aBa aCa aDa aEa";
                String[] arrText = text.split("\\s+");
                String regex = "^a[A-D]a$";

                for (String word : arrText) {
                    if (word.matches(regex)) {
                        System.out.println(word);
                    }
                }
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
