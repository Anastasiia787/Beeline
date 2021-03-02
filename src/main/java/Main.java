public class Main {
    public static void main(String[] args) {
        MobileTariff closePeopleOne = new MobileTariff();
        closePeopleOne.name = "Близкие люди 1";
        closePeopleOne.digitalSimCard = "Подерживает eSIM";
        closePeopleOne.internetTraffic = 15;
        closePeopleOne.freeMinutes = 400;
        closePeopleOne.freeMessages = 300;
        closePeopleOne.price = 350;
        System.out.println(closePeopleOne.name);
        System.out.println(closePeopleOne.digitalSimCard);
        System.out.println(closePeopleOne.internetTraffic + " ГБ");
        System.out.println(closePeopleOne.freeMinutes + " МИН");
        System.out.println(closePeopleOne.freeMessages + " SMS");
        System.out.println(closePeopleOne.price + " РУБ/МЕС");

        MobileTariff closePeopleTwo = new MobileTariff();
        closePeopleOne.name = "Близкие люди 2";
        closePeopleOne.digitalSimCard = "Подерживает eSIM";
        closePeopleOne.internetTraffic = 30;
        closePeopleOne.freeMinutes = 600;
        closePeopleOne.freeMessages = 300;
        closePeopleOne.oldPrice = 400;
        closePeopleOne.price = 320;
        System.out.println(closePeopleOne.name);
        System.out.println(closePeopleOne.digitalSimCard);
        System.out.println(closePeopleOne.internetTraffic + " ГБ");
        System.out.println(closePeopleOne.freeMinutes + " МИН");
        System.out.println(closePeopleOne.freeMessages + " SMS");
        System.out.println(closePeopleOne.oldPrice + " РУБ/МЕС");
        System.out.println(closePeopleOne.price + " РУБ/МЕС на год");

    }
}
