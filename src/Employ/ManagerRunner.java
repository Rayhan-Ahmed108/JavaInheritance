package Employ;

public class ManagerRunner {

    public static void main(String[] args) {
        Manager manager = new Manager("Jeyam",6000,7880);
//        Manager manager1 = new Manager();
        manager.setBonus(0);
        manager.setName("Siam");
        System.out.println(manager.getName());
        manager.greeting();
    }
}
