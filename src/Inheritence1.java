public class Inheritence1 {
    public static void main(String[] args){

        Book b = new Book();
        // use setters to set values
            b.setTitle("Tokyo Ghoul");
            b.setAuthor("Sui Ishida");
            b.setPages(277);
        Book c = new Book();
        // use setters to set values
            c.setTitle("Wild Seed");
            c.setAuthor("Octavia Butler");
            c.setPages(320);

        Software s = new Software();
        // use setters to set values
            s.setProgrammer("Microsoft");
            s.setPlatform("PC");
            s.setOs("Windows 10");

        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(s.toString());
    }
}
