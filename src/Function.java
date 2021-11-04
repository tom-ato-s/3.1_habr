//public class Function {
////    static int n= 100; // количество элементов в массиве.
////    static int up = 10; // граница верхняя
////    static int doune = 0; // граница нижняя
//        static double begin = 0;
//        static double end = 10;
//        double step = 0.001;
//    double scalar = Math.pow(10, 3);
//
//    public double function( double begin, double end ) {
//        return funtionIn( begin, end); }
//
//    private double funtionIn(double begin, double end) {
//         double midle = (begin+end)/2;
//
//         midle = Math.ceil(midle*scalar)/scalar;
//        if (calkFunsion(begin)==0) return begin;
//        if (calkFunsion(end) == 0) return end;
//        if(end<begin) return -1;
//
//           if(calkFunsion(midle) == 0) return midle;
//              else {
//
//               funtionIn(begin, midle-step);
//               double beg = begin;
//               double mid = midle;
//               double en = end;
//               funtionIn(mid+step, en);
//    }
//        System.out.println(midle);
//    }
//
//
//double calkFunsion(double x) {
//    double result = Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) -345.3*x -23;
//   result = Math.ceil(result*scalar)/scalar;
//    System.out.println(result);
//     return result;
//}
//
//
//// public static double[] random(int n) {
////     double[] arr = new double[n];
////     double scalar = Math.pow(10, 3);
////     for(int i = 0; i<n; i++){
////         double rd = doune + (double) ((up - doune)*Math.random());
////         arr[i] = Math.ceil(rd*scalar)/scalar;
////  //       System.out.println(arr[i]);
////     }
////     return arr;
//// }
//
//    public static void main(String[] args) {
//
//        Function function = new Function();
//        function.calkFunsion(5);
//        function.function(begin, end);
//    }
//
//}
