package ch17;

public class MyList {
    public static void main(String[] args) throws Exception {
//        StringList list = new StringList();
//        list.add("aaa");
//        list.add("bbb");
//        String last = list.getLast();
//        System.out.println(last); // bbb
//        list.removeLast();
//        String last2 = list.getLast();
//        System.out.println(last2);
//
//// int 版本的
//        IntList list2 = new IntList();
//        list2.add(111);
//        list2.add(222);
//        int last3 = list2.getLast();
//        System.out.println(last3); // bbb
//        list2.removeLast();
//        int last4 = list2.getLast();
//        System.out.println(last4);


        //泛型版本
        List<Integer> list = new List<Integer>();
        list.add(1);
        list.add(2);
        int last = list.getLast();
        System.out.println(last); // bbb
        list.removeLast();
        int last2 = list.getLast();
        System.out.println(last2);

        // primitive type
        Integer a = 2;//Integer a = new Integer(2);
        Integer b = 3;
        System.out.println(a == b);

    }
}
class List<T> {
    T[] list;
    int count;

    public List() {
        list = (T[]) (new Object[8]);
        count = 0;
    }

    public void add(T ele) throws Exception {
        if (count >= 8) {
            throw new Exception("Out of Bound!");
        }
        list[count] = ele;
        count++;
    }

    public T getLast() throws Exception {
        if (count == 0) {
            throw new Exception("Empty List!");
        }
        return list[count - 1];
    }

    public T removeLast() throws Exception {
        if (count == 0) {
            throw new Exception("Empty List!");
        }
        return list[--count];
    }
}
//
//class StringList{
//    String[] list;
//    int count;
//    public StringList() {
//        list = new String[8];
//        count = 0;
//    }
//    public void add(String ele) throws Exception{
//        if(count >= 8) {
//            throw new Exception("Out of Bound!");
//        }
//        list[count] = ele;
//        count++;
//    }
//    public String getLast() throws Exception{
//        if(count == 0) {
//            throw new Exception("Empty List!");
//        }
//        return list[count-1];
//    }
//    public String removeLast() throws Exception {
//        if(count == 0){
//            throw new Exception("Empty List!");
//        }
//        return list[--count];
//    }
//}
//
//
//class IntList{
//    int[] list;
//    int count;
//    public IntList() {
//        list = new int[8];
//        count = 0;
//    }
//    public void add(int ele) throws Exception{
//        if(count >= 8) {
//            throw new Exception("Out of Bound!");
//        }
//        list[count] = ele;
//        count++;
//    }
//    public int getLast() throws Exception{
//        if(count == 0) {
//            throw new Exception("Empty List!");
//        }
//        return list[count-1];
//    }
//    public int removeLast() throws Exception {
//        if(count == 0){
//            throw new Exception("Empty List!");
//        }
//        return list[--count];
//    }
//}
