import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("   Здравствуйте \n" +
                "Добро пожаловать в официальную завод Мерседеса!! \n" +
                "Выберите свою машину  "+"\n");
        Car car = new Car();
        System.out.println("выберите марку ");
        car.setMorka(scanner.nextLine());
        car.Caros();
        System.out.println("выберите Model");
        car.setMopdel(scanner.nextLine());
        System.out.println("выберите color");
        car.setColor(scanner.nextLine());
        System.out.println("выберите Discs");
        car.setDiscs(scanner.nextLine());
        System.out.println("выберите Salon");
        car.setSalon(scanner.nextLine());
        System.out.println("выберите wheel ");
        car.setWheel(scanner.nextLine());
        System.out.println("выберите Color salon");
        car.setColorSalon(scanner.nextLine());
        System.out.println("Model  "+car.getMorka()+ "Marka "+car.getMorka()+"\n "+"Color "+car.getColor()+"\n"+"Discs "+car.getDiscs()+"\n"
        +"Salon "+car.getSalon()+"\n"+"Wheel "+car.getWheel()+"\n"+"SalonColor "+car.getColorSalon());
        System.out.println("          Вы успешно выбрали свою машин");
        System.out.println("          Мы приняли ваш запрос");
        System.out.println("    Через 6 месяцев мы отправим вам вашу машину");
        System.out.println("       Пожалуйста напишите свою номер");
        car.setNomber(scanner.nextLine());
        System.out.println(  car.getNomber());
        System.out.println("2473548699657 " +
                "10000$");
        car.setNomber(scanner.nextLine());
        System.out.println("ты лох хахах");
    }
}
