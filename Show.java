package hw10;
////uyw4yy
public class Show extends NumBox{

    protected Show (int size) {
        super();
    }

    public static void main (NumBox<?> box){

        NumBox<Double> numBox = new NumBox<>();
        numBox.add(new Double(2.3));
        numBox.add(new Double(4.3));
        numBox.add(new Double(6.3));////
        numBox.add(new Double(8.3));
        numBox.add(new Double(10.3));/



        System.out.println(box);
        System.out.println("Сумма: "+box.sum());
        System.out.println("Размер "+box.length());
        System.out.println("Среднее значение " +box.average());
        int index = 5; //(int) (Math.random()*box.length());
        System.out.println("Значение елемента "+(index+1)+" равно "+box.get(index));
        System.out.println("Максимум "+box.max());
    }
}
