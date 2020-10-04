package paragraph2;

public class Section0 {
    private static void test1() {
        String a = "a" + "b" + 1;
        String b = "ab1";
        System.out.println(a == b);
    }

    public static void main(String[] args) {
        test1();
    }
}

/**
 * // class version 52.0 (52)
 * // access flags 0x21
 * public class paragraph2/Section0 {
 * <p>
 * // compiled from: Section0.java
 * <p>
 * // access flags 0x1
 * public <init>()V
 * L0
 * LINENUMBER 3 L0
 * ALOAD 0
 * INVOKESPECIAL java/lang/Object.<init> ()V
 * RETURN
 * L1
 * LOCALVARIABLE this Lparagraph2/Section0; L0 L1 0
 * MAXSTACK = 1
 * MAXLOCALS = 1
 * <p>
 * // access flags 0xA
 * private static test1()V
 * L0
 * LINENUMBER 5 L0
 * LDC "ab1"
 * ASTORE 0
 * L1
 * LINENUMBER 6 L1
 * LDC "ab1"
 * ASTORE 1
 * L2
 * LINENUMBER 7 L2
 * GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
 * ALOAD 0
 * ALOAD 1
 * IF_ACMPNE L3
 * ICONST_1
 * GOTO L4
 * L3
 * FRAME FULL [java/lang/String java/lang/String] [java/io/PrintStream]
 * ICONST_0
 * L4
 * FRAME FULL [java/lang/String java/lang/String] [java/io/PrintStream I]
 * INVOKEVIRTUAL java/io/PrintStream.println (Z)V
 * L5
 * LINENUMBER 8 L5
 * RETURN
 * L6
 * LOCALVARIABLE a Ljava/lang/String; L1 L6 0
 * LOCALVARIABLE b Ljava/lang/String; L2 L6 1
 * MAXSTACK = 3
 * MAXLOCALS = 2
 * }
 */
