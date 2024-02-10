package ch9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sample_3 {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("file.txt"));
            br.readLine();
            br.close();
        } catch (FileNotFoundException e) {
            // FileNotFoundException 발생 예외 처리
        } catch (IOException e) {
            // IOException 발생 예외 처리
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    // 예외처리
                }
            }
        }
    }
}
