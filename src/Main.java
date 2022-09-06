import java.util.Random;
public class Main {
    public static double ageAndTemperature(double age, double temperature) {
        return age + temperature;
    }
    public static int generateRandomAge(int age){
        return age;
    }

    public static void main(String[] args) {
        double tempAndAge = ageAndTemperature(20, 48);
        System.out.println(tempAndAge);
        
        int ageOfPeople = 35;
        int temperature = 20;
        if ((ageOfPeople >= 20 && ageOfPeople <= 45) && (temperature >= -20 && temperature <= 30)) {
            System.out.println("Можно идти гулять");

        }else if (ageOfPeople <=20 && (temperature >=0 && temperature <=28)) {
            System.out.println("Можно идти гулять");
        }else if (ageOfPeople >=45 && (temperature >=-10 && temperature <=25)) {
            System.out.println("Можно идти гулять");
        }else {
            System.out.println("Оставайтесь дома");
        }
        double tempAndAge1 = ageAndTemperature(25, -10);
        double tempAndAge2 = ageAndTemperature(28, 15);
        double tempAndAge3 = ageAndTemperature(30, 48);
        double tempAndAge4 = ageAndTemperature(32, 0);
        double tempAndAge5 = ageAndTemperature(45, 31);
        System.out.println(tempAndAge1 + " " + tempAndAge2 + " " + tempAndAge3 + " " + tempAndAge4 + " " + tempAndAge5);
        
        int a = (int) (Math.random() * (90 + 1));
        generateRandomAge(a);
        System.out.println(a);
        
        int ageOfPeople1 = generateRandomAge(a);
        if ((ageOfPeople1 >= 20 && ageOfPeople1 <= 45) && (temperature >= -20 && temperature <= 30)) {
            System.out.println("Можно идти гулять");

        }else if (ageOfPeople1 <=20 && (temperature >=0 && temperature <=28)) {
            System.out.println("Можно идти гулять");
        }else if (ageOfPeople1 >=45 && (temperature >=-10 && temperature <=25)) {
            System.out.println("Можно идти гулять");
        }else {
            System.out.println("Оставайтесь дома");
        }

    }

}
