public class Main {
    public static void main(String[] args) {
        Student aspirant = new Aspirant("Иван", "Иванов", ",Биофак", 5.0d, "Миграция речных рачков");// третий пункт задания
        Student[] students = {new Student("Петр", "Петров", "Геофак", 3.6d),
                       new Aspirant("Павел", "Великий", "Эконом", 4.1d, "Глобальный кризис в период войны"),
                       new Student("Светлана", "Шуклина", "Педагог", 5.0d), aspirant};
        for (int i = 0; i < students.length; i++ ){
            System.out.println(students[i].getScholarship() + "р. составляет стипендия у " + students[i].firstName + " " + students[i].lastName);
        }

    }
}
