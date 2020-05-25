package sample.Homework.HomeworkLesson4.ITCompany;

public class Main {
    public static void main(String[] args) {
        Workers developer = new Developer(7, "Creates new subjects", "Edit the code");
        Workers designer = new Designer(7, "Creates new design", "Shows future design");
        Workers manager = new Manager(7, "Talk to workers", "Gives ideas");
        Workers tester = new Tester(7, "Fix the bugs", "Reports errors");

        try {
            for (String arg : args) {
                if (arg.equals("Developer")) {
                    printWorkers(developer);
                } else if (arg.equals("Designer")) {
                    printWorkers(designer);
                } else if (arg.equals("Manager")) {
                    printWorkers(manager);
                } else if (arg.equals("Tester")) {
                    printWorkers(tester);
                }
            }
        } catch (Exception e) { }
    }

    public static void printWorkers(Workers workers) { System.out.println(workers.toString()); }
}
