public class ExceptionH {
    public static void main(String[] args) {
        System.out.println("start to main");

//        try{
//            int i =10;
//            int j = 0;
//            int result = i/j;
//            System.out.println(result);
//        }catch (ArithmeticException es){
////            System.out.println(es);
//            System.out.println(es.getMessage());
//            es.printStackTrace();
//        }


//        try{
//            String a = "122";
//            String b = "0";
//            int num1 = Integer.parseInt(a);
//            int num2 = Integer.parseInt(b);
//
//            int z = num1/num2;
//            Pen p = null;
//            if(z>5){
//                p = new Pen();
//            }
//
//            p.write();
//        }
//        catch (NumberFormatException nFE){
//            System.out.println("NumberFormatException-- "+nFE);
//        }
//        catch (ArithmeticException aE){
//            System.out.println("ArithmeticException-- "+aE);
//
//        }
//        catch (NullPointerException nP){
//            System.out.println("NullPointerException-- "+nP);
//        }

        try {
            String a = "122 ";
            String b = "10";
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);

            int z = num1 / num2;
            Pen p = null;
            if (z > 5) {
                p = new Pen();
            }

            p.write();
        }
        catch (java.lang.Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }

    }
}
