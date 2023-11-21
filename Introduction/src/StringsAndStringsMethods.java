public class StringsAndStringsMethods {

    public static void main(String[] args) {
        
        String name = new String("Nesko");
        String name1 = new String("Nesko");

        String differenNameAndLastName = "Nikola Lukovic  ";

       String[] splittedName =  differenNameAndLastName.split(" ");

       System.out.println(splittedName[0]);
       System.out.println(splittedName[1].trim());

    }
    
}
