public class mainsorted{
    public static void main(String[] args) {
        SortedTableMap<Integer,Integer> m1=new SortedTableMap<Integer,Integer>();
        m1.put(1,1);
        m1.put(2,2);
        m1.put(3,3);
        m1.put(4,4);
        m1.put(5,5);
        m1.put(6,6);
        m1.removesubmap(2,4);
        for(Entry<Integer,Integer> e:m1.entrySet()){
            System.out.println(e.getValue());
        }

    }
}