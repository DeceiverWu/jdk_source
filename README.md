# JDK源码
* 包含自JDK1.6以来的所有JDK源码（1.6/1.7/1.8/1.9/10)
* 用于学习各版本代码间的区别

# JDK各版本新特性介绍

**JDK1.5:**
-----------
1. **自动装箱与拆箱：**
自动装箱的过程：每当需要一种类型的对象时，这种基本类型就自动地封装到与它相同类型的包装中。
自动拆箱的过程：每当需要一个值时，被装箱对象中的值就被自动地提取出来，没必要再去调用intValue()和doubleValue()方法。
自动装箱：基本类型自动转为包装类（int >> Integer）
自动拆箱：包装类自动转为基本类型（Integer >> int）
类型包装器有：Double,Float,Long,Integer,Short,Character和Boolean
>
2. **枚举：**
JDK1.5加入了一个全新的“类”--枚举类型。为此JDK1.5引入了一个新关键字enum。
简单的用法：JavaEnum简单的用法一般用于代表一组常用常量，可用来代表一类相同类型的常量值。
复杂用法：Java为枚举类型提供了一些内置的方法，同事枚举常量还可以有自己的方法。可以很方便的遍历枚举对象。
>
3. **静态导入：**
通过使用 import static，就可以不用指定 Constants 类名而直接使用静态成员，包括静态方法。
import xxxx 和 import static xxxx的区别是前者一般导入的是类文件如import java.util.Scanner;后者一般是导入静态的方法，import static java.lang.System.out。
>
4. **可变参数（Varargs）：**
可变参数的简单语法格式为：methodName([argumentList], dataType...argumentName);
>
5. **内省（Introspector）：**
是 Java语言对Bean类属性、事件的一种缺省处理方法。例如类A中有属性name,那我们可以通过getName,setName来得到其值或者设置新 的值。通过getName/setName来访问name属性，这就是默认的规则。Java中提供了一套API用来访问某个属性的getter /setter方法，通过这些API可以使你不需要了解这个规则，这些API存放于包java.beans中。
>
6. **泛型（Generic）：**
C++ 通过模板技术可以指定集合的元素类型，而Java在1.5之前一直没有相对应的功能。一个集合可以放任何类型的对象，相应地从集合里面拿对象的时候我们也 不得不对他们进行强制得类型转换。引入泛型，它允许指定集合里元素的类型，这样你可以得到强类型在编译时刻进行类型检查的好处。
>
7. **For-Each循环：**
For-Each循环得加入简化了集合的遍历。
>
8. **元数据（注解）（Annotations）：**
>
9. **线程池：**
在Java5之前，要实现一个线程池是相当有难度的，现在Java5为我们做好了一切，我们只需要按照提供的API来使用，即可享受线程池带来的极大便利。在使用线程池之前，需要了解的是java.util.concurrent.Executors类的API，这个类提供大量创建连接池的静态方法，是必须掌握的。
>
>
>

**JDK1.6**
----------
1. **Desktop类和SystemTray：**
前者可以用来打开系统默认浏览器浏览指定的URL，打开系统默认邮件客户端给指定的邮箱发邮件，用默认应用程序打开或编辑文件(比如，用记事本打开以txt为后缀名的文件)，用系统默认的打印机打印文档；后者可以用来在系统托盘区创建一个托盘程序。
>
2. **使用JAXB2来实现对象与XML之间的映射：**
JAXB是Java Architecture for XML Binding的缩写，可以将一个Java对象转变成为XML格式，反之亦然。 
>
3. **StAX：**
StAX是The Streaming API for XML的缩写，一种利用拉模式解析(pull-parsing)XML文档的API.StAX通过提供一种基于事件迭代器(Iterator)的API让 程序员去控制xml文档解析过程,程序遍历这个事件迭代器去处理每一个解析事件，解析事件可以看做是程序拉出来的，也就是程序促使解析器产生一个解析事件 然后处理该事件，之后又促使解析器产生下一个解析事件，如此循环直到碰到文档结束符； 
SAX也是基于事件处理xml文档，但却 是用推模式解析，解析器解析完整个xml文档后，才产生解析事件，然后推给程序去处理这些事件；DOM 采用的方式是将整个xml文档映射到一颗内存树，这样就可以很容易地得到父节点和子结点以及兄弟节点的数据，但如果文档很大，将会严重影响性能。
>
4. **使用Compiler API：**
动态编译Java源文件，如JSP编译引擎就是动态的，所以修改后无需重启服务器。
>
5. **轻量级Http Server API：**
JDK6 提供了一个简单的Http Server API，据此我们可以构建自己的嵌入式Http Server，它支持Http和Https协议，提供了HTTP1.1的部分实现，没有被实现的那部分可以通过扩展已有的Http Server API来实现，程序员必须自己实现HttpHandler接口，HttpServer会调用HttpHandler实现类的回调方法来处理客户端请求，在 这里，我们把一个Http请求和它的响应称为一个交换，包装成HttpExchange类，HttpServer负责将HttpExchange传给 HttpHandler实现类的回调方法。
>
6. **插入式注解处理API(Pluggable Annotation Processing API)：**
它建立了Java 语言本身的一个模型，它把method，package，constructor，type，variable，enum，annotation等Java语言元素映射为Types和Elements(两者有什么区别?)，从而将Java语言的语义映射成为对象，我们可以在javax.lang.model包下面可以看到这些类。
>
7. **用Console开发控制台程序：**
JDK6 中提供了java.io.Console 类专用来访问基于字符的控制台设备。你的程序如果要与Windows下的cmd或者Linux下的Terminal交互，就可以用Console类代劳。
>
8. **对脚本语言的支持：**
如: ruby, groovy, javascript. 
>
9. **Common Annotations：**
原是J2EE 5.0规范的一部分，现在把它的一部分放到了J2SE 6.0中
>
10. **嵌入式数据库 Derby：**
>
>
>

**JDK1.7**
----------
1. **switch语句支持字符串变量：**
switch 语句比较表达式中的String对象和每个case标签关联的表达式，就好像它是在使用String.equals方法一样;因此，switch语句中 String对象的比较是大小写敏感的。相比于链式的if-then-else语句，Java编译器通常会从使用String对象的switch语句中生成更高效的字节码。
>
2. **泛型实例化类型自动推断：**
```
ArrayList<String> al1 = new ArrayList<String>();    // Old  
ArrayList<String> al2 = new ArrayList<>();           // New 
```
>
3. **支持二进制数字字面量：**
从JDK1.7开始，可以用二进制来表示整数（byte,short,int和long）。使用二进制字面量的好处是，可以是代码更容易被理解。语法非常简单，只要在二进制数值前面加 0b或者0B。
```
byte nByte = (byte)0b0001;    
short nShort = (short)0B0010;    
int nInt = 0b0011;    
long nLong = 0b0100L;  
```
>
4. **数字字面量可以出现下划线：**
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
5. **单个catch中捕获多个异常：**
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
6. **try-with-resources语句：**
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
7. **简化的可变参数调用：**
当程序员试图使用一个不可具体化的可变参数并调用一个varargs（可变）方法时，编辑器会生成一个“非安全操作”的警告。 
JDK 7将警告从call转移到了方法声明(methord declaration)的过程中。这样API设计者就可以使用varargs，因为警告的数量大大减少了。
>
>
>
**JDK1.8**
----------
1. **接口的默认方法：**
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
2. **Lambda表达式：**
```
//jdk1.8之前的字符串排列方法
List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
Collections.sort(names, new Comparator<String>() {
    @Override
    public int compare(String a, String b) {
        return b.compareTo(a);
    }
});
只需要给静态方法 Collections.sort 传入一个List对象以及一个比较器来按指定顺序排列。通常做法都是创建一个匿名的比较器对象然后将其传递给sort方法。

//jdk1.8开始使用lambda表达式
Collections.sort(names, (String a, String b) -> {
    return b.compareTo(a);
});

//还可以写得更短
Collections.sort(list, (String a, String b) -> a.compareTo(b));  

//甚至还可以省略类型声明
Collections.sort(names, (a, b) -> b.compareTo(a));
```
>
3. **函数式接口：**
(1) 是一个接口
(2) 只能有一个待实现的方法，可以有default方法。
你只需要给你的接口添加 @FunctionalInterface 注解，编译器如果发现你标注了这个注解的接口有多于一个抽象方法的时候会报错的。
```
@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}
Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
Integer converted = converter.convert("123");
System.out.println(converted);    // 123
需要注意如果@FunctionalInterface如果没有指定，上面的代码也是对的。
```
>
4. **方法引用：**
前一节中的代码还可以通过静态方法引用来表示：
```
Converter<String, Integer> converter = Integer::valueOf;
Integer converted = converter.convert("123");
System.out.println(converted);   // 123
```
Java 8 允许你使用 :: 关键字来传递方法或者构造函数引用，上面的代码展示了如何引用一个静态方法，我们也可以引用一个对象的方法：
```
converter = something::startsWith;
String converted = converter.convert("Java");
System.out.println(converted);    // "J"
```
>
5. **多重注解：**
在Java 5中使用注解有一个限制，即相同的注解在同一位置只能声明一次。Java 8引入重复注解，这样相同的注解在同一地方也可以声明多次。重复注解机制本身需要用@Repeatable注解。Java 8在编译器层做了优化，相同注解会以集合的方式保存，因此底层的原理并没有变化。
>
6. **扩展注解的支持：**
Java 8扩展了注解的上下文，几乎可以为任何东西添加注解，包括局部变量、泛型类、父类与接口的实现，连方法的异常也能添加注解。
>
7. **Optional：**
 Java 8引入Optional类来防止空指针异常，Optional类最先是由Google的Guava项目引入的。Optional类实际上是个容器：它可以保存类型T的值，或者保存null。使用Optional类我们就不用显式进行空指针检查了。
 ```
 Optional<String> optional = Optional.of("bam");
optional.isPresent();           // true
optional.get();                 // "bam"
optional.orElse("fallback");    // "bam"

optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b"
 ```
>
8. **Stream：**
java.util.Stream 表示能应用在一组元素上一次执行的操作序列。Stream 操作分为中间操作或者最终操作两种，最终操作返回一特定类型的计算结果，而中间操作返回Stream本身，这样你就可以将多个操作依次串起来。Stream 的创建需要指定一个数据源，比如 java.util.Collection的子类，List或者Set， Map不支持。Stream的操作可以串行执行或者并行执行。
```
//首先创建要使用的数据
List<String> stringCollection = new ArrayList<>();
stringCollection.add("ddd2");
stringCollection.add("aaa2");

//Sort 排序
stringCollection
    .stream()
    .sorted()
    .filter((s) -> s.startsWith("a"))
    .forEach(System.out::println);

// "aaa1", "aaa2"

//Map 映射
stringCollection
    .stream()
    .map(String::toUpperCase)
    .sorted((a, b) -> b.compareTo(a))
    .forEach(System.out::println);
// "DDD2", "DDD1", "CCC", "BBB3", "BBB2", "AAA2", "AAA1"
```
Java 8扩展了集合类，可以通过 Collection.stream() 或者 Collection.parallelStream() 来创建一个Stream。
>
9. **Date/Time API (JSR 310)：**
Java 8新的Date-Time API (JSR 310)受Joda-Time的影响，提供了新的java.time包，可以用来替代 java.util.Date和java.util.Calendar。一般会用到Clock、LocaleDate、LocalTime、LocaleDateTime、ZonedDateTime、Duration这些类，对于时间日期的改进还是非常不错的。
>
10. **JavaScript引擎Nashorn：**
Nashorn允许在JVM上开发运行JavaScript应用，允许Java与JavaScript相互调用。
>
11. **Base64：**
在Java 8中，Base64编码成为了Java类库的标准。Base64类同时还提供了对URL、MIME友好的编码器与解码器。
>

**JDK1.9**
----------
1. **Java平台模块化系统：**
该特性使Java9最大的一个特性，Java提供该功能的主要的动机在于，减少内存的开销，JVM启动的时候，至少会有30~60MB的内存加载，主要原因是JVM需要加载rt.jar，不管其中的类是否被classloader加载，第一步整个jar都会被JVM加载到内存当中去，模块化可以根据模块的需要加载程序运行需要的class，那么JVM是如何知道需要加载哪些class的呢。
* **模块描述器**
>模块化的 JAR 文件都包含一个额外的模块描述器。在这个模块描述器中, 对其它模块的依赖是通过 “requires” 来表示的。另外, “exports” 语句控制着内部的哪些包是可以被其它模块访问到的。所有不被导出的包默认都封装在模块的里面。如下是一个模块描述器的示例，存在于 “module-info.java” 文件中
```
module blog {
 exports com.pluralsight.blog;
 
 requires cms;
}
```
![module](https://upload-images.jianshu.io/upload_images/8077763-ac7fc8d6816822d2.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/700)

2. **Linking（Java连接器）：**
>当你使用具有显式依赖关系的模块和模块化的 JDK 时，新的可能性出现了。你的应用程序模块现在将声明其对其他应用程序模块的依赖以及对其所使用的 JDK 模块的依赖。为什么不使用这些信息创建一个最小的运行时环境，其中只包含运行应用程序所需的那些模块呢？ 这可以通过 Java 9 中的新的 jlink 工具实现。你可以创建针对应用程序进行优化的最小运行时映像而不需要使用完全加载 JDK 安装版本。

3. **JShell（交互式Java REPL）：**
>你可能问：“REPL是什么”?REPL是一种快速运行语句的命令行工具。

>在Java中，如果你想执行一个简单的语句，我们要么创建一个带main方法的类，要么创建一个可以执行的Test类。当你正在启动Java程序的时候，如果你想执行某些语句并且想立刻看见执行结果，上面的做法看起来不是那么有用了。

>Java 9 让Java也可以像脚本语言一样来运行了，主要得益于JShell

>JShell试图去解决这个问题。Java开发者可以利用JShell在没有创建类的情况下直接声明变量，计算表达式，执行语句。JShell也可以从文件中加载语句或者将语句保存到文件中。并且JShell也可以是tab键进行自动补全的特性
```
jdk-9\bin>jshell.exe  
|  Welcome to JShell -- Version 9  
|  For an introduction type: /help intro  
jshell> "This is my long string. I want a part of it".substring(8,19);  
$5 ==> "my long string"
jshell> int a = 90;
a ==> 90
jshell> a
a ==> 90
```

4. **集合工厂方法：**
在Java 9之前，Java只能利用一些实用方法（例如：Collections.unmodifiableCollection(Collection<? extends T> c)）创建一个不可修改视图的集合。例如，我们可以在Java 8中使用一条如下所示的语句，创建一个Collection的不可修改的视图。
```
//Java 9之前
Map<String, String> immutableMap =
Collections.unmodifiableMap(
            new HashMap<String, String>() {{
                put("key1", "Value1");
                put("key2", "Value2");
                put("key3", "Value3");
            }});
```
```
//Java 9
Map<String, String> immutableMap = Map.of("key1", "Value1", "key2", "Value2"，"key3", "Value3");
```
下面是工厂方法的例子：
```
// empty immutable collections 不可修改的空集合
List<String> emptyImmutableList = List.of();
Set<String> emptyImmutableSet = Set.of();
Map emptyImmutableMap = Map.of();

// immutable collections 不可修改的集合
List<String> immutableList = List.of("one", "two");
Set<String> immutableSet = Set.of("value1", "value2");
Map<String, String> immutableMap = Map.of("key1", "Value1", "key2", "Value2", "key3", "Value3");
```

5. **多版本兼容Jar：**
>我们最后要来着重介绍的这个特性对于库的维护者而言是个特别好的消息。当一个新版本的 Java 出现的时候，你的库用户要花费数年时间才会切换到这个新的版本。这就意味着库得去向后兼容你想要支持的最老的 Java 版本 (许多情况下就是 Java 6 或者 7)。这实际上意味着未来的很长一段时间，你都不能在库中运用 Java 9 所提供的新特性。幸运的是，多版本兼容 JAR 功能能让你创建仅在特定版本的 Java 环境中运行库程序时选择使用的 class 版本：
```
multirelease.jar
├── META-INF
│   └── versions
│       └── 9
│           └── multirelease
│               └── Helper.class
├── multirelease
    ├── Helper.class
    └── Main.class
```
在上述场景中， multirelease.jar 可以在 Java 9 中使用, 不过 Helper 这个类使用的不是顶层的 multirelease.Helper 这个 class, 而是处在“META-INF/versions/9”下面的这个。这是特别为 Java 9 准备的 class 版本，可以运用 Java 9 所提供的特性和库。同时，在早期的 Java 诸版本中使用这个 JAR 也是能运行的，因为较老版本的 Java 只会看到顶层的这个 Helper 类。

6. **私有接口方法：**
>Java 8 为我们带来了接口的默认方法。 接口现在也可以包含行为，而不仅仅是方法签名。 但是，如果在接口上有几个默认方法，代码几乎相同，会发生什么情况？ 通常，您将重构这些方法，调用一个可复用的私有方法。 但默认方法不能是私有的。 将复用代码创建为一个默认方法不是一个解决方案，因为该辅助方法会成为公共API的一部分。 使用 Java 9，您可以向接口添加私有辅助方法来解决此问题：
```
public interface MyInterface {
 
  void normalInterfaceMethod();
 
  default void interfaceMethodWithDefault() { init(); }
 
  default void anotherDefaultMethod() { init(); }
 
  // This method is not part of the public API exposed by MyInterface
  private void init() { System.out.println("Initializing"); }
}
```
如果您使用默认方法开发 API ，那么私有接口方法可能有助于构建其实现。
```
interface InterfaceWithPrivateMethods {  
       
    private static String staticPrivate() {  
        return "static private";  
    }  
       
    private String instancePrivate() {  
        return "instance private";  
    }  
       
    default void check() {  
        String result = staticPrivate();  
        InterfaceWithPrivateMethods pvt = new InterfaceWithPrivateMethods() {  
            // anonymous class  
        };  
        result = pvt.instancePrivate();  
    }  
}}
```
**该特性完全是为了Java 8中default方法和static方法服务的。**

7. **java.net新内容：**
>就目前而言，JDK提供的Http访问功能，几乎都需要依赖于HttpURLConnection，但是这个类大家在写代码的时候很少使用，我们一般都会选择Apache的Http Client，此次在Java 9的版本中引入了一个新的package:java.net.http，里面提供了对Http访问很好的支持，不仅支持Http1.1而且还支持HTTP2，以及WebSocket，据说性能可以超过Apache HttpClient，Netty，Jetty
```
URI httpURI = new URI("http://www.google.com");  
HttpRequest request = HttpRequest.create(httpURI).GET();  
HttpResponse response = request.response();  
String responseBody = response.body(HttpResponse.asString());
```
* **http/2**
>Java 9 中有新的方式来处理 HTTP 调用。这个迟到的特性用于代替老旧的 **HttpURLConnection** API，并提供对 WebSocket 和 HTTP/2 的支持。注意：新的 HttpClient API 在 Java 9 中以所谓的孵化器模块交付。也就是说，这套 API 不能保证 100% 完成。不过你可以在 Java 9 中开始使用这套 API：
```
HttpClient client = HttpClient.newHttpClient();
 
HttpRequest req =
   HttpRequest.newBuilder(URI.create("http://www.google.com"))
              .header("User-Agent","Java")
              .GET()
              .build();
 
 
HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandler.asString());
```
除了这个简单的请求/响应模型之外，HttpClient 还提供了新的 API 来处理 HTTP/2 的特性，比如流和服务端推送。

8. **核心库新内容：**
* **轻量级的json文本处理api**
* **多线程新内容**
>新增ProcessHandle类，该类提供进程的本地进程ID、参数、命令、启动时间、累计CPU时间、用户、父进程和子进程。这个类还可以监控进程的活力和破坏进程。ProcessHandle。onExit方法，当进程退出时，复杂未来类的异步机制可以执行一个操作。

>包括一个可互操作的发布-订阅框架，以及对CompletableFuture API的增强。
在Java很早的版本中，提供了Process这样的API可以获得进程的一些信息，包括runtime，甚至是用它来执行当前主机的一些命令，但是请大家思考一个问题，你如何获得你当前Java运行程序的PID？很显然通过Process是无法获得的，需要借助于JMX才能得到，但是在这一次的增强中，你将会很轻松的得到这样的信息，我们来看一个简单的例子

```
ProcessHandle self = ProcessHandle.current();  
long PID = self.getPid();  
ProcessHandle.Info procInfo = self.info();  
    
Optional<String[]> args = procInfo.arguments();  
Optional<String> cmd =  procInfo.commandLine();  
Optional<Instant> startTime = procInfo.startInstant();  
Optional<Duration> cpuUsage = procInfo.totalCpuDuration();
```
已经获取到了JVM的进程，我们该如何将该进程优雅的停掉呢？下面的代码给出了答案
```
childProc = ProcessHandle.current().children();  
childProc.forEach(procHandle -> {  
    assertTrue("Could not kill process " + procHandle.getPid(), procHandle.destroy());  
});
```

* **Publish-Subscribe Framework**
>在新版的JDK 9 中提供了消息发布订阅的框架，该框架主要是由Flow这个类提供的，他同样会在java.util.concurrent中出现，并且提供了Reactive编程模式。

* **增强的弃用标记**
>Java 9提供了另外一个看起来很小的特性，那就是增强的弃用标记，能够让开发人员更好地理解代码的影响。以前，我们只能将代码标记为deprecated并在Javadoc中添加一些原因说明的文档，现在@Deprecated新增了两个有用的属性：since和orRemoval。

* **Thread.onSpinWait**
>Java 9允许我们为JVM提供一些提示信息，便于实现性能的提升。具体来讲，如果你的代码需要在一个循环中等待某个条件发生的话，那么可以使用Thread.onSpinWait让运行时环境了解到这一点。

9. **Try-With-Resources的改变：**
>我们都知道，Try-With-Resources是从JDK 7 中引入的一项重要特征，只要接口继承了Closable就可以使用Try-With-Resources，减少finally语句块的编写，在Java 9 中会更加的方便这一特征
```
MyAutoCloseable mac = new MyAutoCloseable();
try (mac) {
   // do some stuff with mac
}

try (new MyAutoCloseable() { }.finalWrapper.finalCloseable) {
  // do some stuff with finalCloseable
}
```
10. **Мulti-Resolution Image API：**
>目标是定义多分辨率图像API，这样开发者就能很容易的操作和展示不同分辨率的图像了。
这个新的API定义在java.awt.image包中，这个API能给我们带来如下的帮助：
* 将不同分辨率的图像封装到一张（多分辨率的）图像中，作为它的变体。
* 获取这个图像的所有变体。
* 获取特定分辨率的图像变体–表示一张已知分辨率单位为DPI的特定尺寸大小的逻辑图像，并且这张图像是最佳的变体。

>基于当前屏幕分辨率大小和运用的图像转换算法，java.awt.Graphics类可以从接口MultiResolutionImage获取所需的变体。java.awt.image.AbstractMultiResolutionImage类提供了ava.awt.image.AbstractMultiResolutionImage 默认实现。AbstractMultiResolutionImage的基础实现是java.awt.image.BaseMultiResolutionImage。

11. **改进的 Stream API：**
>长期以来，Stream API 都是 Java 标准库最好的改进之一。通过这套 API 可以在集合上建立用于转换的申明管道。在 Java 9 中它会变得更好。Stream 接口中添加了 4 个新的方法：dropWhile, takeWhile, ofNullable。还有个 iterate 方法的新重载方法，可以让你提供一个 Predicate (判断条件)来指定什么时候结束迭代：

    IntStream.iterate(1, i -> i < 100, i -> i + 1).forEach(System.out::println);

>第二个参数是一个 Lambda，它会在当前 IntStream 中的元素到达 100 的时候返回 true。因此这个简单的示例是向控制台打印 1 到 99。

>除了对 Stream 本身的扩展，Optional 和 Stream 之间的结合也得到了改进。现在可以通过 Optional 的新方法 `stram` 将一个 Optional 对象转换为一个(可能是空的) Stream 对象：

    Stream<Integer> s = Optional.of(1).stream();

>在组合复杂的 Stream 管道时，将 Optional 转换为 Stream 非常有用。

12. **使用G1垃圾回收器作为默认的垃圾回收器：**
>移除很多已经被过期的GCC回收器（是移除哦，因为在Jdk 8 中只是加了过期的标记）