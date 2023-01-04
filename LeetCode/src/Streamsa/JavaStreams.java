/*
package Streamsa;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class JavaStreams {
    public static void main(String[] args) throws IOException {

*/
/*        List<Integer> list = Arrays.asList(44, 3, 66, 2, 10);
*//*
*/
/*        List<String> productlist1 = Arrays.asList("Printer", "Mouse", "Keyboard", "Motherboard");
        List<String> productlist2 = Arrays.asList("Scanner", "Projector", "Light Pen");
        List<String> productlist3 = Arrays.asList("Pen Drive", "Charger", "WIFI Adapter", "Cooling Fan");
        List<String> productlist4 = Arrays.asList("CPU Cabinet", "WebCam", "USB Light", "Microphone", "Power cable");
        List<List<String>> allproducts = new ArrayList<List<String>>();
        allproducts.add(productlist1);
        allproducts.add(productlist2);
        allproducts.add(productlist3);
        allproducts.add(productlist4);
        List<String> listOfAllProducts = new ArrayList<String>();
        for (List<String> pro : allproducts) {
            for (String product : pro) {
                listOfAllProducts.add(product);
            }
        }
        System.out.println(listOfAllProducts);
        List<String> flatMapList = allproducts
                .stream()
                .flatMap(pList -> pList.stream())
                .collect(Collectors.toList());*//*
*/
/*
       //List<String> list = Arrays.asList("5.6", "7.4", "4", "1", "2.3");
        //list.stream().map(m -> m.)
       *//*
*/
/* list.stream().flatMap(num -> Stream.of(list).filter(num1 -> num1.size() > 5)).forEach(System.out::println);
        System.out.println(flatMapList);*//*
*/
/*
       *//*
*/
/* File fileName = new File("C:\\Users\\Cherupally Premkumar\\Desktop\\SpringCloud\\LeetCode\\src\\Streamsa\\Filename.txt");
        Stream<String> text = Files.lines(fileName.toPath());
        text.parallel().forEach(System.out::println);
        text.close();
      Stream<Integer> l=list.stream().;
   l.map(m-> m*2).sorted().forEach(System.out::println);*//*
*/
/*



 Stream<Integer> l= list.stream().filter(m->m>2);
              Stream<Integer> j= l.sorted();
 j.forEach(System.out::println);

 sum()
   *//*
*/
/*    Stream<Integer> s=l.sorted();

       Stream<Integer> p=s.map(m-> m*2);
             p.forEach(System.out::println);*//*


        Date d=new Date();
         d.setDate(2022-12-10);
        List<PojoEmployee> l= Arrays.asList(new PojoEmployee(1,"Premkumar",22,d,"Malee"),);
       List<PojoEmployee> p= l.stream().map(pojoEmployee -> new PojoEmployee(pojoEmployee.getId(),
               pojoEmployee.getName(),
               pojoEmployee.getAge()+1,
               pojoEmployee.getDate(),
               pojoEmployee.getGender())).collect(Collectors.toList());
        System.out.println(p);



   List<String> keywords =Arrays.asList("Apple","Banana","Sweet","Apple","Apple","Sweet","Sweet");
  Integer pp=keywords.stream().map(String::length).reduce(0, (c , d1) -> c.compareTo(22));
        System.out.println(pp);
        //f.collect(Collectors.groupingBy(m->m));
    //    System.out.println(f);

    }
}
*/
