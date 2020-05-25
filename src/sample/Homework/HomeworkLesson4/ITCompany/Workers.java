package sample.Homework.HomeworkLesson4.ITCompany;

import java.util.ArrayList;

public class Workers {

    int workHours;
    ArrayList<String> tasksList = new ArrayList<>();

    public Workers(int workHours, String... tasks) {
        this.workHours = workHours;
        for (String task : tasks) tasksList.add(task);
    }

    @Override
    public String toString() {
        String allTasks = "";
        for (int i = 0; i < tasksList.size() - 1; i++) allTasks += tasksList.get(i) + ", ";
        allTasks += tasksList.get(tasksList.size() - 1) + ".";
        return "Work hours: " + workHours + ", Tasks: " + allTasks;
    }


}
