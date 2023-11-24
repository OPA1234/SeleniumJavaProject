public class CoreJavaBrushUp1 {


    public static void main(String[] args) {
        
       int number = 5;
       String nameAndLastname = "Nikola Lukovic";
       char letter = 'r';
       double decimalNumber = 5.56;
       boolean myCard = true;

    //    System.out.println(number + " is the value stored in the number variable");


       // Arrays 

       int [] arr = new int[5];

       arr[0] = 1;
       arr[1] = 2;
       arr[2] = 3;
       arr[3] = 4;
       arr[4] = 5;

       int [] arr2 = {1,2,3,4,5,7,3,34,3412,32123};

        // System.out.println(arr2[3]);

    // for loop 

    for (int i = 0; i<arr2.length; i++){
        System.out.println(arr2[i]);
    }
    
    String[] names = {"Nikola", "Savo", "Petar"};
    
    for (int i = 0; i<names.length; i++){

        System.out.println(names[i]);

    }

    




 


    }
    
}
