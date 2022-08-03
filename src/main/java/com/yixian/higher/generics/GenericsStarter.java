package com.yixian.higher.generics;

import com.yixian.ILoggerAble;
import com.yixian.higher.generics.base.*;
import org.junit.Test;

import java.util.*;

/**
 * @author : zhang_hj
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 泛型入门
 * @create : 2022-07-10 19:44
 * <p>
 * 1 理解 : 泛型化参数，编译时检查元素的类型，运行时擦除。减少了类型转换的次数。表示数据类型
 * 数据类型。参见{@link GenericsStarter#useGenerics()}
 * 2 作用 : 在类声明时通过一个标识表示类中某个属性的类型，
 * 或者是某个方法的参数类型/返回值类型。参见{@link Person}
 * 3 语法 : 参见{@link Person}与{@link IUsb<U,R>}接口中泛型的使用。
 * 4 自定义泛型 :参见{@link Person}
 * 5 泛型继承和通配符 :
 * 6 泛型的使用 : 参见{@link GenericsStarter#exerciseSetTest()}、
 * {@link GenericsStarter#exerciseMapTest()}、
 * {@link GenericsStarter#personTest()}
 * <p>
 * 7 使用细节 :
 * (1) 使用泛型时，必须是引用类型，指定具体类型后，只能传入该类型或者其子类类型
 * （隐含向上转型），若不写，则默认{@link Object}
 * 参见{@link GenericsStarter#useGenericsDetailTest()}、
 * {@link GenericsStarter#useGenericsDetailOne()} 、
 * {@link GenericsStarter#useGenericsDetailTwo()} 。
 * 8 泛型继承和通配 :
 * (1) 泛型继承 : 泛型不具备继承型。参见{@link GenericsStarter#extendsTest()}
 * (2) 通配 :
 * ? : 支持任意泛型,参见{@link GenericsStarter#useQuestionTest}
 * <? extends A> : 支持A类以及A的子类，规定了泛型上限，
 * 参见{@link GenericsStarter#useTopTest()}
 * <? extends A> : 支持A类以及A的父类，不限于直接父类, 规定了泛型下限，
 * 参见{@link GenericsStarter#useGroundTest()}。
 */
@SuppressWarnings("all")
public class GenericsStarter implements ILoggerAble {


    static {
        ILoggerAble.start("泛型入门学习");
    }

    /**
     * 使用泛型和未使用泛型的区别。
     */
    @Test
    public void starterTest() {
        nonUseGenerics();
        useGenerics();
    }

    /**
     * 不使用泛型之{@link List}
     */
    private void nonUseGenerics() {
        List dogs = new ArrayList<>();
        dogs.add(new Dog("旺财", 12, "蓝色"));
        dogs.add(new Dog("拉布拉多", 2, "紫色"));
        for (Object dog : dogs) {
            if (dog == null && !(dog instanceof Dog)) continue;
            LOGGER.info(((Dog) dog).print());
        }
    }

    /**
     * 使用泛型之{@link List<E>}
     */
    private void useGenerics() {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("旺财", 12, "蓝色"));
        dogs.add(new Dog("拉布拉多", 2, "紫色"));
        for (Dog dog : dogs) {
            if (dog == null) continue;
            LOGGER.info(((Dog) dog).print());
        }
    }

    /**
     * 自定义泛型的使用之{@link Person}
     */
    @Test
    public void personTest() {
        Person<String, String, String> person =
                new Person<>("left", "middle", "right");
        LOGGER.info(person.toString());
        LOGGER.info(person.getShow(new Object()).toString());
        LOGGER.info(person.getMiddle());
        Integer instances = Person.getInstances(new Integer(23));
        LOGGER.info(String.valueOf(instances));
    }

    /**
     * 泛型使用之{@link Set<E>}
     */
    @Test
    public void exerciseSetTest() {
        Set<Student> students = new HashSet<>();
        students.add(new Student("zhangsan", (short) 12));
        students.add(new Student("lisi", (short) 12));
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student == null) continue;
            LOGGER.info(student.toString());
        }
    }

    /**
     * 泛型使用之{@link Set<E>}
     */
    @Test
    public void exerciseSetTestByFor() {
        Set<Student> students = new HashSet<>();
        students.add(new Student("zhangsan", (short) 12));
        students.add(new Student("lisi", (short) 12));
        Iterator<Student> iterator = students.iterator();
        for (Student student : students) {
            LOGGER.info(student.toString());
        }
    }

    /**
     * 泛型使用之{@link Map<K,V>}
     */
    @Test
    public void exerciseMapTest() {
        Map<String, Student> students = new HashMap<>();
        students.put("zhangsan", new Student("zhangsan", (short) 12));
        students.put("lisi", new Student("lisi", (short) 12));
        Set<Map.Entry<String, Student>> entries = students.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next = iterator.next();
            if (next == null) {
                continue;
            }
            StringBuffer sb = new StringBuffer();
            sb.append("key = ");
            sb.append(next.getKey());
            sb.append(", value = ");
            sb.append(next.getValue());
            LOGGER.info(sb.toString());
        }
    }

    /**
     * 泛型使用之细节。
     */
    @Test
    public void useGenericsDetailTest() {
        List<Number> integers = new ArrayList<>(12);
        // List<int> ints = new ArrayList<>();
    }

    /**
     * 泛型使用之细节。
     */
    @Test
    public void useGenericsDetailOne() {
        List<Number> integers = new ArrayList<>(12);
        integers.add(89.0);
        integers.add(13);
        for (Number number : integers) {
            LOGGER.info("类型为 ：" + number.getClass().getTypeName() +
                    ", 值为 ：" + String.valueOf(number));
        }
    }

    /**
     * 泛型使用之细节。无指定，默认{@link Object}
     */
    @Test
    public void useGenericsDetailTwo() {
        List integers = new ArrayList<>(12);
        integers.add(89.0);
        integers.add(13);
        integers.add("4567");
        for (Object number : integers) {
            LOGGER.info("类型为：" + number.getClass().getTypeName() +
                    ", 值为：" + String.valueOf(number));
        }
    }

    /**
     * 使用{@link List<Employee>#sort(Comparator)}
     */
    @Test
    public void employeeTest() {
        List<Employee> employees = new ArrayList<>(3);
        employees.add(new Employee("xiaoming", 230000,
                new MyDate(2022, (byte) 12, (byte) 23)));
        employees.add(new Employee("xiaoli", 140000,
                new MyDate(2022, (byte) 12, (byte) 23)));
        employees.add(new Employee("xiaoming", 230000,
                new MyDate(2022, (byte) 12, (byte) 24)));
        employees.add(new Employee("xiaoli", 140000,
                new MyDate(2022, (byte) 12, (byte) 24)));
        employees.stream().forEach(employee ->
                LOGGER.info("类型为 ：" + employee.toString())
        );

        LOGGER.info("=*********************** 排序后 ************************=");
        employees.sort((o1, o2) -> {
            if (!(o1 instanceof Employee) || !(o2 instanceof Employee)) {
                return 0;
            }
            if ((o1.getName() == null) || (o1.getName() == null)) {
                return 0;
            }
            // 先比较name
            int resTemp = o1.getName().compareTo(o2.getName());
            if (resTemp != 0) {
                return resTemp;
            }
            if ((o1.getBirthday() == null) || (o1.getBirthday() == null)) {
                return 0;
            }
            return o1.getBirthday().compareTo(o2.getBirthday());
        });
        employees.stream().forEach(employee ->
                LOGGER.info("类型为 ：" + employee.toString())
        );
    }

    @Test
    public void extendsTest() {
//        List<Object> collections = new ArrayList<String>();
    }

    /**
     * ? : 支持任意泛型 学习
     */
    @Test
    public void useQuestionTest() {
        List<Integer> lists = new ArrayList<>();
        lists.add(234);
        lists.add(234);
        lists.add(234);
        printCollection(lists);
    }

    /**
     * <? extends A> : 支持A类以及A的子类，规定了泛型上限 学习
     */
    @Test
    public void useTopTest() {
        List<Base> listBase = new ArrayList<>();
        listBase.add(new Base());
        printCollectionTop(listBase);

        List<Sub> listSub = new ArrayList<>();
        listSub.add(new Sub());
        printCollectionTop(listSub);

        List<Grandson> listGrandson = new ArrayList<>();
        listGrandson.add(new Grandson());
        printCollectionTop(listGrandson);

//        List<Object> listObject = new ArrayList<>();
//        listObject.add(new Object());
//        printCollectionTop(listObject);
    }

    /**
     * <? extends A> : 支持A类以及A的父类，不限于直接父类, 规定了泛型下限 学习
     */
    @Test
    public void useGroundTest() {
        List<Base> listBase = new ArrayList<>();
        listBase.add(new Base());
        printCollectionGround(listBase);

        List<Sub> listSub = new ArrayList<>();
        listSub.add(new Sub());
        printCollectionGround(listSub);

//        List<Grandson> listGrandson = new ArrayList<>();
//        listGrandson.add(new Grandson());
//        printCollectionGround(listGrandson);

        List<Object> listObject = new ArrayList<>();
        listObject.add(new Object());
        printCollectionGround(listObject);
    }


    public static void printCollection(List<?> lists) {
        lists.stream().forEach(employee ->
                LOGGER.info("类型为 ：" + employee.getClass().getSimpleName() +
                        ",值为 ：" + employee.toString())
        );
    }

    public static void printCollectionTop(List<? extends Base> lists) {
        lists.stream().forEach(employee ->
                LOGGER.info("类型为 ：" + employee.getClass().getSimpleName() +
                        ",值为 ：" + employee.toString())
        );
    }

    public static void printCollectionGround(List<? super Sub> lists) {
        lists.stream().forEach(employee ->
                LOGGER.info("类型为 ：" + employee.getClass().getSimpleName() +
                        ",值为 ：" + employee.toString())
        );
    }

    // --------------------------------- 练习1 ---------------------------------

    /**
     * 练习一
     */
    @Test
    public void exercise1Test() {
        Dao<Student> studentDao = new Dao<>();
        studentDao.save("00001",
                new Student("00001", "小王", (short) 23));
        studentDao.save("00002",
                new Student("00002", "小李", (short) 24));
        studentDao.save("00003",
                new Student("00003", "小孙", (short) 25));
        LOGGER.info("练习一初始化完成,开始打印执行结果");
        studentDao.printData();
        Collection<Student> list = studentDao.list();
        for (Student student : list) {
            LOGGER.info(student.toString());
        }
        studentDao.update("00001", new Student("00001", "小王八", (short) 23));
        studentDao.printData();
        studentDao.remove("00001");
        LOGGER.info("---删除编号为00001----");
        studentDao.printData();
    }

    @Test
    public void test() {
        List<Number> numbers = new ArrayList<>();
        numbers.add(234);
        List<Integer> integers = new ArrayList<>();
        integers.add(234);
        numbers.addAll(integers);
    }
}
