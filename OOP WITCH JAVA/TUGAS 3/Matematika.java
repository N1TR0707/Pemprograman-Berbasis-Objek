class Matematika {
    // Method untuk operasi matematika
    public int pertambahan(int a, int b) {
        return a + b;
    }
    
    public int pengurangan(int a, int b) {
        return a - b;
    }
    
    public int perkalian(int a, int b) {
        return a * b;
    }
    
    public int pembagian(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Pembagian dengan nol tidak diperbolehkan.");
            return 0;
        }
    }
}

class MatematikaDemo {
    public static void main(String[] args) {
        Matematika math = new Matematika();
        
        // Menampilkan hasil operasi matematika
        System.out.println("Pertambahan: 20 + 20 = " + math.pertambahan(20, 20));
        System.out.println("Pengurangan: 10 - 5 = " + math.pengurangan(10, 5));
        System.out.println("Perkalian: 10 x 20 = " + math.perkalian(10, 20));
        System.out.println("Pembagian: 20 / 2 = " + math.pembagian(20, 2));
    }
}
