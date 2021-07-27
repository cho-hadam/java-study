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

        System.out.println();

        // AnonymousClass
        // 이름이 없는 클래스로 주로 메서드를 재정의 하는 목적으로 사용된다
        new AnonymousClass() {
            @Override
            public void method() {
                System.out.println(" -- AnonymousClass's Override method START -- ");
            }
        }.method();
    }
}
