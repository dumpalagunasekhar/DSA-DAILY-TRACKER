class Pattern{
    void pattern(int n){
        int start = 1;
        for(int i=0;i<n;i++){
            if(i%2 ==0) start =1;
            else start =0;
            for(int j=0;j<=i;j++){
              System.out.print(start+" ");
              start = 1-start;
            }
            System.out.println();
        }
    }
}
public class Day1{
    public static void main(String[] args){
        Pattern p = new Pattern();
        p.pattern(5);
    }
}