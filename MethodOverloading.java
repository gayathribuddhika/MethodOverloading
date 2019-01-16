public class MethodOverloading {

    
    public static void main(String[] args) {
        System.out.println(Add(12,15));
        System.out.println(Add(2.1,4.458));
        System.out.println(Add("Gayathri ","Buddhika"));
    }
    public static int Add(int a,int b){
        return(a+b);
    }
    public static double Add(double a,double b){
        return(a+b);
    }
    public static String Add(String a,String b){
        return(a+b);
    }
}