public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Sam", 3, 12.25);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Monique", 8, 13.78);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
