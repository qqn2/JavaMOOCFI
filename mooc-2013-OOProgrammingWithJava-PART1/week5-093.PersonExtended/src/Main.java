public class Main {
    public static void main(String[] args) {
        Person pekka = new Person("Pekka", 31, 12, 2009);
        Person martin = new Person("Martin", 1, 1, 2010);
        System.out.println(pekka.age());
        System.out.println(martin.age());
        System.out.println( martin.getName() + " is older than " +  pekka.getName() + ": "+ martin.olderThan(pekka) );
        System.out.println( pekka.getName() + " is older than " +  martin.getName() + ": "+ pekka.olderThan(martin) );
        System.out.println( pekka.getName() + " is older than " +  martin.getName() + ": "+ pekka.olderThan(martin) );
    }
}