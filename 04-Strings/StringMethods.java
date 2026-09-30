public class StringMethods{
    public static void main(String[] args){
        String str="Java Full Stack";
        System.out.println("Original: " + str);
        System.out.println("Length of the string: " + str.length());
        System.out.println("Character at index 5: " + str.charAt(5));
        System.out.println("Substring from index 5 to 10: " + str.substring(5, 10));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Replace 'Full' with 'Backend': " + str.replace("Full", "Backend"));
        System.out.println("Index of 'Stack': " + str.indexOf("Stack"));
        System.out.println("Does the string start with 'Java'? " + str.startsWith("Java"));
        System.out.println("Does the string end with 'Stack'? " + str.endsWith("Stack"));
        System.out.println("Trimmed string: " + str.trim());
        System.out.println("equals 'Java Full Stack'? " + str.equals("Java Full Stack"));
        System.out.println("equalsIgnoreCase 'java full stack'? " + str.equalsIgnoreCase("java full stack"));}
}
