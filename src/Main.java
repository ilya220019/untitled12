import java.util.Random;

public class Main {
    public static double temperatyraAndAge(double age, double temperatyra) {
        return age + temperatyra;
    }

    public static void main(String[] args) {
        double tempAndAge = temperatyraAndAge(23, 48);
        System.out.println(tempAndAge);
        int ageOfpeople = 35;
        int temperature1 = 20;

        if ((ageOfpeople >= 20 && ageOfpeople <= 45) && (temperature1 >= -20 &&
                temperature1 <= 30)) {
            System.out.println("Можно идти гулять");
        } else if ((ageOfpeople < 20) && (temperature1 >= 0 &&
                temperature1 <= 28)) {
            System.out.println("Можно идти гулять");
        } else if ((ageOfpeople > 45) && (temperature1 >= -10 &&
                temperature1 <= 25)) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайтесь дома");
        }

        double tempAndAge0 = temperatyraAndAge(12, 10);
        double tempAndAge1 = temperatyraAndAge(9, 8);
        double tempAndAge2 = temperatyraAndAge(26, 9);
        double tempAndAge3 = temperatyraAndAge(56, 32);
        double tempAndAge4 = temperatyraAndAge(28, 34);
        System.out.println(tempAndAge0 + " " + tempAndAge1 + " " + tempAndAge2 + " " + tempAndAge3 + " " + tempAndAge4);

        g();
    }


    public static int generateRandomAge(int age1) {


        return age1;
    }

    public static void g() {
        int b = (int) (Math.random() * (90 + 1));
        generateRandomAge(b);
        System.out.println(b);
        int a = (int) (Math.random() * (90 + 1));
        int ageOfpeople = generateRandomAge(a);
        int temperature1 = 20;


        if ((ageOfpeople >= 20 && ageOfpeople <= 45) && (temperature1 >= -20 &&
                temperature1 <= 30)) {
            System.out.println("Можно идти гулять");
        } else if ((ageOfpeople < 20) && (temperature1 >= 0 &&
                temperature1 <= 28)) {
            System.out.println("Можно идти гулять");
        } else if ((ageOfpeople > 45) && (temperature1 >= -10 &&
                temperature1 <= 25)) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайтесь дома");
        }


    }
}
