public class wrapperClass {
    public static void main(String[] args) {
        Integer obj = Integer.valueOf(20);  // Boxing
        Integer obj1 = Integer.valueOf(45);
        System.out.println(obj.equals(obj1));
        int a = obj.intValue(); // unboxing
        Integer i1=78; //Autoboxing
        int b = i1; // Autounboxing

    }


}
