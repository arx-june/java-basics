public class DataTypes{
    public static void main(String[] args) {
        byte   by  = 10;
        short  sh  = 2000;
        int    i   = 300000;
        long   ln  = 10000000000L;
        float  fl  = 3.14f;
        double db  = 9.87654321;
        char   ch  = 'Z';
        boolean bl = true;
        String str = "Hello, Java!";

        System.out.println("byte    by  = " + by);
        System.out.println("short   sh  = " + sh);
        System.out.println("int     i   = " + i);
        System.out.println("long    ln  = " + ln);
        System.out.println("float   fl  = " + fl);
        System.out.println("double  db  = " + db);
        System.out.println("char    ch  = " + ch);
        System.out.println("boolean bl  = " + bl);
        System.out.println("String  str = " + str);

        // Simple operation combining types
        double result = by + sh + i + ln + fl + db;
        System.out.println("\nCombined numeric sum (promoted to double): " + result);
    }
}
