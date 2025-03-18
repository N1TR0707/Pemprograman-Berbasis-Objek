 class KonversiSuhu {
    public double toKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double toFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    public double toRankine(double celsius) {
        return celsius * 1.8 + 491.67;
    }

    public double toDelisle(double celsius) {
        return (100 - celsius) * 1.5;
    }

    public double toNewton(double celsius) {
        return celsius * 33 / 100;
    }

    public double toReaumur(double celsius) {
        return celsius * 0.8;
    }

    public double toRomer(double celsius) {
        return celsius * 21 / 40 + 7.5;
    }
}

public class KonversiSuhuDemo {
    public static void main(String[] args) {
        KonversiSuhu konversi = new KonversiSuhu();
        double celsius = 25; // Contoh suhu dalam Celsius
        System.out.println("Celsius: " + celsius);
        System.out.println("Kelvin: " + konversi.toKelvin(celsius));
        System.out.println("Fahrenheit: " + konversi.toFahrenheit(celsius));
        System.out.println("Rankine: " + konversi.toRankine(celsius));
        System.out.println("Delisle: " + konversi.toDelisle(celsius));
        System.out.println("Newton: " + konversi.toNewton(celsius));
        System.out.println("Réaumur: " + konversi.toReaumur(celsius));
        System.out.println("Rømer: " + konversi.toRomer(celsius));
    }
}