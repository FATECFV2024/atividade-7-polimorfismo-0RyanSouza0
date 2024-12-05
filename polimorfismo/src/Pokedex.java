public class Pokedex {
    public static void main(String[] args) throws Exception {
        Eevee eevee = new Eevee(32, 50, 6.5);
        Vaporeon vaporeon = new Vaporeon(110, 110, 29);
        Jolteon jolteon = new Jolteon(90, 45, 24.5);
        Flareon flareon = new Flareon(100, 85, 25);
        Espeon espeon = new Espeon(70, 55, 26.5);
        Umbreon umbreon = new Umbreon(100, 95, 27);
        Leafeon leafeon = new Leafeon(100, 67, 25.5);
        Glaceon glaceon = new Glaceon(90, 120, 25.9);
        Sylveon slveon = new Sylveon(100, 45, 23.5);

        eevee.printInfo();
        vaporeon.printInfo();
        jolteon.printInfo();
        flareon.printInfo();
        espeon.printInfo();
        umbreon.printInfo();
        leafeon.printInfo();
        glaceon.printInfo();
        slveon.printInfo();
    }
}