public class ForLoopIfStatements {


    public static void main(String[] args) {

        
    int [] arr2 = {1,2,3,4,5,7,3,34,3412,32123};

    //2

    for (int i = 0; i<arr2.length; i++){

        if(arr2[i] % 2 == 0){
            System.out.println(arr2[i] + " number is multiple of 2");
        } else {
            System.out.println(arr2[i] + " number is not multiple of 2");
        }
    }
        
    }


    
}
