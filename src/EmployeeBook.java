public class EmployeeBook {
    private static Employee[] employers;
    // Объявили массив EmployeeBook, реализуемый в классе EmployeeBook
    private static int size;
    // Объявили свойство size (размер)

    public EmployeeBook() {
        this.employers = new Employee[10];
        // Задали массиву длину — 10
    }

    // Реализуем метод (создать):
    public void addEmployer() {
        if (size >= employers.length) {
            System.out.println("Нельзя добавить контакт, закончилось место");
        }
        Employee newEmployers = new Employee(Employee.getEmployeeName(), Employee.getDepartment(), Employee.getSalary());
        employers[size++] = newEmployers;
    }

    // Реализуем метод удалить
    // Метод сдвигает массив влево на ячейку, удаляя ячейку под номером i
    public void removeEmployer(Employee employeeName) {
        for (int i = 0; i < employers.length; i++) {
            if (employers[i].getEmployeeName().equals(employeeName)) {
                System.out.println(employers[i].getEmployeeName() + " удален");
                System.arraycopy(employers, i + 1, employers, i, size - i - 1);
                employers[size - 1] = null;
                size--;
                return;
            }
        }
    }

    // Реализуем метод найти
    public static void findEmployers(String employeeName) {
        for (int i = 0; i < size; i++) {
            Employee employer = employers[i];
            if (employer.getEmployeeName().equals(employeeName)) {
                System.out.println(employer.getEmployeeName() + ": " + employer.getDepartment() + ": " + employer.getSalary());
                return;
            }
        }
        System.out.println(employeeName + " не найден");
    }

    // Реализуем метод распечатать
    public static void printAllEmployers() {
        for (int i = 0; i < size; i++) {
            Employee employer = employers[i];
            System.out.println(employer.getEmployeeName() + ": " + employer.getDepartment() + ": " + employer.getSalary());
        }
    }

    // Реализуем метод getCurrentSize (получить текущий размер)
    public static int getCurrentSize() {
        return size;
    }

    public static void addEmployer(String employeeName, int i, double i1) {
    }

}

