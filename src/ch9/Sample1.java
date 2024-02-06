package ch9;
/*
try catch문에 대해 공부하기 위한 코드다
try문에서 예외가 발생해서 catch 예외1 이 수행된다면 그 다음이 실행되지 않는다.
하지만 try문 수행 중 예외가 발생하면 catch문이 수행된다.
아래 코드는 FileNotFoundException이 발생해서 catch문의 내용이 실행되는 것을 알수있다.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sample1 {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("not exist file"));
            br.readLine();
            br.close();
        } catch (IOException e) {
            System.out.println("error message: " + e.getMessage());
        }
    }
}


//출력값 : error message: not exist file (지정된 파일을 찾을 수 없습니다)
