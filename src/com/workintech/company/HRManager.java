package com.workintech.company;

public class HRManager extends Employee{
    private JuniorDeveloper[] JuniorDeveloper;
    private MidDeveloper[] MidDeveloper;
    private SeniorDeveloper[] SeniorDeveloper;
    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    public void addEmployee(int index, JuniorDeveloper junior, MidDeveloper mid, SeniorDeveloper senior, String dev){
        switch (dev) {
            case "junior" -> this.JuniorDeveloper[index] = junior;
            case "mid" -> this.MidDeveloper[index] = mid;
            case "senior" -> this.SeniorDeveloper[index] = senior;
        }
    }

    @Override
    public void work() {
        System.out.println("HRManager starts to working.");
    }
}
