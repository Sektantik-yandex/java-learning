public class App {
    public static void main(String[] args) {
        //регистрируем нового сотрудника
        User workerKoly = new User("Коля", "Залупкин");
        User workerToly = new User("Толя", "Гадюкин");

        //Создаем список задач
        TaskManager taskManager = new TaskManager();

        // Создаем задачи
        Task seo = new Task("SEO продвижение", "Продвинуть сайт Жопух",workerKoly);
        Task direct = new Task("Настроить рекламу", "Настроить рекламу сайту Жопух",workerToly);
        // Добавляем задачи
        taskManager.registerTask(seo);
        taskManager.registerTask(direct);
        //Выводим задачи
        taskManager.printTasks();

    }

}