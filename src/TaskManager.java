import java.util.ArrayList;
import java.util.HashMap;

public class TaskManager {
//Хеш таблица
private HashMap<String, Task> taskHashMaps; //Создаем хеш таблицу ключ название задачи значение объект Задача
private HashMap<String, User> userHashMaps; //Создаем хеш таблицу ключ номер сотрудника значение объект User

    // Конструктор по умолчанию, создающий пустые хеш таблицы для юзера и задач
    public TaskManager() {
        taskHashMaps = new HashMap<>();
        userHashMaps = new HashMap<>();
    }

    //Метод регистрации задачи
    public void registerTask(Task task){
        taskHashMaps.put(task.getNameTask(),task);
        System.out.println("Задача " + task.getNameTask() + " зарегистрирована");
    }

    //Печать задач
    public void printTasks(){
        System.out.println("Зарегистрированные задачи");
        for (Task i : taskHashMaps.values()){
            System.out.println(i);
        }
    }

    //регистрация нового сотрудника

    public void rigisterUser(User user){
        userHashMaps.put(user.getName(), user);
        System.out.println("Новый сотрудник " + user.getName() + " зарегистрирован");
    }

    //Метод отображение задач сотрудника

    public void searchTaskUser(String name) {
        boolean found = false;

        for (Task task : taskHashMaps.values()) {
            if (name.equals(task.getUser().getName())) {
                System.out.println("Задачи сотрудника " + task.getUser().getName() + ":");
                System.out.println(task); // здесь можно вывести информацию о задаче
                found = true;
            }
        }

        if (!found) {
            System.out.println("Такого сотрудника нет");
        }
    }

}
