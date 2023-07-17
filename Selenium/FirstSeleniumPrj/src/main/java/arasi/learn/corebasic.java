package arasi.learn;
//import java.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class corebasic {
    public String website = "http://www.amazon.in";
    public char letter = 'S';
    public double fvar = 10.55;
    public boolean bvar = false;
     public void printMethod()
    {
        System.out.println("Variables are "+website);
    }
    public void formet()
    {
        int[] arr = new int[3];
        for(int i =0; i< arr.length;i++)
            arr[i] = i;
        for(int x:arr)
            if(x %2 ==0)
                System.out.println("\n Value is "+x);
        String[] starr = {"Sairam", "Sai Appa", "Shri Sai"};
        for(String str :starr)
            System.out.println(str);
    }
    public void arrlist()
    {
        ArrayList<String> arrlst = new ArrayList<String>();
        arrlst.add("Sai appa");
        arrlst.add(0, "Mathiya vanakkam");
        arrlst.add(" Anbe Sai Ram");
        for(String temp:arrlst)
        {
            System.out.println(" "+temp);
        }
        System.out.println("Second item is "+arrlst.get(1));
        System.out.println(arrlst.contains("Sai appa"));
    }
    public void ArraysasListConversion()
    {
        String[] arr = new String[3];
        arr[0] = "Anbe";
        arr[1] = "Sai";
        arr[2] = "Ram";
        List<String> fromArr = new ArrayList<String>(Arrays.asList(arr)); // Convert arrays into dynamic list
        System.out.println("Text contains Sai - "+fromArr.contains("Sai"));
        fromArr.add("Thank you Sai Appa");
        for(int x=0; x< fromArr.size();x++)
            System.out.println(fromArr.get(x));
    }
    public void strexamples()
    {
        String s1 = new String("    Hello");
        s1 += " Shree Sai ram ";
        System.out.println("My string is-"+s1+"---");
        System.out.println("Trimed string-"+s1.trim()+"---");
        String[] arr = s1.split("r");
        for(String x : arr)
            System.out.println(x.toUpperCase());

        System.out.println(arr[0].concat("Arasi"));
        System.out.println(arr[0]);
    }
}
