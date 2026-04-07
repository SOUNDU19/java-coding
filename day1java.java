// public class day1java{
//     public static void main(String[] args){
//         // System.out.println("hello world");
//         int [] arr = { 1,2 ,3,4,5};
//         for(int i = 0;i < arr.length; i++){
//             System.out.print (arr[i]+" ");
//         }
      
        
//     }
// }
public class day1java{
    int instance_var = 10;
    static String var = "hrllo";

    public void method1(){
        int loc_var = 20;
        System.out.println("instance variable is: " + instance_var);
        System.out.println("static variable is :"+var);
        System.out.println("local varaible:"+loc_var);
    }
    public static void main(String[] args){
          day1java obj = new day1java();
          obj.method1();

          System.out.println("ststic variables:"+ day1java.var);
        }
}