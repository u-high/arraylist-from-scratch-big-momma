public class ArrayThingRunner{
     
     public static void main(String[] args){
       int[] test = new int[4];
       test[0]=1;
       test[1]=2;
       test[2]=3;
       test[3]=4;
       ArrayThing boob = new ArrayThing(test);
       System.out.println("" + boob.get(0));
       boob.add(5);
       System.out.println(boob.get(4));
       boob.set(0,100);
       System.out.println(boob.get(0));
       System.out.println(boob);
       
     }
}