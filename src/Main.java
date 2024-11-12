// Курсовая работа 1, Введение в профессию и синтаксис языка.
// Кузьмин Сергей
// Java-разработчик IND 36.0
//
public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addWorker("Иванов Иван0", "1");
        employeeBook.addWorker("Иванов Иван1", "2");
        employeeBook.addWorker("Иванов Иван2", "3");
        employeeBook.addWorker("Иванов Иван3", "4");
        employeeBook.addWorker("Иванов Иван4", "5");
        employeeBook.printAllWorkers();
        // Распечатываем все контакты
        System.out.println("Всего сотрудников: " + employeeBook.getCurrentSize());
        // Распечатываем размер телефонной книги
        System.out.println();

        employeeBook.findWorker("Иванов Иван4");
        // Ищем контакт Иванов Иван4
        System.out.println();

        employeeBook.removeWorker("Иванов Иван4");
        // Удаляем контакт Иванов Иван4
        employeeBook.findWorker("Иванов Иван4");
        // Ищем контакт Иванов Иван4
        employeeBook.printAllWorkers();
        // Снова распечатываем все контакты
        System.out.println("Всего сотрудников: " + employeeBook.getCurrentSize());
        // Снова распечатываем размер телефонной книги
    }
}
