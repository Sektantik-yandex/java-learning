public class User {
    private String name;
    private String surname;

    public User(String name, String surname){
        this.name = name;
        this.name = surname;
    }

    //Геттеры
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }

    //Сеттеры

    public void setName(String name){
        this.name = name;
    }

    public  void setSurname(String surname){
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Сотрудник: " + name + " " + surname;
    }
}
