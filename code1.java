import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Socketdemo2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.31.195",10086); //创建一个socket对象。创建对象的同时建立了联系。
        OutputStream out = socket.getOutputStream();//得到一个字节输出流。
        String m = "Message to sent";
        String n = "Another message";
        out.write(m.getBytes());//利用字节输出流的write方法：每次是写出去字节，所有得先转换成字节。
        out.write(n.getBytes());
        out.flush();关闭流。

    }
}
