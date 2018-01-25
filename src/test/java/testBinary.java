import com.kevinfuture.bitwise.IIntBinary;
import com.kevinfuture.bitwise.ILongBinary;
import com.kevinfuture.bitwise.IShortBinary;
import com.kevinfuture.bitwise.impl.IntBinaryImpl;
import com.kevinfuture.bitwise.impl.LongBinaryImpl;
import com.kevinfuture.bitwise.impl.ShortBinaryImpl;

/**
 * Created by 58 on 2018/1/25.
 */
public class testBinary {
    public static void main(String[] args) throws Throwable {
        longBytes();;
    }
    /**
     * long类型转换
     * **/
    private static void longBytes()throws Throwable{
        ILongBinary longBinary = new LongBinaryImpl();
        byte[] bytes = longBinary.long2Bytes(237265495l);
        System.out.println("/");
        long org = longBinary.bytes2long(bytes);
        System.out.println("this orgin value = "+org);
    }
    /**
     * short类型转换
     * **/
    private static void shortBytes() throws Throwable{
        IShortBinary shortBinary = new ShortBinaryImpl();
        byte[] bytes = shortBinary.short2Bytes((short) 2945);
        System.out.println("/");
        int org = shortBinary.bytes2Short(bytes);
        System.out.println("this orgin value = "+org);
    }
    /**
     * int类型转换
     * **/
    private static void intBytes() throws Throwable {
        IIntBinary intBinary = new IntBinaryImpl();
        byte[] bytes = intBinary.int2Bytes(99999);

        System.out.println("/");

        int org = intBinary.bytes2Int(bytes);
        System.out.println("this orgin value = "+org);
    }
}
