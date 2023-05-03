public class User {
    String name;
    int age;

    public User(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return this.name;

    }

    public int getAge(){
        return this.age;
    }
    public static void main(String[] args) {
        User anna = new User("Anna", 24);
        User betty = new User("Betty", 30);
        User clark = new User("Clark", 33);
        User old = new User("Old",100);

        User[] users = {anna,betty,clark,old};

        int result =0;
        for (int i = 0; i < users.length; i++) {
            result=result+users[i].getAge();
        }
        double mean=result/ users.length;

        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge()<mean){
                System.out.println(users[i].getName());
            }
        }
    }
}
