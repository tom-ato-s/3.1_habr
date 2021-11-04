//https://habr.com/ru/post/440436/
//        Практические задачи по Java

//3.1. Найти корень уравнения
//
//        Задача:
//
//        Найдите корень уравнения
//
//        $cos(x^5) + x^4 - 345.3 * x - 23 = 0$
//        на отрезке [0; 10] с точностью по x не хуже, чем 0.001. Известно, что на этом промежутке корень единственный.
//        Используйте для этого метод деления отрезка пополам (и рекурсию).





public class FuntionNew {


    public static double funtion(double start, double end) {
        if(end-start<= 0.001)
            return start;
        double x = start+(end-start)/2;
        if(calk(start)*calk(x)>0) {
            return funtion(x, end);
        } else
            return funtion(start, x);
    }
  public static double calk(double x) {
        double result = Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) -345.3*x -23;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(funtion(0, 10));
    }
}
