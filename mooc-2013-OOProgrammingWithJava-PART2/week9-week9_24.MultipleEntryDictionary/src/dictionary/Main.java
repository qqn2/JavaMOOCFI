package dictionary;

public class Main {
    public static void main(String[] args) {
       MultipleEntryDictionary s = new PersonalMultipleEntryDictionary();
       s.add("apina","monkey"); 
       s.remove("apina");
        System.out.println(s.translate("apina"));
       
    }
}
