public class ThrowsExample {
    public static void main(String[] args){
        try{
            findClass();
        }catch (ClassNotFoundException e){
            System.out.println("클래스 미존재");
        }
    }
    public static void findClass() throws ClassNotFoundException{ //throws는 예외를 떠넘기는 것이다.
        Class clazz = Class.forName("java.lang.String2");
    }
}
