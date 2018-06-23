# JDK源码
* 包含自JDK1.6以来的所有JDK源码（1.6/1.7/1.8/1.9/10)
* 用于学习各版本代码间的区别

# JDK各版本新特性介绍

**JDK1.5:**
-----------
1. **自动装箱与拆箱**
自动装箱的过程：每当需要一种类型的对象时，这种基本类型就自动地封装到与它相同类型的包装中。
自动拆箱的过程：每当需要一个值时，被装箱对象中的值就被自动地提取出来，没必要再去调用intValue()和doubleValue()方法。
自动装箱：基本类型自动转为包装类（int >> Integer）
自动拆箱：包装类自动转为基本类型（Integer >> int）
类型包装器有：Double,Float,Long,Integer,Short,Character和Boolean
>
2. **枚举**
JDK1.5加入了一个全新的“类”--枚举类型。为此JDK1.5引入了一个新关键字enum。
简单的用法：JavaEnum简单的用法一般用于代表一组常用常量，可用来代表一类相同类型的常量值。
复杂用法：Java为枚举类型提供了一些内置的方法，同事枚举常量还可以有自己的方法。可以很方便的遍历枚举对象。
>
3. **静态导入**
通过使用 import static，就可以不用指定 Constants 类名而直接使用静态成员，包括静态方法。
import xxxx 和 import static xxxx的区别是前者一般导入的是类文件如import java.util.Scanner;后者一般是导入静态的方法，import static java.lang.System.out。
>
4. **可变参数（Varargs）**
可变参数的简单语法格式为：methodName([argumentList], dataType...argumentName);
>
5. **内省（Introspector）**
是 Java语言对Bean类属性、事件的一种缺省处理方法。例如类A中有属性name,那我们可以通过getName,setName来得到其值或者设置新 的值。通过getName/setName来访问name属性，这就是默认的规则。Java中提供了一套API用来访问某个属性的getter /setter方法，通过这些API可以使你不需要了解这个规则，这些API存放于包java.beans中。
>
6. **泛型（Generic）**
C++ 通过模板技术可以指定集合的元素类型，而Java在1.5之前一直没有相对应的功能。一个集合可以放任何类型的对象，相应地从集合里面拿对象的时候我们也 不得不对他们进行强制得类型转换。引入泛型，它允许指定集合里元素的类型，这样你可以得到强类型在编译时刻进行类型检查的好处。
>
7. **For-Each循环**
For-Each循环得加入简化了集合的遍历。
>
8. **元数据（注解）（Annotations）**
>
9. **线程池**
在Java5之前，要实现一个线程池是相当有难度的，现在Java5为我们做好了一切，我们只需要按照提供的API来使用，即可享受线程池带来的极大便利。在使用线程池之前，需要了解的是java.util.concurrent.Executors类的API，这个类提供大量创建连接池的静态方法，是必须掌握的。
>
>
>

**JDK1.6**
----------
1. **Desktop类和SystemTray**
前者可以用来打开系统默认浏览器浏览指定的URL，打开系统默认邮件客户端给指定的邮箱发邮件，用默认应用程序打开或编辑文件(比如，用记事本打开以txt为后缀名的文件)，用系统默认的打印机打印文档；后者可以用来在系统托盘区创建一个托盘程序。
>
2. **使用JAXB2来实现对象与XML之间的映射**
JAXB是Java Architecture for XML Binding的缩写，可以将一个Java对象转变成为XML格式，反之亦然。 
>
3. **StAX**
StAX是The Streaming API for XML的缩写，一种利用拉模式解析(pull-parsing)XML文档的API.StAX通过提供一种基于事件迭代器(Iterator)的API让 程序员去控制xml文档解析过程,程序遍历这个事件迭代器去处理每一个解析事件，解析事件可以看做是程序拉出来的，也就是程序促使解析器产生一个解析事件 然后处理该事件，之后又促使解析器产生下一个解析事件，如此循环直到碰到文档结束符； 
SAX也是基于事件处理xml文档，但却 是用推模式解析，解析器解析完整个xml文档后，才产生解析事件，然后推给程序去处理这些事件；DOM 采用的方式是将整个xml文档映射到一颗内存树，这样就可以很容易地得到父节点和子结点以及兄弟节点的数据，但如果文档很大，将会严重影响性能。
>
4. **使用Compiler API**
动态编译Java源文件，如JSP编译引擎就是动态的，所以修改后无需重启服务器。
>
5. **轻量级Http Server API**
JDK6 提供了一个简单的Http Server API，据此我们可以构建自己的嵌入式Http Server，它支持Http和Https协议，提供了HTTP1.1的部分实现，没有被实现的那部分可以通过扩展已有的Http Server API来实现，程序员必须自己实现HttpHandler接口，HttpServer会调用HttpHandler实现类的回调方法来处理客户端请求，在 这里，我们把一个Http请求和它的响应称为一个交换，包装成HttpExchange类，HttpServer负责将HttpExchange传给 HttpHandler实现类的回调方法。
>
6. **插入式注解处理API(Pluggable Annotation Processing API)**
它建立了Java 语言本身的一个模型，它把method，package，constructor，type，variable，enum，annotation等Java语言元素映射为Types和Elements(两者有什么区别?)，从而将Java语言的语义映射成为对象，我们可以在javax.lang.model包下面可以看到这些类。
>
7. **用Console开发控制台程序**
JDK6 中提供了java.io.Console 类专用来访问基于字符的控制台设备。你的程序如果要与Windows下的cmd或者Linux下的Terminal交互，就可以用Console类代劳。
>
8. **对脚本语言的支持**
如: ruby, groovy, javascript. 
>
9. **Common Annotations**
原是J2EE 5.0规范的一部分，现在把它的一部分放到了J2SE 6.0中
>
10. **嵌入式数据库 Derby**
>
>
>

**JDK1.7**
----------
1. **switch语句支持字符串变量**
switch 语句比较表达式中的String对象和每个case标签关联的表达式，就好像它是在使用String.equals方法一样;因此，switch语句中 String对象的比较是大小写敏感的。相比于链式的if-then-else语句，Java编译器通常会从使用String对象的switch语句中生成更高效的字节码。
>
2. **泛型实例化类型自动推断**
```
ArrayList<String> al1 = new ArrayList<String>();    // Old  
ArrayList<String> al2 = new ArrayList<>();           // New 
```
>
3. **支持二进制数字字面量**
从JDK1.7开始，可以用二进制来表示整数（byte,short,int和long）。使用二进制字面量的好处是，可以是代码更容易被理解。语法非常简单，只要在二进制数值前面加 0b或者0B。
```
byte nByte = (byte)0b0001;    
short nShort = (short)0B0010;    
int nInt = 0b0011;    
long nLong = 0b0100L;  
```
>
4. **数字字面量可以出现下划线**
用下划线连接整数提升其可读性，自身无含义，不可用在数字的起始和末尾。
```
float pi1 = 3_.1415F; // 无效的; 不能在小数点之前有下划线  
float pi2 = 3._1415F; // 无效的; 不能在小数点之后有下划线  
long socialSecurityNumber1=999_99_9999_L;//无效的，不能在L下标之前加下划线  
int a1 = _52; // 这是一个下划线开头的标识符，不是个数字  
int a2 = 5_2; // 有效  
int a3 = 52_; // 无效的，不能以下划线结尾  
int a4 = 5_______2; // 有效的  
int a5 = 0_x52; // 无效，不能在0x之间有下划线  
int a6 = 0x_52; // 无效的，不能在数字开头有下划线  
int a7 = 0x5_2; // 有效的 (16进制数字)  
int a8 = 0x52_; // 无效的，不能以下划线结尾  
int a9 = 0_52; // 有效的（8进制数）  
int a10 = 05_2; // 有效的（8进制数）  
int a11 = 052_; // 无效的，不能以下划线结尾  
```
>
5. **单个catch中捕获多个异常**
在Java 7中，catch代码块得到了升级，用以在单个catch块中处理多个异常。如果你要捕获多个异常并且它们包含相似的代码，使用这一特性将会减少代码重复度。下面用一个例子来理解。
```
//jdk1.7之前
try {
   ......
} catch(ClassNotFoundException ex) {
   ex.printStackTrace();
} catch(SQLException ex) {
   ex.printStackTrace();
}

//jdk1.7
try { 
......
} catch(ClassNotFoundException|SQLException ex){ 

    ex.printStackTrace();
}
```
>
6. **try-with-resources语句**
try-with-resources语句是一个声明一个或多个资源的try语句。一个资源作为一个对象，必须在程序结束之后关闭。try-with-resources语句确保在语句的最后每个资源都被关闭，任何实现了Java.lang.AutoCloseable和java.io.Closeable的对象都可以使用try-with-resource来实现异常处理和关闭资源。
```
//jdk1.7之前
BufferedReader br = null;    
try {    
    br = new BufferedReader(new FileReader(path));    
    return br.readLine();    
} catch (IOException e) {    
    e.printStackTrace();    
} finally {//必须在这里关闭资源    
    if (br != null)    
        br.close();    
}

//jdk1.7
try (BufferedReader br = new BufferedReader(new FileReader(path))) {    
    return br.readLine();    
}    
```
>
7. **简化的可变参数调用**
当程序员试图使用一个不可具体化的可变参数并调用一个varargs（可变）方法时，编辑器会生成一个“非安全操作”的警告。 
JDK 7将警告从call转移到了方法声明(methord declaration)的过程中。这样API设计者就可以使用varargs，因为警告的数量大大减少了。
>
>
>
**JDK1.8**
----------
1. **接口的默认方法**
Java 8允许我们给接口添加一个非抽象的方法实现，只需要使用 default关键字即可，这个特征又叫做扩展方法，示例如下：
```
public interface Formula {    
    double calculate(int a);    
    
    // jdk8能给接口添加一个非抽象的方法实现    
    default double sqrt(int a){    
        return Math.sqrt(a);    
    }    
} 
```
>
2. **Lambda表达式**

3. **函数式接口**

4. **方法引用**

5. **多重注解**

6. **扩展注解的支持**

7. **Optional**

8. **Stream**

9. **Date/Time API (JSR 310)**

10. **JavaScript引擎Nashorn**

11. **Base64**
