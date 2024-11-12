// Курсовая работа 1, Введение в профессию и синтаксис языка.
// Кузьмин Сергей
// Java-разработчик IND 36.0
//
public class Main {
    public static void main(String[] args) {
        //EmployeeBook employeeBook = new EmployeeBook();

        EmployeeBook.addEmployer("Иванов Иван Иванович", 1, 1020);
        EmployeeBook.addEmployer("Иванов Петр Иванович", 2, 1040);
        EmployeeBook.addEmployer("Сергеев Иван Андреевич", 3, 1100);
        EmployeeBook.addEmployer("Петров Алексей Григорьевич", 4, 1600);
        EmployeeBook.addEmployer("Васечкин Иван Макарович", 5, 1900);
        EmployeeBook.addEmployer("Иванов Иван Капусткин", 1, 1650);
        EmployeeBook.printAllEmployers();
        // Распечатываем все контакты
        System.out.println("Всего сотрудников: " + EmployeeBook.getCurrentSize());
        // Распечатываем размер телефонной книги
        System.out.println();

        EmployeeBook.findEmployers("Иван Иванович Иванов");
        // Ищем контакт Иванов Иван4
        System.out.println();

        //employeeBook.removeEmployer("Иван Иванович Иванов");
        // Удаляем контакт Иванов Иван4
        EmployeeBook.findEmployers("Иван Иванович Иванов");
        // Ищем контакт Иванов Иван4
        EmployeeBook.printAllEmployers();
        // Снова распечатываем все контакты
        System.out.println("Всего сотрудников: " + EmployeeBook.getCurrentSize());
        // Снова распечатываем размер телефонной книги
    }

}
