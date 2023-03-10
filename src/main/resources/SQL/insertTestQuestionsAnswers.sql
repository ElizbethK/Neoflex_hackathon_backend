--SQL создание базы вопросов и ответов

--1
INSERT INTO question (question_id, title, lesson_test_id) VALUES (1, '<p>In Java, which of the following methods is used for grouping objects and storing the results in a <strong>Ma<\/strong><strong>p<\/strong><em>&nbsp;<\/em>instance?<\/p>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (1, 'Collectors.groupingBy()', 1);
INSERT INTO answer (question_id, variant, value) VALUES (1, 'Collectors.groupBy()', 0);
INSERT INTO answer (question_id, variant, value) VALUES (1, 'Collectors.partitioningBy()', 0);
INSERT INTO answer (question_id, variant, value) VALUES (1, 'Collectors.partitionBy()', 0);

--2
INSERT INTO question (question_id, title, lesson_test_id) VALUES (2, '<p>In Java, which of the following methods are newly introduced to the <strong>collection<\/strong> class?<\/p>\n\n<ol>\n    <li>removeIf()<\/li>\n    <li>stream()<\/li>\n    <li>remove()<\/li>\n    <li>parallelStream()<\/li>\n<\/ol>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (2, '1, 2, and 4', 1);
INSERT INTO answer (question_id, variant, value) VALUES (2, '1 and 2', 0);
INSERT INTO answer (question_id, variant, value) VALUES (2, '2, 3, and 4', 0);
INSERT INTO answer (question_id, variant, value) VALUES (2, '1 and 4', 0);

--3
INSERT INTO question (question_id, title, lesson_test_id) VALUES (3, '<p>In Java, which of the following interfaces are implemented by a&nbsp;<strong>HashMap<\/strong>?<\/p>\n\n<ol>\n    <li>Serializable<\/li>\n    <li>Map<\/li>\n    <li>Cloneable<\/li>\n<\/ol>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (3, '1', 1);
INSERT INTO answer (question_id, variant, value) VALUES (3, '1 and 2', 0);
INSERT INTO answer (question_id, variant, value) VALUES (3, '2 and 3', 0);
INSERT INTO answer (question_id, variant, value) VALUES (3, '4', 0);

--4
INSERT INTO question (question_id, title, lesson_test_id) VALUES (4, '<p>Which of the following&nbsp;<strong>servlet<\/strong> methods is used to handle a request coming from an HTML form with no METHOD specified?<\/p>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (4, 'doPost()', 0);
INSERT INTO answer (question_id, variant, value) VALUES (4, 'doGet()', 1);
INSERT INTO answer (question_id, variant, value) VALUES (4, 'doRequest', 0);
INSERT INTO answer (question_id, variant, value) VALUES (4, 'None of these', 0);

--5
INSERT INTO question (question_id, title, lesson_test_id) VALUES (5, '<p>Which of the following methods is provided by the&nbsp;<em>HttpServletRequest <\/em>interface for accessing cookies present in a request?<\/p>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (5, 'getCookies()', 1);
INSERT INTO answer (question_id, variant, value) VALUES (5, 'getCookie(', 0);
INSERT INTO answer (question_id, variant, value) VALUES (5, 'retrieveCookie()', 0);
INSERT INTO answer (question_id, variant, value) VALUES (5, 'getServletCookies()', 0);

--6
INSERT INTO question (question_id, title, lesson_test_id) VALUES (6, '<p>Which of the following deployment descriptors is used in servlets?<\/p>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (6, 'web.json', 0);
INSERT INTO answer (question_id, variant, value) VALUES (6, 'web.xml', 1);
INSERT INTO answer (question_id, variant, value) VALUES (6, 'web.js', 0);
INSERT INTO answer (question_id, variant, value) VALUES (6, 'web.html', 0);

--7
INSERT INTO question (question_id, title, lesson_test_id) VALUES (7, '<p>In&nbsp;Java, what&nbsp;is the output of the following code:<\/p>\n\n<pre class=\"prettyprint\"><code>class A{  \n   private double num = 100;\n   private int square(int a){\n    return a*a;\n   }\n}  \npublic class Begin{\n   public static void main(String []aa){  \n    A obj = new A();  \n    System.out.println(obj.num); \n    System.out.println(obj.square(10));\n   }  \n}<\/code><\/pre>\n\n<p>&nbsp;<\/p>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (7, '100 and 100', 0);
INSERT INTO answer (question_id, variant, value) VALUES (7, 'Runtime error', 0);
INSERT INTO answer (question_id, variant, value) VALUES (7, 'Compilation error', 1);
INSERT INTO answer (question_id, variant, value) VALUES (7, 'None of these', 0);

--8
INSERT INTO question (question_id, title, lesson_test_id) VALUES (8, '<p>Which of the following statements about access modifiers is true:<\/p>\n\n<ol>\n    <li>Access specifiers are keywords in object-oriented languages that set the accessibility of&nbsp;classes, methods, and other members.<\/li>\n    <li>Access modifiers are a specific part of a programming language syntax that is used to facilitate the encapsulation of components.<\/li>\n    <li>The public access specifier gives access to the member function from outside the class.&nbsp;<\/li>\n<\/ol>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (8, 'Only 2 is true', 0);
INSERT INTO answer (question_id, variant, value) VALUES (8, 'Both 2 and 3 are true', 0);
INSERT INTO answer (question_id, variant, value) VALUES (8, 'Both 1 and 3 are tru', 0);
INSERT INTO answer (question_id, variant, value) VALUES (8, 'All of these', 1);

--9
INSERT INTO question (question_id, title, lesson_test_id) VALUES (9, '<p>Which of the following statements about access modifiers in Java is true?<\/p>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (9, 'The protected modifiers\u00a0have more visibility or scope compared to private and lesser as\u00a0compared to default modifiers.', 1);
INSERT INTO answer (question_id, variant, value) VALUES (9, 'The public\u00a0modifiers\u00a0have more visibility or scope compared to private and lesser as\u00a0compared to protected modifiers.', 0);
INSERT INTO answer (question_id, variant, value) VALUES (9, 'The protected modifiers\u00a0have more visibility or scope compared to private and lesser as\u00a0compared to public modifiers.', 0);
INSERT INTO answer (question_id, variant, value) VALUES (9, 'The public modifiers\u00a0have more visibility or scope compared to private and lesser as\u00a0compared to default\u00a0modifiers."]', 0);

--10
INSERT INTO question (question_id, title, lesson_test_id) VALUES (10, '<p>Which of the following methods is used for pure internal behaviors to a class that will never be shared outside itself?<\/p>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (10, 'Public', 0);
INSERT INTO answer (question_id, variant, value) VALUES (10, 'Protected', 0);
INSERT INTO answer (question_id, variant, value) VALUES (10, 'Private', 1);
INSERT INTO answer (question_id, variant, value) VALUES (10, 'Public', 0);

--11
INSERT INTO question (question_id, title, lesson_test_id) VALUES (11, '<p>Which of the following methods of the <strong>ServletRequest <\/strong>interface are used to access&nbsp;attributes?<\/p>\n\n<ol>\n    <li>getAttribute()<\/li>\n    <li>getAttributeNames()<\/li>\n    <li>setAttribute()<\/li>\n    <li>setAttributeNames()<\/li>\n<\/ol>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (11, '1 and 3', 0);
INSERT INTO answer (question_id, variant, value) VALUES (11, '2 and 4', 0);
INSERT INTO answer (question_id, variant, value) VALUES (11, '1, 2, and 3', 1);
INSERT INTO answer (question_id, variant, value) VALUES (11, '1, 2, and 4', 0);


--12
INSERT INTO question (question_id, title, lesson_test_id) VALUES (12, '<p>Which of the following methods of the <em>ServletResponse <\/em>interface allows a servlet to access and set buffering information?<\/p>\n\n<ol>\n    <li>getBufferSize()<\/li>\n    <li>reset()<\/li>\n    <li>isCommitted()<\/li>\n    <li>resetBuffer()<\/li>\n<\/ol>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (12, '1 and 4', 0);
INSERT INTO answer (question_id, variant, value) VALUES (12, '1, 2, and 4', 0);
INSERT INTO answer (question_id, variant, value) VALUES (12, '2 and 4', 0);
INSERT INTO answer (question_id, variant, value) VALUES (12, 'All of these', 1);

--13
INSERT INTO question (question_id, title, lesson_test_id) VALUES (13, '<p>In Servlets, which of the following conditions must be satisfied&nbsp;before populating the post form&nbsp;data to a parameter set?<\/p>\n\n<ol>\n    <li>The request must be either HTTP or HTTPS.<\/li>\n    <li>The HTTP method must be either POST or GET.<\/li>\n    <li>The content type is application\/x-www-form-urlencoded.<\/li>\n    <li>The servlet has called any method&nbsp;of the getParameter family on the request object.<\/li>\n<\/ol>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (13, '1, 2, and 3', 0);
INSERT INTO answer (question_id, variant, value) VALUES (13, '1, 2, and 4', 0);
INSERT INTO answer (question_id, variant, value) VALUES (13, '1, 3, and 4', 1);
INSERT INTO answer (question_id, variant, value) VALUES (13, 'All of these', 0);

--14
INSERT INTO question (question_id, title, lesson_test_id) VALUES (14, '<p>What is the output of the following Java code:<\/p>\n\n<pre class=\"prettyprint\"><code>class Add{\n\n   protected int addNumbers(int a, int b){\n    return a+b;\n   }\n}\n\nclass Test extends Add{\n   public static void main(String []aa)\n{\n    Test obj = new Test();\n    System.out.println(obj.addNumbers(11, 22));\n   }\n}<\/code><\/pre>\n\n<p>&nbsp;<\/p>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (14, 'addNumbers cannot be protected', 0);
INSERT INTO answer (question_id, variant, value) VALUES (14, 'Compilation error', 0);
INSERT INTO answer (question_id, variant, value) VALUES (14, 'Class Add cannot be inherited', 0);
INSERT INTO answer (question_id, variant, value) VALUES (14, '33', 1);

--15
INSERT INTO question (question_id, title, lesson_test_id) VALUES (15, '<p>Which of the following methods are included in the ServletConfig interface:<\/p>\n\n<ol>\n    <li>getInitParameter();<\/li>\n    <li>getParameterNames();<\/li>\n    <li>getServletContext();<\/li>\n    <li>getServletName();<\/li>\n<\/ol>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (15, '1 and 2', 0);
INSERT INTO answer (question_id, variant, value) VALUES (15, '1, 2, and 3', 0);
INSERT INTO answer (question_id, variant, value) VALUES (15, '1, 3, and 4', 1);
INSERT INTO answer (question_id, variant, value) VALUES (15, '2, 3, and 4', 0);

--16
INSERT INTO question (question_id, title, lesson_test_id) VALUES (16, '<p>In Java, what is the output of the following code:<\/p>\n\n<pre class=\"prettyprint\"><code>class A{\n    public int x;\n     private int y;\n\n    void cal(int a, int b){\n        x =  a + 1;\n        y =  b;\n    }        \n\n}    \n\nclass Begin {\n    public static void main(String []aa)\n    {\n        A obj = new A();   \n        obj.cal(2, 3);\n        System.out.println(obj.x + \" \" + obj.y);     \n    }\n}<\/code><\/pre>\n\n<p>&nbsp;<\/p>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (16, '3 3', 0);
INSERT INTO answer (question_id, variant, value) VALUES (16, '2 3', 0);
INSERT INTO answer (question_id, variant, value) VALUES (16, 'Compilation error', 1);
INSERT INTO answer (question_id, variant, value) VALUES (16, 'Run-time error', 0);

--17
INSERT INTO question (question_id, title, lesson_test_id) VALUES (17, '<p>In Java, which of these lines can cause an error in the following code:<\/p>\n\n<pre class=\"prettyprint\"><code>abstract class MyClass{\n       private void disp1() \/**Line A**\/\n{\n         System.out.println(\"Parent class\");\n       }\n       abstract public void disp2();\n       abstract  void disp3();\n       abstract protected void disp4();\n    }\n\n    class Demo extends MyClass{\n       \n         public void disp2() \n       {\n           System.out.println(\"1\");\n       }\n        void disp3() \/**Line B**\/\n        {\n             System.out.println(\"2\");\n        }\n        public void disp4() \/**Line C**\/\n        {\n             System.out.println(\"3\");\n        }\n       public static void main(String args[]){\n           Demo obj = new Demo();\n          \n       }\n    }<\/code><\/pre>\n\n<p>&nbsp;<\/p>\n\n<p>&nbsp;<\/p>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (17, 'Line A', 0);
INSERT INTO answer (question_id, variant, value) VALUES (17, 'Line B', 0);
INSERT INTO answer (question_id, variant, value) VALUES (17, 'Line C', 0);
INSERT INTO answer (question_id, variant, value) VALUES (17, 'No error', 1);

--18
INSERT INTO question (question_id, title, lesson_test_id) VALUES (18, 'p>What is the output of the following Java code:<\/p>\n\n<pre class=\"prettyprint\"><code>class Temp\n{   private int x=10;\n    protected int y=10;\n\nprotected Temp()\n{\nthis(5);\n}\nprivate Temp(int x)\n{\nthis(x, 15);\n\n}\nprotected Temp(int x, int y)\n{\nSystem.out.println(x * y);\n}\npublic static void main(String aa[])\n{\nnew Temp();\n}\n}<\/code><\/pre>\n\n<p>&nbsp;<\/p', 1);

INSERT INTO answer (question_id, variant, value) VALUES (18, '100', 0);
INSERT INTO answer (question_id, variant, value) VALUES (18, 'Compilation error', 0);
INSERT INTO answer (question_id, variant, value) VALUES (18, '75', 1);
INSERT INTO answer (question_id, variant, value) VALUES (18, 'Run-time error', 0);

--19
INSERT INTO question (question_id, title, lesson_test_id) VALUES (19, '<p>Which of the following statements are true:<\/p>\n\n<ol>\n    <li>An instance variable of type boolean defaults to false.<\/li>\n    <li>An instance variable of type boolean defaults to true.<\/li>\n    <li>An instance variable of type int defaults to 0.<\/li>\n    <li>An instance variable of type int defaults to null.<\/li>\n<\/ol>\n\n<p>&nbsp;<\/p>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (19, '1 and 3', 1);
INSERT INTO answer (question_id, variant, value) VALUES (19, '1 and 4', 0);
INSERT INTO answer (question_id, variant, value) VALUES (19, '2 and 3', 0);
INSERT INTO answer (question_id, variant, value) VALUES (19, '2 and 4', 0);

--20
INSERT INTO question (question_id, title, lesson_test_id) VALUES (20, '<p>In Java, which of the following is the use of an instance of <strong>DataInputStream<\/strong>?<\/p>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (20, 'Converts a binary stream into a character stream', 1);
INSERT INTO answer (question_id, variant, value) VALUES (20, 'Converts a character stream into a binary stream', 0);
INSERT INTO answer (question_id, variant, value) VALUES (20, 'Writes data into an output object', 0);
INSERT INTO answer (question_id, variant, value) VALUES (20, 'Converts a character stream into a buffer stream', 0);

--21
INSERT INTO question (question_id, title, lesson_test_id) VALUES (21, '<p>In Servlets, which of the following options is the correct structure for&nbsp;initializing the context parameter<em> <\/em>in&nbsp;the web.xml file?&nbsp;<\/p>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (21, '<web-app>\n    <context-param>\n        .....\n    <\/context-param>\n    <servlet>\n        .....\n    <\/servlet>\n<\/web-app>', 1);
INSERT INTO answer (question_id, variant, value) VALUES (21, '<web-app>\n    <servlet>\n        <context-param>\n        .....\n        <\/context-param>\n    <\/servlet>\n<\/web-app>', 0);
INSERT INTO answer (question_id, variant, value) VALUES (21, '<web-app>\n    <servlet>\n        <context>\n            <context-param>\n                .....\n            <\/context-param>\n        <\/context>\n    <\/servlet>\n<\/web-app>', 0);
INSERT INTO answer (question_id, variant, value) VALUES (21, '<web-app>\n    <context>\n        <servlet>\n            <context-param>\n                .....\n            <\/context-param>\n        <\/servlet>\n    <\/context>\n<\/web-app>', 0);

--22
INSERT INTO question (question_id, title, lesson_test_id) VALUES (22, '<p>In Java, what&nbsp;is the output of the following code:<\/p>\n\n<pre class=\"prettyprint\"><code>class MyOuterClass {\n       protected int x= 1;\n       private String st=\"Number\"; \n       private void innerInstance()\n       {\n           MyInnerClass inner = new MyInnerClass();\n           inner. seeOuter();\n       }\n       public static void main(String args[]){\n           MyOuterClass obj = new MyOuterClass();\n           obj.innerInstance();\n       }\n       \n      private class MyInnerClass {\n           private void seeOuter () {\n               protected int x=2;  \/ **Line A**\/\n\n              System.out.println(st+\" \"+x);   \/**Line B**\/\n           }\n       } \n}<\/code><\/pre>\n\n<p>&nbsp;<\/p>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (22, 'Error', 1);
INSERT INTO answer (question_id, variant, value) VALUES (22, 'Number  1', 0);
INSERT INTO answer (question_id, variant, value) VALUES (22, 'Number  2', 0);
INSERT INTO answer (question_id, variant, value) VALUES (22, 'No output', 0);

--23
INSERT INTO question (question_id, title, lesson_test_id) VALUES (23, '<p>In&nbsp;Java, which of these lines can cause an error in the following code:<\/p>\n\n<pre class=\"prettyprint\"><code>public class Main \/**Line A**\/\n{\n    int a=9;int b=9;\n            \n    private int add() \/**Line B**\/\n    {\n        return a+b;\n    }\n    int result() \n    {\n        return new Main().add();\n    }\n}\n\npublic class Examp3  \n{\n    \n    public static void main(String []aa)\n    {\n        Main e=new Main();\n        System.out.println(2*e.result()); \/**Line C**\/\n        \n    }\n}\n<\/code><\/pre>\n\n<p>&nbsp;<\/p>\n\n<p>&nbsp;<\/p>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (23, 'Line A', 1);
INSERT INTO answer (question_id, variant, value) VALUES (23, 'Line B', 0);
INSERT INTO answer (question_id, variant, value) VALUES (23, 'Line C', 0);
INSERT INTO answer (question_id, variant, value) VALUES (23, 'No error: Output is 36', 0);

--24
INSERT INTO question (question_id, title, lesson_test_id) VALUES (24, '<p>What is the output of the following Java code:&nbsp;<\/p>\n\n<pre class=\"prettyprint\"><code>import java.util.*;\npublic class Program    \n{\npublic static void main(String[] args)\n{\n    List&lt;Integer&gt; numbers = Arrays.asList(1, 2, 3);\n    numbers.stream().map(Program::divideByZero).forEach(System.out::println);\n}\n\npublic static int divideByZero(int n)\n{\n    return n \/ 0;\n}\n}<\/code><\/pre>\n\n<p>&nbsp;<\/p>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (24, '0', 0);
INSERT INTO answer (question_id, variant, value) VALUES (24, 'Compilation error', 0);
INSERT INTO answer (question_id, variant, value) VALUES (24, 'Exception: java.lang.nullpointerexception', 0);
INSERT INTO answer (question_id, variant, value) VALUES (24, 'Exception: java.lang.ArithmeticException: \/ by zero', 1);

--25
INSERT INTO question (question_id, title, lesson_test_id) VALUES (25, '<p>In IntelliJ IDEA, which of the following statements about the benefits of VisualVM tool for profiling of a Java application is correct:<br>\n<br>\n1. VisualVM tool integrates JDK tools and provides you efficient profiling capabilities.<br>\n2. VisualVM tool analyzes memory allocations to different applications.<br>\n3. VisualVM tool cannot monitor application threads.<br>\n&nbsp;<\/p>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (25, '1 and 2', 1);
INSERT INTO answer (question_id, variant, value) VALUES (25, '1 and 3', 0);
INSERT INTO answer (question_id, variant, value) VALUES (25, 'All of these', 0);
INSERT INTO answer (question_id, variant, value) VALUES (25, 'None of these', 0);

--26
INSERT INTO question (question_id, title, lesson_test_id) VALUES (26, '<p>What is the output of the following Java code:&nbsp;<\/p>\n\n<pre class=\"prettyprint\"><code>import java.util.Collections;\nimport java.util.LinkedList;\n\npublic class Replace {\n\n    public static void main(String a[]){\n        \n        LinkedList&lt;String&gt; list = new LinkedList&lt;String&gt;();\n        list.add(\"Java\");\n        list.add(\"is\");\n        list.add(\"multithreaded\");\n        list.add(\"and\");\n        list.add(\"Platform\");\n        list.add(\"Independent\");\n        \n        Collections.swap(list, 2, 6);\n        for(String str: list){\n            System.out.print(\" \"+str);\n        }\n    }\n}<\/code><\/pre>\n\n<p>&nbsp;<\/p>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (26, 'Java independent multithreaded and platform is', 0);
INSERT INTO answer (question_id, variant, value) VALUES (26, 'Java is and Platform Independent', 0);
INSERT INTO answer (question_id, variant, value) VALUES (26, 'Java is null and Platform Independent', 0);
INSERT INTO answer (question_id, variant, value) VALUES (26, 'Runtime Error - IndexOutOfBoundsException', 1);

--27
INSERT INTO question (question_id, title, lesson_test_id) VALUES (27, '<p>Which of these is the correct order in which the major tasks performed by a servlet is executed?<\/p>\n\n<ol>\n    <li>Read the implicit HTTP request data sent by various clients (browsers).<\/li>\n    <li>Process the data and generate&nbsp;results.<\/li>\n    <li>Read the explicit data sent by clients (browsers).<\/li>\n    <li>Send the explicit data (i.e., the document) to the clients (browsers).<\/li>\n    <li>Send the implicit HTTP response to the clients (browsers).<\/li>\n<\/ol>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (27, '3, 1, 2, 4, 5', 1);
INSERT INTO answer (question_id, variant, value) VALUES (27, '1, 3, 2, 4, 5', 0);
INSERT INTO answer (question_id, variant, value) VALUES (27, '1, 3, 2, 5, 4', 0);
INSERT INTO answer (question_id, variant, value) VALUES (27, '3, 1, 2, 5, 4', 0);

--28
INSERT INTO question (question_id, title, lesson_test_id) VALUES (28, '<p>In IntelliJ IDEA, which of the following steps is used to create a temporary configuration:<br>\n<br>\n1. Create a Java class<br>\n2. Click the name of the class and Run option<br>\n3. After the first Run, the temporary configuration is added to the menu<br>\n4. To save the created configuration as a permanent configuration, configure it with IntelliJ<br>\n&nbsp;<\/p>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (28, '1 and 2', 0);
INSERT INTO answer (question_id, variant, value) VALUES (28, '3 and 4', 0);
INSERT INTO answer (question_id, variant, value) VALUES (28, 'All of these', 1);
INSERT INTO answer (question_id, variant, value) VALUES (28, 'None of these', 0);

--29
INSERT INTO question (question_id, title, lesson_test_id) VALUES (29, '<p>In Java, which of these lines can cause an error in the following code:<\/p>\n\n<pre class=\"prettyprint\"><code>package Practi;\npublic class Examp10 {\n\n    protected int a;\n    public int b;\n    int c;\n    protected int d;\n    \n    public Examp10()\n    {\n        a=10;\n        b=15;\n        c=10;d=10;\n    }\n\n    public void sum3()\n    {\n        System.out.println(a+b+c+d); \/**Line A**\/\n    }\n}\npackage Doprctice;\nimport Practi.Examp10;\n\npublic class Examp10con extends Examp10{\n  Examp10con(){}\n     public void sum3()\n    {\n        System.out.println(a+b+c+d); \/**Line B**\/\n    }\n     public static void main(String []aa)\n     {\n         Examp10con e=new Examp10con(); \n          e.sum3();  \/**Line C**\/\n             \n }\n}\n\n<\/code><\/pre>\n\n<p>&nbsp;<\/p>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (29, 'Line A', 0);
INSERT INTO answer (question_id, variant, value) VALUES (29, 'Line B', 1);
INSERT INTO answer (question_id, variant, value) VALUES (29, 'Line C', 0);
INSERT INTO answer (question_id, variant, value) VALUES (29, 'No error', 0);

--30
INSERT INTO question (question_id, title, lesson_test_id) VALUES (30, '<p>Which of&nbsp;the following exceptions is generated when an attempt is made to create an object of an abstract class or interface in Java?<\/p>\n\n<p>&nbsp;<\/p>', 1);

INSERT INTO answer (question_id, variant, value) VALUES (30, 'InstantiateException', 0);
INSERT INTO answer (question_id, variant, value) VALUES (30, 'InstantiationException', 1);
INSERT INTO answer (question_id, variant, value) VALUES (30, 'IllegalAccessException', 0);
INSERT INTO answer (question_id, variant, value) VALUES (30, 'UnsupportedOperationException', 0);





