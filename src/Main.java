public class Main {
    public static void main(String[] args) {
        int numberOne = 5; // <veri tipi> <değişken ismi> = veri (değer)
        System.out.println(numberOne);

        int numberTwo; // Burada ilk önce numberTwo değişkenini tanımadık bir alt satırda değer verdik
        numberTwo = 10;
        System.out.println(numberTwo);

        int numberThree,numberFour,numberFive; // Burada birden fazla değişken tanımladık
        numberThree = 3;
        numberFour = 4;
        numberFive = numberThree + numberFour; // Burada daha önce tanımladığımız iki değişkenin toplamını yeni bir
        System.out.println(numberFive);        // değişkene değer olarak

        int kisaKenar = 10;
        int uzunKenar = 20;
        int alan = kisaKenar * uzunKenar;
        int cevre = 2 * (kisaKenar + uzunKenar);
        System.out.println("Alan: " + alan);
        System.out.println("Çevre: " + cevre);


    }
}
