package org.example.Java10_17_Features.SwitchStatement.NewSwitchStatement;

public class NewSwitchCaseExample {
    static void main(String[] args) {
        String day = "FRIDAY", day1 = "THURSDAY", day2 = "MONDAY";
        switch(day){
            case "MONDAY"-> System.out.println("Its first office day...");
            case "TUESDAY","WEDNESDAY","THURSDAY"-> System.out.println("NORMAL DAYS");
            case "FRIDAY"-> System.out.println("Last Office Day..");
            default-> System.out.println("Holiday");
        }
        String result = switch(day1){
            case "MONDAY"-> "Its first office day...";
            case "TUESDAY","WEDNESDAY","THURSDAY"-> "NORMAL DAYS";
            case "FRIDAY"-> "Last Office Day..";
            default-> "Holiday";
        };String result1 = switch(day2){
            case "MONDAY" : yield "Its first office day...";
            case "TUESDAY","WEDNESDAY","THURSDAY" : yield "NORMAL DAYS";
            case "FRIDAY" : yield "Last Office Day..";
            default : yield "Holiday";
        };
        System.out.println(result);
        System.out.println(result1);
    }
}
