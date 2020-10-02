package personasKods;

import java.util.Scanner;

public class personasKods {
    public static void main(String[] args) {
        System.out.println("Ievadiet personas kodu bez atstarpēm un ar \"-\" simbolu");
        Scanner scanner = new Scanner((System.in));
        String personalCode = scanner.nextLine();

        String firstNumbers = personalCode.substring(0, 6);
        String month = firstNumbers.substring(2, 4);
        String birthDate = firstNumbers.substring(0, 2);

        String nameOfMonth = "";
        switch (month) {
            case "01":
                nameOfMonth = "janvārī";
                break;
            case "02":
                nameOfMonth = "februārī";
                break;
            case "03":
                nameOfMonth = "martā";
                break;
            case "04":
                nameOfMonth = "aprīlī";
                break;
            case "05":
                nameOfMonth = "maijā";
                break;
            case "06":
                nameOfMonth = "jūnijā";
                break;
            case "07":
                nameOfMonth = "jūlijā";
                break;
            case "08":
                nameOfMonth = "augustā";
                break;
            case "09":
                nameOfMonth = "septembrī";
                break;
            case "10":
                nameOfMonth = "oktobrī";
                break;
            case "11":
                nameOfMonth = "novembrī";
                break;
            case "12":
                nameOfMonth = "decembrī";
                break;
            default:
                System.out.println("Personas kods nav ievadīts pareizi!!!");
        }

        String year = firstNumbers.substring(4, 6);
        Integer result = Integer.valueOf(year);
        if (10 > result) {
            System.out.println("Tu esi dzimis/-usi 200" + result + ". gada " + birthDate + ". " + nameOfMonth + "!");
        } else if (20 > result && result > 10) {
            System.out.println("Tu esi dzimis/-usi 20" + result + ". gada " + birthDate + ". " + nameOfMonth + "!");
        } else if (result == 0) {
            System.out.println("Tu esi dzimis/-usi 2000. gada " + birthDate + ". " + nameOfMonth + "!");
        } else {
            System.out.println("Tu esi dzimis/-usi 19" + result + ". gada " + birthDate + ". " + nameOfMonth + "!");
        }
    }
}
