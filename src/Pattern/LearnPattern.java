package Pattern;

public class LearnPattern {

    public static void main(String[] args){
        rightTriangel(5);
    }
    public static void rightTriangel(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}