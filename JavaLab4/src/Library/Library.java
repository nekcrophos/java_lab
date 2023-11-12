package Library;

public class Library {
    public static void main(String[] argc) {
        Reader petrov = new Reader("Petrov", "Java 8. Full guid", "G.Shildt", 1, 4);
        Reader vasechkin = new Reader("Vasechkin","Kreutzer sonata", "L.Tolstoy",25, 3);
        System.out.print(petrov + "\n");
        System.out.print(vasechkin + "\n");
        petrov.dateExpired(29, 3);
        vasechkin.dateExpired(29,3);
    }
}
