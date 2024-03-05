package best450;

public class P050Strings {
    /**
     * A String in Java that is specified as immutable,
     * as the content shared storage in a single pool
     * to minimize creating a copy of the same value.
     * String class and all wrapper classes in Java
     * that include Boolean, Character, Byte, Short,
     * Integer, Long, Float, and Double are immutable.
     * A user is free to create immutable classes of their own.
     */

    public static void main(String[] args) {
        String str = "Knowledge";
        String s = str;
        str = str.concat(" Base");
        System.out.println(str);
        System.out.println(s);

    }
}
