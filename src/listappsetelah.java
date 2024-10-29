import java.util.ArrayList;
import java.util.Scanner;

/**
 * Kelas listappsetelah adalah aplikasi manajemen tugas yang memungkinkan pengguna
 * untuk menambah, melihat, dan menghapus tugas dari daftar tugas.
 */
public class listappsetelah {
    private ArrayList<String> tasklist = new ArrayList<>(); // Daftar tugas
    private Scanner inputScanner = new Scanner(System.in);

    /**
     * Metode utama untuk menjalankan aplikasi.
     *
     * @param args argumen baris perintah
     */
    public static void main(String[] args) {
        listappsetelah app = new listappsetelah();
        app.start();
    }

    /**
     * Memulai aplikasi dan menampilkan menu kepada pengguna.
     */
    public void start() {
        while (true) {
            displayMenu(); // Menampilkan menu
            int choice = getUser Choice(); // Mendapatkan pilihan pengguna
            executeChoice(choice); // Mengeksekusi pilihan
        }
    }

    /**
     * Menampilkan menu pilihan kepada pengguna.
     */
    private void displayMenu() {
        System.out.println("1. Tambah Tugas");
        System.out.println("2. Lihat Tugas");
        System.out.println("3. Hapus Tugas");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu: ");
    }

    /**
     * Mendapatkan pilihan pengguna dari input.
     *
     * @return pilihan pengguna sebagai integer
     */
    private int getUser Choice() {
        int choice = inputScanner.nextInt();
        inputScanner.nextLine(); // Mengonsumsi newline
        return choice;
    }

    /**
     * Mengeksekusi pilihan yang dipilih oleh pengguna.
     *
     * @param choice pilihan yang dipilih oleh pengguna
     */
    private void executeChoice(int choice) {
        switch (choice) {
            case 1:
                addTask();
                break;
            case 2:
                viewTasks();
                break;
            case 3:
                deleteTask();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    /**
     * Menambahkan tugas baru ke dalam daftar tugas.
     */
    private void addTask() {
        System.out.print("Masukkan tugas: ");
        String task = inputScanner.nextLine();
        getTasklist().add(task);
    }

    /**
     * Menampilkan semua tugas yang ada dalam daftar tugas.
     */
    private void viewTasks() {
        System.out.println("Daftar Tugas:");
        for (int i = 0; i < getTasklist().size(); i++) {
            System.out.println((i + 1) + ". " + getTasklist().get(i));
        }
    }

    /**
     * Menghapus tugas dari daftar berdasarkan nomor tugas yang diberikan oleh pengguna.
     */
    private void deleteTask() {
        System.out.print("Masukkan nomor tugas yang akan dihapus: ");
        int taskNumber = inputScanner.nextInt();
        inputScanner.nextLine(); // Mengonsumsi newline
        if (taskNumber > 0 && taskNumber <= getTasklist().size()) {
            getTasklist().remove(taskNumber - 1);
        } else {
            System.out.println("Nomor tugas tidak valid.");
        }
    }

    /**
     * Mendapatkan daftar tugas.
     *
     * @return daftar tugas sebagai ArrayList<String>
     */
    public ArrayList<String> getTasklist() {
        return tasklist;
    }

    /**
     * Mengatur daftar tugas.
     *
     * @param tasklist daftar tugas baru sebagai ArrayList<String>
     */
    public void setTasklist(ArrayList<String> tasklist) {
        this.tasklist = tasklist;
    }
}