public class Application {
    public static void main(String[] args) {
        City city1 = new City("Moscow", "Moscow", "Russia", 11920000, "101000", "+7");
        City city2 = new City("New York", "New York", "USA", 8419000, "10001", "+1");
        City city3 = new City("Tokyo", "Kanto", "Japan", 13960000, "100-0001", "+81");

        System.out.println("Город: " + city1.getCityName());
        System.out.println("Регион: " + city1.getRegionName());
        System.out.println("Страна: " + city1.getCountryName());
        System.out.println("Население: " + city1.getPopulation());
        System.out.println("Почтовый индекс: " + city1.getPostalCode());
        System.out.println("Телефонный код: " + city1.getPhoneCode());
        System.out.println();

        System.out.println("Город: " + city2.getCityName());
        System.out.println("Регион: " + city2.getRegionName());
        System.out.println("Страна: " + city2.getCountryName());
        System.out.println("Население: " + city2.getPopulation());
        System.out.println("Почтовый индекс: " + city2.getPostalCode());
        System.out.println("Телефонный код: " + city2.getPhoneCode());
        System.out.println();

        System.out.println("Город: " + city3.getCityName());
        System.out.println("Регион: " + city3.getRegionName());
        System.out.println("Страна: " + city3.getCountryName());
        System.out.println("Население: " + city3.getPopulation());
        System.out.println("Почтовый индекс: " + city3.getPostalCode());
        System.out.println("Телефонный код: " + city3.getPhoneCode());
    }
}