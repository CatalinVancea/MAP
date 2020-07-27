package colectii_generics;

import entity.MessageTask;
import service.PrintTaskRunner;
import service.StrategyTaskRunner;
import utils.Strategy;

import java.time.LocalDateTime;
import java.util.*;

public class Main2 {

    private static void test1(Strategy str){
        MessageTask m1 = new MessageTask("1","Descriere1","Mesaj1","From1", "To1",
                LocalDateTime.of(2019,10,2,12,00));
        MessageTask m2 = new MessageTask("2","Descriere2","Mesaj2","From2", "To2",
                LocalDateTime.of(2019,10,2,12,00));

        StrategyTaskRunner runner = new StrategyTaskRunner(str);
        runner.addTask(m1);
        runner.addTask(m2);
        runner.executeAll();

        PrintTaskRunner p = new PrintTaskRunner(runner);
        p.addTask(m1);
        p.addTask(m2);
        p.executeAll();
    }

    private static void test2() {
        Set<Student> hs = new HashSet<>();
        hs.add(new Student ("Dan", 9.8f));
        hs.add(new Student ("Ion", 7.8f));
        hs.add(new Student ("Dan", 9.9f));
        System.out.println(hs);

        Set<Student> ts = new TreeSet<>();
        ts.add(new Student ("Dan", 9.8f));
        ts.add(new Student ("Ion", 7.8f));
        ts.add(new Student ("Dan", 9.8f));
        System.out.println(ts);

        Map<String,Student> hm = new HashMap<>();
        hm.put("Dan", new Student ("Dan", 9.8f));
        hm.put("Ion", new Student ("Ion", 7.8f));
        hm.put("Dan", new Student ("Dan", 9.7f));
        System.out.println(hm);

        Map<String,Student> tm = new TreeMap<>();
        tm.put("Dan", new Student ("Dan", 9.8f));
        tm.put("Ion", new Student ("Ion", 7.8f));
        tm.put("Dan", new Student ("Dan", 9.7f));
        System.out.println(tm);
    }

    private static void test3(){
        MyMap m = new MyMap();
        m.addStudent(new Student("Dan", 7.2f));
        m.addStudent(new Student("Ion", 7.1f));
        m.addStudent(new Student("Dan", 7.2f));
        m.addStudent(new Student("Dan", 6.8f));
        m.addStudent(new Student("Dan", 6.2f));


        for(Map.Entry<Integer, List<Student>> t : m.getEntries()){
            //System.out.println(t);
            List<Student> ls = t.getValue();
            Collections.sort(ls, new Desc());
            System.out.println("descrescator cu Comparator: "+ls);
            Collections.sort(ls);
            System.out.println("crescator cu Comparable: "+ls);
        }
    }

    public static void main(String[] args){
        if(args.length==0)
        {
            System.out.println("nu sunt parametrii");
            return;
        }
        //test1(utils.Strategy.valueOf(args[0]));
        //test2();
        test3();
    }
}








