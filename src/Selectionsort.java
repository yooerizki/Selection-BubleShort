import java.util.Scanner;

public class Selectionsort {
    public void select() {
        Scanner input = new Scanner(System.in);

        int data = 0;
        System.out.print("Masukkan jumlah data : ");
        data = input.nextInt();
        int baris = data; // Data mhs yg mau di inpt

        int kolom = 2; // jumlah masing2 data 2 nama & umur
        String[][] array = new String[baris][kolom]; // di simpan di dalam array baris & kolom

        for (int i = 0; i < baris; i++) { // looping data baris mhs
            for (int j = 1; j < kolom; j++) { // looping data kolom mhs
                System.out.print("Nama  : ");
                array[i][j - 1] = input.next();
                System.out.print("Umur  : ");
                array[i][j] = input.next();
                System.out.println();
            }
        }

        System.out.println("Selection Sort");
        for (int i = 0; i < baris; i++) { // loping baris jika memenuhi
            int min = i; // tampung disini
            for (int k = 0; k < baris; k++) { // looping baris lagi cek
                if (Integer.parseInt(array[min][1]) < Integer.parseInt(array[k][1])) { // cek jika tipe data pertama
                                                                                       // lebih kecil dari data kedua
                    min = k; // jika terpenuhi samadengan data barinya
                }
                for (int n = 0; n < kolom; n++) { // looping kolom
                    String temp = array[i][n]; // data penampung swap
                    array[i][n] = array[min][n]; // tukar array pertama dengan array kedua
                    array[min][n] = temp; // simpan di sini
                }
            }
        }

        for (int i = 0; i < baris; i++) { // kemudian looping data baris & kolom dan tampilkan
            for (int j = 0; j < kolom; j++) {

                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

// kompleksitas ini menghasilkan O(n2)