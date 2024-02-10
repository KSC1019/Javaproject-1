package ch9;
/*
try catch문에 대해 공부하기 위한 코드다
try문에서 예외가 발생해서 catch 예외1 이 수행된다면 그 다음이 실행되지 않는다.
하지만 try문 수행 중 예외가 발생하면 catch문이 수행된다.
아래 코드는 FileNotFoundException이 발생해서 catch문의 내용이 실행되는 것을 알수있다.
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sample1 {
    public static void main(String[] args) throws IOException {
        System.out.println("0");//그냥 출력 됨
        try {
            BufferedReader br = new BufferedReader(new FileReader("not exist file"));
            br.readLine();
            br.close();
            System.out.println("1"); // 오류가 되기 때문에 1은 출력되지 않는다.
        } catch (FileNotFoundException e) {
            System.out.println("error message: " + e.getMessage());
            System.out.println("2");// 오류 처리를 위해 2가 출력된다.
        } catch (IOException e){
            System.out.println("3");//이미 오류처리가 진행됬기 때문에 3은 출력되지 않는다.
        }
        System.out.println("4");//그냥 출력됨
    }
}


/*출력값 : error message: not exist file (지정된 파일을 찾을 수 없습니다)
0 2 4
* */