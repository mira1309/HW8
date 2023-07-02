import java.time.Instant;
import java.time.LocalDate;

public class Main {
        private static java. time.LocalDate LocalDate;

        public static void main(String[] args) {


                //1
                int leapYear = 2020;
                int notLeapYear = 2021;
                checkIsYearLeap(leapYear);
                checkIsYearLeap(notLeapYear);


                //2
                int year;
                year = LocalDate.now().getYear();
                int os = 0;
                suggestVersion(os, year);

                //3
                printDeliveryInfo(1);
                printDeliveryInfo(25);
                printDeliveryInfo(130);
        }

                public static void checkIsYearLeap ( int year){
                        if (year * 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
                                System.out.println(year + " год не является високосным \n");
                        } else {
                                System.out.println(year + " год является високосным \n");
                        }
                }


                public static void suggestVersion ( int os, int year){
                        int borderYear = 2015;
                        if (os == 0 && year < borderYear) {
                                System.out.println("Установите облегченную версию приложения для ios по ссылке");
                        } else if (os == 0 && year >= borderYear) {
                                System.out.println("Установите версию приложения для ios по ссылке");
                        } else if (os == 1 && year < borderYear) {
                                System.out.println("Установите облегченную версию приложения для Android по ссылке");
                        } else if (os == 1 && year >= borderYear) {
                                System.out.println("Установите версию приложения для Android по ссылке");
                        } else {
                                System.out.println("Не удалось определить версию");
                        }
                        System.out.println();
                }

                public static void printDeliveryInfo ( int deliveryDistance){
                        int deliveryDays = getDeliveryDays(deliveryDistance);
                        if (deliveryDays == -1) {
                                System.out.println("Доставки нет");
                        } else {
                                System.out.printf("Потребуется %s дней", deliveryDays);
                        }
                        System.out.println();
                }

                public static int getDeliveryDays ( int deliveryDistance){
                        if (deliveryDistance < 20) {
                                return 1;
                        } else if (deliveryDistance <= 60) {
                                return 2;
                        } else if (deliveryDistance < 100) {
                                return 3;
                        } else {
                                return -1;
                        }
                }
        }
