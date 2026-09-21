public class demo {
    static int square(int n){
        return n*n;
    }
    public static void main(String[]args){
        int number=5;
        if(number%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
        int ans=square(number);
        System.out.println("squar="+ans);
    }
}
