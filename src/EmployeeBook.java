public class EmployeeBook {
    private final Employee[] employees;
    // Объявили массив Contact, реализуемый в классе Contact
    private int size;
    // Объявили свойство size (размер)

    public EmployeeBook() {
        this.employees = new Employee[10];
        // Задали массиву Contact длину — 10
    }

    // Реализуем метод addContact (создать контакт):
    public void addWorker(String workerFio, String department) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить контакт, закончилось место");
        }
        Employee newEmployee = new Employee(workerFio, department);
        employees[size++] = newEmployee;
    }

    // Реализуем метод removeContact (удалить контакт)
    // Метод сдвигает массив влево на ячейку, удаляя ячейку под номером i
    public void removeWorker(String workerFio) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFio().equals(workerFio)) {
                System.out.println(employees[i].getFio() + " удален");
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                return;
            }
        }
    }

    // Реализуем метод findContact (найти контакт)
    public void findWorker(String workerFio) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getFio().equals(workerFio)) {
                System.out.println(employee.getFio() + ": " + employee.getDepartment());
                return;
            }
        }
        System.out.println(workerFio + " не найден");
    }

    // Реализуем метод printAllContacts (распечатать все контакты)
    public void printAllWorkers() {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getFio() + ": " + employee.getDepartment());
        }
    }

    // Реализуем метод getCurrentSize (получить текущий размер)
    public int getCurrentSize() {
        return size;
    }
}


