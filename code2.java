import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Socketdemo1 {
    public static void main(String[] args) throws IOException {
        ServerSocket s = new ServerSocket(10086);//首先建立服务端对象
        Socket socket = s.accept();//监听客户端的连接。
        InputStream is = socket.getInputStream();//得到一个InputStream流。
        InputStreamReader isr = new InputStreamReader(is);//利用转换流转换成字符流。
        BufferedReader br = new BufferedReader(isr);利用更高效的BufferedReader流
        int b;
        while ((b = br.read()) != -1) {
            System.out.print((char) b);
        }//利用循环，读取字符到返回值为-1为止。
    }
}
