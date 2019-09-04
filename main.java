public class main {
    public static void main(String[] args) {
//        intstack obj=new intstack();
//        System.out.println(obj.push(2));
//
//        System.out.println(obj.push(4));
//
//        System.out.println(obj.push(7));
//
//        System.out.println(obj.push(9));
//
//        System.out.println("-------------------");
//        System.out.println(obj.pop());
//        System.out.println(obj.pop());
//        System.out.println(obj.pop());
//        System.out.println(obj.pop());
//        System.out.println(obj.pop());
        person p1=new person("vinit","123");
        person p2=new person("saini","321");

        personstack ps1=new personstack();
        ps1.push(p1);
        ps1.push(p2);
        System.out.println(ps1.pop().toString());
        System.out.println(ps1.pop().toString());
        //System.out.println(ps1.pop().toString());
    }
}
