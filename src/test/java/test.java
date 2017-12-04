import com.kevinfuture.sort.algorithm.compare.bubble.IBubbleSort;
import com.kevinfuture.sort.algorithm.compare.bubble.impl.BubbleSortImpl;
import com.kevinfuture.sort.algorithm.compare.quick.IQuick;
import com.kevinfuture.sort.algorithm.compare.quick.impl.QuickImpl;
import com.kevinfuture.sort.algorithm.enums.impl.OrderEnum;
import com.kevinfuture.sort.algorithm.select.direct.IDirect;
import com.kevinfuture.sort.algorithm.select.direct.impl.DirectImpl;
import com.kevinfuture.sort.algorithm.select.heap.IHeap;
import com.kevinfuture.sort.algorithm.select.heap.impl.HeapImpl;

/**
 * 测试
 * Created by kevinfuture on 2017/11/28.
 */
public class test {
    public static void main(String[] args) {
        IBubbleSort bubbleSort = new BubbleSortImpl();
        IQuick quick = new QuickImpl();
        IDirect direct = new DirectImpl();
        IHeap heap = new HeapImpl();
        try {
            int[] ints = new int[]{1,2,2,3,-1,2,-8,9,45,22,1,23};
            Integer[] integers = new Integer[]{9,54,23,78,123,4546,33};
            long[] longs = new long[]{9,54,23,78,123,4546,33,-456456};
            Long[] longs1 = new Long[]{9345345345L,54L,23L,78L,123L,4546L,33L};
            double[] doubles = new double[]{9.888D,54.6D,23D,7D,123D,4D,33D};
            Double[] doubles1 = new Double[]{9.544444444D,54.9D,23.67D,78D,123D,4546D,33D};
            String[] strings = new String[]{"345345","345345.666","546","7567567","dfgdfg","7899","rer","45656"};
//            System.out.println(bubbleSort.sort(doubles, OrderEnum.asc)+"      IBubbleSort");
//            System.out.println(quick.sort(doubles,OrderEnum.asc));
            System.out.println(heap.sortByAsc(doubles));
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.exit(1);
        }
        System.exit(0);
    }
}
