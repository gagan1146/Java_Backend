package org.example.Java10_17_Features.SwitchStatement.OldSwitchStatement;

public class OldSwitchCaseExample {
    static void main(String[] args) {
        String day = "MONDAY";
        switch(day){
            case "MONDAY":
                System.out.println("Its first office day...");
                break;
            case "TUESDAY","WEDNESDAY","THURSDAY":
                System.out.println("NORMAL DAYS");
                break;
            case "FRIDAY":
                System.out.println("Last Office Day..");
                break;
            default:
                System.out.println("Holiday");
        }
    }
}
