class latih1 {
    public static void main(String[] args) {
        System.out.println("==================");
        System.out.println("hello word");
        System.out.println("Saya belajar Java");
        System.out.println("==================");

        int A = 10;
        int B = 30;
        int C = A + B;

        System.out.println("==================");
        System.out.println("Nilai c Adalah = " + C);
        System.out.println("==================");

        float f = (float) A / B;
        System.out.println("nilai F adalah = " + f);

        System.out.println("==================");

        boolean oke = true;
        int i = 0;
        while (oke) {
            i++;
            System.out.println(i + "UDINUS");
            if (i == 10) {
                oke = false;
            }
        }
        System.out.println("==================");

        String nim = "A11.2022.14417";
        String nama = "Ibrahim Akbar Arga Dewangga";
        System.out.println("NIM = " + nim);
        System.out.println("NAMA = " + nama);

        System.out.println("==================");

        char ya = 'Y';
        if (ya == 'Y') {
            System.out.println("SUKSES");
        }

        System.out.println("==================");

        for (int j = 0; j < 10; j++) {
            System.out.println("AKU MAU SUKSES BESOKKKKK");
        }
        System.out.println("==================");

        int s = 0;
        do {
            s++;
            System.out.println("AKU MAU SUKSESKKK");
        } while (s < 10);

        System.out.println("==================");
    }

}