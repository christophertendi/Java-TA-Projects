class Main {
    public static void main(String[] args) {

        Animal a = new Animal();
        Animal b = new Dog();

        a.sleep();
        b.sleep();
        a.sleep(5);
        b.sleep(3);

    }
}