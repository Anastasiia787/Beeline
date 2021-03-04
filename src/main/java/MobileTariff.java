public class MobileTariff {
    String name;
    String digitalSimCard;
    int internetTraffic;
    int freeMinutes;
    int freeMessages;
    int oldPrice;
    int discount;
    int price;

    @Override
    public String toString() {
        return name  +
                "\n" + digitalSimCard +
                "\n" + internetTraffic + " ГБ" +
                "\n" + freeMinutes + " МИН" +
                "\n" + freeMessages + " SMS" +
                "\n" + oldPrice + " РУБ/МЕС" + " -" + discount + "% на год" +
                "\n" + price + " РУБ/МЕС";
    }
}
