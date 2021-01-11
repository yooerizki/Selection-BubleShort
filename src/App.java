class App{
    public static void main(String[] args) {        //Driver class utama
        
        Bubblesort bubblesort = new Bubblesort();
        Selectionsort selectionsort = new Selectionsort();

        System.out.println("Bubblesort");
        bubblesort.bubble();
        System.out.println("Selectionsort");
        selectionsort.select();
    }
}