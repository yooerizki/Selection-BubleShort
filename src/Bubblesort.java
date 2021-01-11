import java.util.Scanner;

public class Bubblesort {
    public void bubble() {
        Scanner input = new Scanner(System.in);

        int data = 0;
        System.out.print("Masukkan jumlah data : ");
        data = input.nextInt();
        int baris = data;

        int kolom = 2;
        String[][] array = new String[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 1; j < kolom; j++) {
                System.out.print("Nama  : ");
                array[i][j - 1] = input.next();
                System.out.print("Umur  : ");
                array[i][j] = input.next();
                System.out.println();
            }
        }

        System.out.println("Bubble Sort");
        for (int i = 1; i < baris; i++) { // looping baris
            for (int j = baris - 1; j >= i; j--) {
                if (array[j][1].compareTo(array[j - 1][1]) < 0) { // bandingkan data array pertama dan kedua
                    for (int k = 0; k < kolom; k++) { // looping kolom
                        String tukar = array[j][k]; // data penampung swap
                        array[j][k] = array[j - 1][k]; // tukar array pertama dengan array kedua
                        array[j - 1][k] = tukar; // simpan di sini
                    }
                }
            }
        }

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) { // kemudian looping data baris & kolom dan tampilkan

                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

// kompleksitas bubble sort (n-1) menghasilkan O(n)