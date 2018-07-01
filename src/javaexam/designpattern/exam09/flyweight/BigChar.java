package javaexam.designpattern.exam09.flyweight;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// 객체 생성시간이 오래걸린다. (생성자에서 파일의 내용을 읽어들인다.)
public class BigChar {
    // 문자의 이름
    private char charname;
    // 큰 문자를 표현하는 문자열('#' '.' '\n'의 열)
    private String fontdata;
    // 생성자
    public BigChar(char charname) {
        this.charname = charname;
        try {
            BufferedReader reader = new BufferedReader(
                new FileReader("src/javaexam/designpattern/exam09/flyweight/big" + charname + ".txt")
            );
            String line;
            StringBuffer buf = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            this.fontdata = buf.toString();
        } catch (IOException e) {
            this.fontdata = charname + "?";
        }
    }
    // 큰 문자를 표시한다.
    public void print() {
        System.out.print(fontdata);
    }
}
