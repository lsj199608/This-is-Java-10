public class CatchByExceptionKindExample {
    public static void main(String[] args){
        try{
            String data1 = args[0];
            String data2 = args[1];
            int value1=Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println(result);
        } catch (NumberFormatException e) { //다중 catch를 사용함. 4행에서 매개값이 없을경우 numberFormatException은 실행되지 않고
            //ArrayIndexOutOf...이 실행되고 finally를 실행. 매개값을 넣는다면 ArrayIn...이 실행되지 않고 NumberFormat...이 실행됨.
            System.out.println("숫자로 변환할 수 없음");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("실행 매개값의 수가 부족");
        }
        //다중 catch를 쓸 때는 순서가 중요함. 상위 예외 클래스(exception 등)가 위에 있고 하위 예외클래스(numberFormat)가 밑에 있다면
        //하위 예외가 해당되는것은 상위 예외도 해당되기 때문이다.
        finally {
            System.out.println("다시 실행하세요");
        }
    }
}
