import com.kevinfuture.bitwise.IIntBinary;
import com.kevinfuture.bitwise.impl.IntBinaryImpl;

/**
 * Created by 58 on 2018/1/25.
 */
public class testBinary {
    public static void main(String[] args) throws Throwable {
        IIntBinary intBinary = new IntBinaryImpl();
        byte[] bytes = intBinary.int2Bytes(99999);

        System.out.println("/");

        int org = intBinary.bytes2Int(bytes);
        System.out.println("this orgin value = "+org);
    }
}
