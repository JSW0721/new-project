package Chap4;

public class SwitchCaseWork {
    public static void main(String[] args){
        String day = args[0];
        String message = "";
        switch(day){
            case "월요일":
                message = "Start od the work week";
            break;
            case "금요일":
                message = "Almost weekend";
                break;
            default:
                message = "Mid weak";
                break;
        }
        System.out.println(message);
    }
}
