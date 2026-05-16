public class recursionp2 {
    static String name ="Shreyas";
    static int count=0;
    static void f(){
         if(count==5){
            return;
         }
         else{
            System.out.println(name);
            count++;
         }
         f();
    }
    public static void main(String[]args){
        f();
    }
}
