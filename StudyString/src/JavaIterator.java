import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class JavaIterator {

    public static void main(String[] args) {
        //创建一个列表
        List<Integer> list = new ArrayList<Integer>();
        list.add(4);	//添加元素
        list.add(3);
        list.add(7);

        //返回一个迭代器，并遍历列表中的元素
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.print(value + "    ");
        }
        System.out.println();

        //返回ListIterator迭代器并从后往前遍历列表的元素
        ListIterator<Integer> listIterator = list.listIterator(list.size());

        System.out.println("ListIterator:");
        while (listIterator.hasPrevious()) {
            Integer value = listIterator.previous();
            System.out.print(value + "    ");
        }
        System.out.println();
    }
}


