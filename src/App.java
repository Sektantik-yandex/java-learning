public class App {
    public static void main(String[] args) {
        //регистрируем нового сотрудника
        User workerKoly = new User("Коля", "Залупкин");
        User workerToly = new User("Коля", "Гадюкин");

        //Создаем список задач
        TaskManager taskManager = new TaskManager();

        // Создаем задачи
        Task seo = new Task("SEO продвижение", "Продвинуть сайт Жопух",workerKoly);
        Task direct = new Task("Настроить рекламу", "Настроить рекламу сайту Жопух",workerToly);
        Task site = new Task("Создать сайт", "Создать сайт ТутаНута",workerToly);
        // Добавляем задачи
        taskManager.registerTask(seo);
        taskManager.registerTask(direct);
        taskManager.registerTask(site);
        //Выводим задачи
        taskManager.printTasks();

        //Отображаем задачи сотрудника
        taskManager.searchTaskUser("Коля");

    }

}