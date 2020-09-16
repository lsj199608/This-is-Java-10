import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args){
        /*String data1 = args[0];
        String data2 = args[1];

        System.out.println(data1);//실행 매개값을 주지 않았기 때문에 인덱스 사용 불가.
        System.out.println(data2); //Run-Edit configurations-program arguments의 입력란에 값을 2개 입력하면 정상실행.
        */

        if(args.length ==2){ //예외가 발생하지 않게 함.
            String data1 = args[0];
            String data2 = args[1];

            System.out.println(data1);
            System.out.println(data2);

        }else{
            int a;
            System.out.print("실행 방법 : Run - Edit configurations-program arguments의 입력란에 값을 2개 입력");
        }
    }
}
