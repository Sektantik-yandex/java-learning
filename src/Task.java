public class Task {
    private String nameTask;
    private String description;
    private User user;

    public Task(String nameTask, String description, User user){
    this.nameTask = nameTask;
    this.description = description;
    this.user = user;
    }

    //Геттеры
    public String getNameTask(){
        return nameTask;
    }

    public String getDescription(){
        return description;
    }

    public  User getUser(){
        return user;
    }

    //Сеттеры
    public void setNameTask(String name){
        this.nameTask = name;
    }

    public  void setDescription(String description){
        this.description = description;
    }

    public  void setUser(User user){
       this.user = user;
    }

    @Override
    public String toString() {
        return "Задача: " + nameTask + " " + description + " закреплена за сотрудником " + user.getName();
    }
}
