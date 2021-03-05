public class MobileTariff {
    long id;
    String name;
    String digitalSimCard;
    int internetTraffic;
    int freeMinutes;
    int freeMessages;
    int oldPrice;
    int discount;
    int price;
    String information;

    @Override
    public String toString() {
        return id +
                "\n" + name  +
                "\n" + digitalSimCard +
                "\n" + internetTraffic + " ГБ" +
                "\n" + freeMinutes + " МИН" +
                "\n" + freeMessages + " SMS" +
                "\n" + oldPrice + " РУБ/МЕС" + " -" + discount + "% на год" +
                "\n" + price + " РУБ/МЕС" +
                "\n" + information;
    }
}
