public class Main {
    public static void main(String[] args) {
        MobileTariff closePeopleOne = new MobileTariff();
        closePeopleOne.id = 1;
        closePeopleOne.name = "Близкие люди 1";
        closePeopleOne.digitalSimCard = "Поддерживает eSIM";
        closePeopleOne.internetTraffic = 15;
        closePeopleOne.freeMinutes = 400;
        closePeopleOne.freeMessages = 300;
        closePeopleOne.price = 350;
        closePeopleOne. information = "https://kazan.beeline.ru/customers/products/mobile/tariffs/details/blizkie-lydi/";
        System.out.println(closePeopleOne);
        System.out.println();

        MobileTariff closePeopleTwo = new MobileTariff();
        closePeopleTwo.id = 2;
        closePeopleTwo.name = "Близкие люди 2";
        closePeopleTwo.digitalSimCard = "Поддерживает eSIM";
        closePeopleTwo.internetTraffic = 30;
        closePeopleTwo.freeMinutes = 600;
        closePeopleTwo.freeMessages = 300;
        closePeopleTwo.oldPrice = 400;
        closePeopleTwo.discount = 20;
        closePeopleTwo.price = 320;
        closePeopleTwo. information = "https://kazan.beeline.ru/customers/products/mobile/tariffs/details/blizkie-lydi-2/";
        System.out.println(closePeopleTwo);
    }
}
