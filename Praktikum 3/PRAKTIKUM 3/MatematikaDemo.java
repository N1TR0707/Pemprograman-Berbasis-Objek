 class Matematika {
    public float pertambahan(float a, float b) {
        return a + b;
    }

    public float pengurangan(float a, float b) {
        return a - b;
    }

    public float perkalian(float a, float b) {
        return a * b;
    }

    public float pembagian(float a, float b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol");
            return 0; // Atau bisa throw exception
        }
    }
}

public class MatematikaDemo {
    public static void main(String[] args) {
        Matematika math = new Matematika();
        
        // Menggunakan float untuk operasi
        float a = 20.5f;
        float b = 10.5f;

        System.out.println("Pertambahan: " + a + " + " + b + " = " + math.pertambahan(a, b));
        System.out.println("Pengurangan: " + a + " - " + b + " = " + math.pengurangan(a, b));
        System.out.println("Perkalian: " + a + " x " + b + " = " + math.perkalian(a, b));
        System.out.println("Pembagian: " + a + " / " + b + " = " + math.pembagian(a, b));
    }
}