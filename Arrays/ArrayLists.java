
import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(600);
        list.add(700);
        list.add(800);
        list.add(900);
        list.add(1000);
        list.add(1100);
        list.add(1200);
        System.out.println(list.get(0));
        System.out.println(list);
        list.add(0, 2000);
        System.out.println(list);
        list.set(0, 3000);
        System.out.println(list);

        System.out.println(list.contains(3000));
        System.out.println(list.contains(80));
        list.remove(2);
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list2.add(sc.nextInt());
        }
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
    }
}
