public class TestStatic1 {
    // Atribut statis
    static int a = 5;
    static int b = 10;
    static int c = 15;
    static int d = 20;
    static int e = 25;

    // Method statis satu
    public static void satu() {
        System.out.println("Method satu() dipanggil");
    }

    // Method statis dua
    public static void dua() {
        System.out.println("Method dua() dipanggil");
    }

    // Method untuk mencetak atribut
    public static void cetakAtribut() {
        System.out.println("Atribut a: " + a);
        System.out.println("Atribut b: " + b);
        System.out.println("Atribut c: " + c);
        System.out.println("Atribut d: " + d);
        System.out.println("Atribut e: " + e);
    }
}