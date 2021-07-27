public class MainClass {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        System.out.println("oc.num " + oc.num);
        System.out.println("oc.str1 " + oc.str1);

        System.out.println();

        // InnerClass
        OuterClass.InnerClass in = oc.new InnerClass();
        System.out.println("in.num " + in.num);
        System.out.println("in.str2 " + in.str2);

        System.out.println();

        // StaticInnerClass
        OuterClass.StaticInnerClass si = new OuterClass.StaticInnerClass();
        System.out.println("si.num " + si.num);
        System.out.println("si.str3" + si.str3);
    }
}
