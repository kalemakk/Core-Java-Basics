package com.company;
public class VarArgs {
    public static void main(String[] args) {
        String item1 ="apple";
        String item2 ="banana";
        String item3 ="jack fruit";
        String [] likes ={"Games","Food","Going Out","Movies",};
        getItems(likes);
        getItems(item1,item2,item3);
        getItems(item1,item2);
        getItems("hello");
    }
    private static <i> void getItems(String... k){
        System.out.println(k);

        System.out.println("....................Fruits...................");
//        for (int i =0;i<k.length;i++) {
//            System.out.println(i+1+": "+k[i]);
//        }

        for (String i :k){
//            System.out.println(i);
            System.out.println("-> "+i);

        }
    }

}
