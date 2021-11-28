package hw10;////tyseryw

public class NumBox<T> {

    private final T[] number;

    public NumBox () {
        Object size;
        number=(T[]) new Number(size) {
            @Override
            public int intValue () {
                return 0;
            }

            @Override
            public long longValue () {
                return 0;
            }

            @Override
            public float floatValue () {
                return 0;
            }

            @Override
            public double doubleValue () {
                return 0;
            }
        };
    }


    public NumBox (T[] number) {
        this.number = number;
    }

    public double sum () {
    double sum = 0.0;
    for ( T i:number ){
        if(i != null){
            sum+=0;
        } else sum+=i.doubleValue();
        return sum;
    }
    }

    protected void add (T aDouble) {
    }

    protected T average () {
        double average=sum/index;
        return average;
    }

    protected int length () {
        int index =0;
        for(T n:number){
        if(n ==null){
        break;
        }
            index++;
            if(index==number.length){
                System.out.println("Massive if full");
            }
            break;
        }
        return index;

    }

    protected T max () {
        T maX = number[0];
        for(int i = 0; i < number.length; i++){
            if(number[i].doubleValue() > maX.doubleValue()) {
                maX = number[i];
            }
        }
        return maX;
    }

    protected T get (int index) {
    }
}
