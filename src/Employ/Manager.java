package Employ;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }
    public Manager() {
        super();
        bonus = 0;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

//    @Override
//    public void greeting() {
//        super.greeting();
//        System.out.println("As Well as I am a member");
//    }
}
