public class recursion {
    static void f(int n,int i){
        if(i==0){
            return;
        }    
        f(n);    
    }
    public static void main(String[]args){
        f(5,0);
    }
}
