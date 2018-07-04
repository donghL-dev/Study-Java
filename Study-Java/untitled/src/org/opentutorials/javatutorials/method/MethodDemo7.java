package org.opentutorials.javatutorials.method;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MethodDemo7 {
    public static String numbering(int init, int limit) {
        int i = init;
        String output = "";
        while ( i < limit ) {
            output += i;
            i++;
        }
        return output;
    }
    public static void main(String[] args) {
        String result = numbering(1, 5);
        System.out.println(result);
        try {
            // 다음 행은 out.txt라는 파일에 numbering 이라는 메소드가 반환한 값을 저장합니다.
            BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
            out.write(result);
            out.close();
        } catch (IOException e) {
        }
    }
}
