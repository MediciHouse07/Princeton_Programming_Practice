public class RightTriangle {
    public static void main(String[] args){
        int factor1 = Integer.parseInt(args[0]);
        int factor2 = Integer.parseInt(args[1]);
        int factor3 = Integer.parseInt(args[2]);

        if ((factor1<=0) || (factor2<=0) || (factor3<=0) ){
            System.out.println("false");
        } else {
            if (((factor1*factor1 + factor2*factor2) == factor3 * factor3)
            || ((factor1*factor1 + factor3*factor3) == factor2 * factor2)
            || ((factor3*factor3 + factor2*factor2) == factor1 * factor1)){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
