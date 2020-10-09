package paragraph2;

public class Section0 {
    private static void test1() {
        String a = "a" + "b" + 1;
        String b = "ab1";
        System.out.println(a == b);
    }

}

/**
 * 警告: 二进制文件Section0包含paragraph2.Section0
 * Classfile /home/wpy/IdeaProjects/jvm_practice/others/target/classes/paragraph2/Section0.class
 *   Last modified 2020-10-5; size 611 bytes
 *   MD5 checksum 7fcd163d3f665db55e2cc49c4c3dd4f7
 *   Compiled from "Section0.java"
 * public class paragraph2.Section0
 *   minor version: 0
 *   major version: 52
 *   flags: ACC_PUBLIC, ACC_SUPER
 * Constant pool:
 * @=============================#1===============================
 *    #1 = Methodref          #6.#23         // java/lang/Object."<init>":()V
 *    入口#1,代表一个方法入口，方法入口由#6和#23组成，中间用了一个“.”
 *    #6 = Class              #29            // java/lang/Object
 *    入口#6为一个class, class是一个引用, 引用了入口#29的常量池
 *    #23 = NameAndType        #7:#8          // "<init>":()V
 *    入口#23代表一个表示名称和类型，分别由入口#7和#8组成
 *    #7 = Utf8               <init>
 *    入口#7代表一个常量池内容, <init>代表构造方法
 *    #8 = Utf8               ()V
 *    入口#8是一个真正的常量, 值为()V, 表示没有入口参数返回值为void, 即#23表示一个构造方法, 方法没有入参, 返回值为void
 *    #29 = Utf8               java/lang/Object
 *    #29是一个常量, 值为java/lang/Object, 即上层的#6要求这个字符串代表一个类, 代表的类为java/lang/Object
 *    综上, #1代表一个java.lang.Object的构造方法, 入参个数为0, 返回值为void [#1的注释]
 *
 *
 *    #2 = String             #24            // ab1
 *    #2代表一个String类型的引用入口, 引用的是#24入口的内容
 *    #24 = Utf8               ab1
 *    #24入口表示一个常量, 值为"ab1"
 *
 *    #3 = Fieldref           #25.#26        // java/lang/System.out:Ljava/io/PrintStream;
 *    #3入口代表一个字段, 这个字段引用了#25的类[java/lang/System] #26的的具体属性[out:Ljava/io/PrintStream]
 *    #4 = Methodref          #20.#27        // java/io/PrintStream.println:(Z)V
 *    #4入口代表一个方法入口, 方法入口由#20的类[java/io/PrintStream]与#27的表示名称与类型[println:(Z)V]组成
 *
 *    #5 = Class              #28            // paragraph2/Section0
 *    #6 = Class              #29            // java/lang/Object
 *    #7 = Utf8               <init>
 *    #8 = Utf8               ()V
 *    #9 = Utf8               Code
 *   #10 = Utf8               LineNumberTable
 *   #11 = Utf8               LocalVariableTable
 *   #12 = Utf8               this
 *   #13 = Utf8               Lparagraph2/Section0;
 *   #14 = Utf8               test1
 *   #15 = Utf8               a
 *   #16 = Utf8               Ljava/lang/String;
 *   #17 = Utf8               b
 *   #18 = Utf8               StackMapTable
 *   #19 = Class              #30            // java/lang/String
 *   #20 = Class              #31            // java/io/PrintStream
 *   #21 = Utf8               SourceFile
 *   #22 = Utf8               Section0.java
 *   #23 = NameAndType        #7:#8          // "<init>":()V
 *   #24 = Utf8               ab1
 *   #25 = Class              #32            // java/lang/System
 *   #26 = NameAndType        #33:#34        // out:Ljava/io/PrintStream;
 *   #27 = NameAndType        #35:#36        // println:(Z)V  Z代表boolean类型;;
 *   #28 = Utf8               paragraph2/Section0
 *   #29 = Utf8               java/lang/Object
 *   #30 = Utf8               java/lang/String
 *   #31 = Utf8               java/io/PrintStream
 *   #32 = Utf8               java/lang/System
 *   #33 = Utf8               out
 *   #34 = Utf8               Ljava/io/PrintStream;
 *   #35 = Utf8               println
 *   #36 = Utf8               (Z)V
 * {
 *   public paragraph2.Section0();
 *     descriptor: ()V
 *     flags: ACC_PUBLIC
 *     Code:
 *       stack=1, locals=1, args_size=1
 *       stack表示栈顶的单位大小(每个大小为一个slot, 每个slot是4个字节的宽度), 当需要使用一个数据时, 它首先会被放入栈顶, 使用完后会写回到本地变量或主存中. 这里栈的宽度是1, 代表有一个 this将被使用
 *       locals是本地变量的slot个数, 但是并不代表与stack的宽度一致, 本地变量在这个方法生命周期内, 局部变量最多的时候, 需要多大的宽度来存放数据(double, long会占用2个slot)
 *       args_size代表入口参数的个数, 不再是slot的个数, 即使是传入long, 也只会记录1
 *
 *          0: aload_0
 *          第一个0表示虚指令中的行号, 每个方法从0开始顺序递增, 但是可以跳跃, 跳跃的原因在于一些指令还会接操作的内容, 这些操作的内容可能来自常量池, 也可以标识是低级个slot的本地变量, 因此需要占用一定的空间
 *          aload_0是将“第一个”slot所在的本地变量推到栈顶, 并且这个变量是引用类型的, 相关的指令有alod_[0-3](范围是0x2a ~ 0x2d). 如果超过4个, 则会使用"aload_本地变量的slot位置", alod_[0-3]是通过具体的第几个指令来完成的
 *
 *          1: invokespecial #1                  // Method java/lang/Object."<init>":()V
 *          发生构造方法调用, 父类的构造方法调用, 非静态的private方法调用时会执行invokespecial, 这里需要从常量池获取一个方法, 这个地方会占用两个字节的宽度, 加上指令本身共3个字节, 因此下一个行号是4
 *          4: return
 *          JVM在编译时会自动加上return
 *
 *       LineNumberTable:
 *         line 3: 0
 *       LocalVariableTable:
 *         Start  Length  Slot  Name   Signature
 *             0       5     0  this   Lparagraph2/Section0;
 *       本地变量列表, 本地变量作用域起始位置为0, 作用域宽度为5(0~4), slot的起始位置也是0, 名称为this, 类型为paragraph2.Section0
 * }
 */



/**
 * // class version 52.0 (52)
 * // access flags 0x21
 * public class paragraph2/Section0 {
 *
 *   // compiled from: Section0.java
 *
 *   // access flags 0x1
 *   public <init>()V
 *    L0
 *     LINENUMBER 3 L0
 *     ALOAD 0
 *     INVOKESPECIAL java/lang/Object.<init> ()V
 *     RETURN
 *    L1
 *     LOCALVARIABLE this Lparagraph2/Section0; L0 L1 0
 *     MAXSTACK = 1
 *     MAXLOCALS = 1
 *
 *   // access flags 0xA
 *   private static test1()V
 *    L0
 *     LINENUMBER 5 L0KPP
 *     LDC "ab1"
 *     ASTORE 0
 *    L1
 *     LINENUMBER 6 L1
 *     LDC "ab1"
 *     ASTORE 1
 *    L2
 *     LINENUMBER 7 L2
 *     GETSTATIC java/lang/System.out : Ljava/io/PrintStream;
 *     ALOAD 0
 *     ALOAD 1
 *     IF_ACMPNE L3
 *     ICONST_1
 *     GOTO L4
 *    L3
 *    FRAME FULL [java/lang/String java/lang/String] [java/io/PrintStream]
 *     ICONST_0
 *    L4
 *    FRAME FULL [java/lang/String java/lang/String] [java/io/PrintStream I]
 *     INVOKEVIRTUAL java/io/PrintStream.println (Z)V
 *    L5
 *     LINENUMBER 8 L5
 *     RETURN
 *    L6
 *     LOCALVARIABLE a Ljava/lang/String; L1 L6 0
 *     LOCALVARIABLE b Ljava/lang/String; L2 L6 1
 *     MAXSTACK = 3
 *     MAXLOCALS = 2
 * }
 */
