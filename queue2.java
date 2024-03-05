import java.util.*;

public class queue2 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        Queue<Integer> help = new ArrayDeque<>();
        while(q.size()>0){
            System.out.print(q.element());
            help.add(q.poll());
        }
        while (help.size()>0) {
            q.add(help.poll());
        }
    }
}
