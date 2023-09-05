package Array_list;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 1. @ClassName ArrayListTest
 * 2. @Description TODO
 * 3. @Author huo
 * 4. @Date 2023/9/5 23:22
 */

public class ArrayListTest {
    private final Logger logger = (Logger) LoggerFactory.getLogger(ArrayListTest.class);
    @Test
    public void test_array_list() {
        List<String> list = new ArrayList<>();
        list.add("01");
        list.add("02");
        list.add("03");
        list.add("04");
        list.add("05");
        list.add("06");
        list.add("07");
        list.add("08");
        list.add("09");
        list.add("10");
        list.add("11");
        list.add("12");

        logger.info(list.toString());

        list.remove(9);

        logger.info(list.toString());
    }

}
