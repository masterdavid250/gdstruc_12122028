package com.gdstruc.quiz4;

public class Main {
    public static void main(String[] args) {
        Player ploo = new Player (123, "Ploo", 123);
        Player wardell = new Player (234, "wardell", 234);
        Player deadlyJimmy = new Player (345, "deadlyJimmy", 345);
        Player subroza = new Player (456, "subroza", 456);
        Player annieDro = new Player (567, "annieDro", 567);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(ploo.getName(), ploo);
        hashtable.put(wardell.getName(), wardell);
        hashtable.put(deadlyJimmy.getName(), deadlyJimmy);
        hashtable.put(subroza.getName(), subroza);
        hashtable.put(annieDro.getName(), annieDro);

        //INITIAL PRINT-OUT
        hashtable.printHashtable();

        //
        System.out.println("\n\n");
        System.out.println("New List: ");

        //INSERT "NAME" TO BE REMOVED
        hashtable.remove("Ploo");
        hashtable.remove("subroza");

        //NEXT PRINT-OUT TO CONFIRM REMOVAL
        hashtable.printHashtable();
    }

}