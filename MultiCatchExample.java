public class MultiCatchExample {
    public static void main(String[] args){
        try{
            String data1 = args[0];
            String data2 = args[1];
            int value1=Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("실행값의 매개값이 부족 또는 숫자로 변환 불가");
        }catch (Exception e){
            System.out.println("알수없는 예외발생");
        }finally {
            System.out.println("다시 실행하시오");
        }
    }
}
