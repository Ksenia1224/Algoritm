import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите информацию:");
        String information = scanner.nextLine();

        //
        String classification = classifyInformation(information);
        System.out.println("Классификация информации: " + classification);
    }

    public static String classifyInformation(String information) {
        if (information.toLowerCase().contains("государственная тайна")) {
            return "Государственная тайна";
        } else if (information.toLowerCase().contains("коммерческая тайна")) {
            return "Коммерческая тайна";
        } else if (information.toLowerCase().contains("служебная тайна")) {
            return "Служебная тайна";
        } else if (information.toLowerCase().contains("профессиональная тайна")) {
            return "Профессиональная тайна";
        } else if (information.toLowerCase().contains("личная тайна")) {
            return "Личная тайна";
        } else if (information.toLowerCase().contains("общедоступная информация")) {
            return "Общедоступная информация";
        } else if (information.toLowerCase().contains("ограничения доступа")) {
            return "Ограничения доступа";
        } else if (information.toLowerCase().contains("закрытая информация")) {
            return "Закрытая информация";
        } else if (information.toLowerCase().contains("засекреченная информация")) {
            return "Засекреченная информация";
        } else if (information.toLowerCase().contains("конфиденциальная информация")) {
            return "Конфиденциальная информация";
        } else if (information.toLowerCase().contains("коммерческая информация")) {
            return "Коммерческая информация";
        } else if (information.toLowerCase().contains("личная информация")) {
            return "Личная информация";
        } else if (information.toLowerCase().contains("персональная информация")) {
            return "Персональная информация";
        } else {
            return "Не классифицировано";
        }
    }
}
