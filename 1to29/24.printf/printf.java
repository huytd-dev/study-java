public class printf {
    public static void main(String[] args) {
        // System.out.printf("%d this is format string ",123);// truyen 123 vao %d
        boolean myboolean = true;
        char mychar = '#';
        String mystring = "huy";
        int myint = 48;
        double mydouble = 4881;
        System.out.printf("%b %c %s %d %.2f",myboolean, mychar, mystring, myint, mydouble);
        //true # huy 48 4881.00
        System.out.printf("\nhello %10s",mystring); // hello        huy
        System.out.printf("\nhello %-10s",mystring); // hellohuy
        System.out.printf("\nyou have %.2f",mydouble); //4881.00
        System.out.printf("\nyou have %+20f",mydouble); //         +4881.000000
        System.out.printf("\nyou have %-10f",mydouble); //4,881.000000
    }
}
