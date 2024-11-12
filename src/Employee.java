import java.util.Objects;

public class Employee {
        private final String fio;
        // Объявили свойство nick (никнейм)
        private String department;
        // Объявили свойство phone (номер телефона)

        public Employee(String nick, String department) {
            this.fio = nick;
            this.department = department;
        }

        public String getFio() {
            return fio;
            // Создали геттер для nick
        }

        public String getDepartment() {
            return department;
            // Создали геттер для phone
        }

        public void setDepartment(String department) {
            this.department = department;
            // Создали сеттер для phone
        }
    }

