package exception.handling;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int j = Integer.parseInt(bufferedReader.readLine());


            int div = 10 / a;
            System.out.println(div);
            int arr[] = new int[4];
            for (int i = 0; i < 4; i++)
                System.out.println(arr[i]);

            A obj = new A();

            obj.function();

            B obj2 = new B();

            obj2.function();
       }
        // This is Arithmetic Exception
        catch (ArithmeticException e) {
            System.out.println("This is a arithmetic exception reason is : " + e.getMessage());
        }

        // This is ArrayIndex Out Of Bounds Exception
        catch (ArrayIndexOutOfBoundsException e){
            System.out.print("Array of bound exception come");
        }

        catch (IOException e){
            System.out.println("This is IOException of BufferReader");
        }

        // This is  Null Pointer Exception
        catch(NullPointerException e){
            System.out.println("This is a null pointer exception");
        }
        catch(Exception e){
            System.out.println("This will caught all exception and massage " + e);
        }

        finally {
            System.out.println("This will print any thing will heppend");
        }


        System.out.println("Post exception code will run");
    }
}

//  This class is for demonstrate the throws keyword
class  A{

    // the throws keyword pass the exception to the caller class
    // the call class handel the exception
    public void function() throws  ArithmeticException{

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int div = 20/a;
        System.out.println(div);

        int b = sc.nextInt();

        int div2 = 30/b;

        System.out.println(div2);

         // cons of throws keyword
        //If there is two variable(a and b) not able to identify which variable cause exception.
        // if you want to send exception message you can't do that
    }
}

//  This class is for demonstrate the throw keyword
class B{

    public void function(){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a == 0){
            throw new ArithmeticException("a equal to 0 not allow");
        }

        int div = 20/a;
        System.out.println(div);

        int b = sc.nextInt();

        if(b == 0){
            throw new ArithmeticException("b equal to zero not allow");
        }

        int div2 = 30/b;

        System.out.println(div2);

        // throw key word will more flexible then throws keyword
    }
}