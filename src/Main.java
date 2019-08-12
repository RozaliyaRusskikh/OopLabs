import OOP.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Triangle instance1 = new Triangle(3, 4, 5);
        Triangle instance2 = new Triangle(6, 4, 5);

       /* Triangle triangle1 = new Triangle(10,5,5);
        System.out.println(triangle1.getA());
       */

        instance1.printFigure("instance1");
        System.out.println("Size of instance 1 is " + instance1.getSize());
        instance1.setSize(Size.SMALL); // проверка работы enum для разных классов
        System.out.println("Size of instance 1 after setting is " + instance1.getSize());
        instance1.showPerimeter("instance1");
        instance1.showSquare("instance1");
        instance1.setA(-1); // проверка работы свойства set
        System.out.println("Triangle instance1 exist: " + instance1.getExist()); // проверка свойства getExist
        instance2.printFigure("instance2");
        instance2.showPerimeter("instance2");
        if (instance1.equals(instance2)) {   // проверка работы переопределенного метода equals
            System.out.println("are equal");
        } else {
            System.out.println("are not equal");
        }
        System.out.println(instance1.hashCode());// проверка работы переопределенного метода hashCode
        System.out.println(instance2.hashCode());
        System.out.println(" ");

        Rectangle instance3 = new Rectangle(2, 3);
        Rectangle instance4 = new Rectangle(555, 555); // проверка ваидации в конструкторе
        System.out.println("Size of instance 3 is " + instance3.getSize());
        instance3.setSize(Size.BIG); // проверка работы enum для разных классов
        System.out.println("Size of instance 3 after setting is " + instance3.getSize());
        instance3.printFigure("instance3");
        if (instance3.equals(instance4)) {   // проверка работы переопределенного метода equals
            System.out.println("are equal");
        } else {
            System.out.println("are not equal");
        }
        System.out.println(instance3.hashCode());// проверка работы переопределенного метода hashCode
        System.out.println(instance4.hashCode());
        System.out.print("\n");

        Square instanceSquare1 = new Square(333);
        System.out.println("Size of instanceSquare is " + instanceSquare1.getSize());
        instanceSquare1.setSize(Size.VERY_BIG); // проверка работы enum для разных классов
        System.out.println("Size of instanceSquare after setting is " + instanceSquare1.getSize());
        instanceSquare1.showPerimeter("instanceSquare");
        instanceSquare1.showSquare("instanceSquare");
        instanceSquare1.printFigure("instanceSquare");
        Square instanceSquare2 = new Square(330);
        if (instanceSquare2.equals(instanceSquare1)) {   // проверка работы переопределенного метода equals
            System.out.println("are equal");
        } else {
            System.out.println("are not equal");
        }
        System.out.println(instanceSquare2.hashCode());// проверка работы переопределенного метода hashCode
        System.out.println(instanceSquare2.hashCode());
        System.out.println(" ");

        //region Geometric figure class array with objects of different classes
        {
            GeometricFigure figureArray[] = new GeometricFigure[4];
            figureArray[0] = instance1;
            figureArray[1] = instance2;
            figureArray[2] = instance3;
            figureArray[3] = instanceSquare1;
            for (GeometricFigure item : figureArray) System.out.println(item);
        }
        //endregion
        System.out.println("Java collections:");
        //region ArrayList
        ArrayList<Triangle> trianglesArrayList = new ArrayList<>(); // создание ArrayList (доступ по индексу, добавление в конец)
        // добавим в список ряд элементов
        trianglesArrayList.add(instance1);
        trianglesArrayList.add(1, instance2); // добавляем элемент по индексу 1
        System.out.println(trianglesArrayList.get(1));// получаем 2-й объект
        trianglesArrayList.set(1, instance1); // установка нового значения для 2-го объекта
        System.out.printf("ArrayList has %d elements \n", trianglesArrayList.size());
        for (Triangle triangle : trianglesArrayList) {

            System.out.println(triangle);
        }
        if (trianglesArrayList.contains(instance2)) {  // проверяем наличие элемента

            System.out.println("ArrayList contains instance2");
        } else {
            System.out.println("ArrayList does not contain instance2");
        }

        trianglesArrayList.remove(instance1); // удаление
        for (Triangle triangle : trianglesArrayList) {

            System.out.println(triangle);
        }
        System.out.println(" ");
        //endregion
        //region LinkedList
        LinkedList<Rectangle> rectanglesLinkedList = new LinkedList<>(); // создание LinkedList
        rectanglesLinkedList.addFirst(instance3);
        rectanglesLinkedList.addLast(instance4);
        //Я что -то сломал((
        //for (Rectangle rectangle : rectangles) System.out.println(rectangle);
        // вывод на экран с помощью итератора
        Iterator<Rectangle> iterator = rectanglesLinkedList.iterator();
        while ((iterator.hasNext())) {
            System.out.println(iterator.next());
        }
        System.out.println(" ");
        //endregion
        //region Stack
        Stack<Rectangle> rectanglesStack = new Stack<>(); // создание объекта
        rectanglesStack.push(instance3); // помещение объектов в стек
        rectanglesStack.push(instance4);
        rectanglesStack.push(new Rectangle(6, 7));
        System.out.println("Last object is " + rectanglesStack.peek()); // достаем объект
        System.out.println("Position - " + rectanglesStack.search(instance3));
        while (!rectanglesStack.empty()) {
            System.out.println(rectanglesStack.pop()); // метод pop достает и удаляет объект из стека
        }
        System.out.println(rectanglesStack.empty()); // проверка, пустой ли стек
        try { // обработка ошибок в случае если стек пустой
            System.out.println(rectanglesStack.peek());
        } catch (EmptyStackException e) {
            System.out.println("Empty stack");
        }
        System.out.println(" ");
        //endregion
        //region Queue
        Queue<Rectangle> rectangleQueue = new PriorityQueue<>();
        rectangleQueue.offer(instance3);
        rectangleQueue.offer(instance4);
        rectangleQueue.offer(new Rectangle(1, 11111));
        rectangleQueue.offer(new Rectangle(100, 100));
        System.out.println("Size of queue-" + rectangleQueue.size());
        System.out.println(rectangleQueue.poll());
        System.out.println(rectangleQueue.poll());
        System.out.println(rectangleQueue.poll());
        System.out.println(rectangleQueue.poll());
        System.out.println(rectangleQueue.poll()); // пустая очередь
        System.out.println(" ");
        //endregion
        System.out.println("Java interfaces:");
        //region IComparable
        if (instance1.compareTo(instance2) > 0) { // проверка работы интерфейса IComparable
            System.out.println("Side A = " + instance1.getA() + " of instance1 is bigger.");
        } else if (instance1.compareTo(instance2) < 0) {
            System.out.println("Side A = " + instance2.getA() + " of instance2 is bigger.");
        } else {
            System.out.println("Sides A are equal");
        }

        System.out.println(" ");
        if (instance3.compareTo(instance4) > 0) { // проверка работы интерфейса IComparable
            System.out.println("Side A = " + instance3.getA() + " of instance3 is bigger.");
        } else if (instance3.compareTo(instance4) < 0) {
            System.out.println("Side A = " + instance4.getA() + " of instance4 is bigger.");
        } else {
            System.out.println("Sides A are equal");
        }
        System.out.println(" ");
        //endregion
        //region IClonable
        // реализация интерфейса ICloneable
        try {
            Triangle clone = (Triangle) instance1.clone();
            System.out.println("Original object: " + instance1);
            System.out.println("Clone object: " + clone);
            clone.setA(999);
            clone.setB(999);
            clone.setC(999);
            System.out.println("Original object: " + instance1); // при изменеии клона оригинал не меняется
            System.out.println("Clone object: " + clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //endregion
    }
}


