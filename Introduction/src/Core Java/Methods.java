public class Methods {

    public static void main(String[] args) {
    
        Methods m = new Methods();

       String random =  getData();

       System.out.println(random);

       Methods2 m2 = new Methods2();

       m2.getUserData();
       getData23();

        
        
    }
    
    public static String getData(){

        System.out.println("Hello World!");
        return "ASDFG";
    }

    public static String getData23(){

        System.out.println("Hello World!");
        return "ASDFG";
    }



}
