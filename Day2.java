class Pattern{
    void print(int n){
        for(int i=1;i<n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
        }
    }
}
public class Day2{
    public static void main(String[]args){
        Pattern obj = new Pattern();
        obj.print(5);
    }
}