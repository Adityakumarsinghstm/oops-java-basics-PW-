package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example1
{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 23, 43, 64, 90, 76);
        Stream<Integer> streamData = list.stream();
        Stream<Integer> filterData = streamData.filter(n->n%2==0).sorted().map(p->p/2);

//        long count = streamData.count();
//        System.out.println(count);

//        Stream<Integer> sortedStream = filterData.sorted();
//
//        Stream<Integer> mapStream = sortedStream.map(n -> n /2);

        filterData.forEach(n->System.out.println(n));


    }
}
