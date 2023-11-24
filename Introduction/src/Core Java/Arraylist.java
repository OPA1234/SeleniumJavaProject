import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist {


    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<String>();

        //create object of the class - object.method
        a.add("Nikola");
        a.add("Lukovic");
        a.add("Rastko");
        a.add("Petrovic");
        a.get(2);
        

        //iterrating with arreylist

        for( int i = 0; i<a.size(); i++){
         System.out.println(a.get(i));
        }

        System.out.println("*************************");


        for( String val : a){
            System.out.println(val);
        }


        // item is present in the list 

        System.out.println(a.contains("Nikola"));

        String[] names = {"Nikola", "Savo", "Petar"};
    


        List<String> namesArrayList = Arrays.asList(names);

        namesArrayList.contains("Nikola");

        System.out.println(namesArrayList.contains("Nikola"));

    }
    
}
