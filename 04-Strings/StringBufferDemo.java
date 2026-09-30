public class StringBufferDemo{
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("Java Full Stack");
        System.out.println("Original: " + sb);
        sb.append(" is awesome");
        System.out.println("After append: " + sb);
        sb.insert(5, "Backend ");
        System.out.println("After insert: " + sb);
        sb.delete(5, 12);
        System.out.println("After delete: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);
        sb.replace(0, 4, "Python");
        System.out.println("After replace: " + sb);
    }
}