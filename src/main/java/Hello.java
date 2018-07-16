import java.util.ArrayList;
import java.util.Iterator;

public class Hello {
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(1);
        al.add(123);
        al.add(4);
        al.add(65);
        al.add(3);
        System.out.println("list的大小是："+al.size());

       /* Iterator<Integer> it=al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/
       for(Integer aa:al)
           System.out.println(aa);

       ArrayList<String> str=new ArrayList<String>();
       str.add("hello");
       str.add("hgfflo");
       str.add("erwero");
       str.add("3435thello");

       for(String aa1:str)
            System.out.println(aa1);

       System.out.println("w0000000000------00");
    }


}
