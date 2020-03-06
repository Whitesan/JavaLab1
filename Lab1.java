public class Lab1 {
    public static void main(String[] args) {

        if (args.length != 3) {
            throw new IllegalArgumentException("Exactly 3 parameters required !");
        }
        double root1,root2;

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        double d = (b*b)-(4*a*c);
        double sqrt = Math.sqrt(d);
        if(d>0){
            root1 = (-b + sqrt)/(2*a);
            root2 = (-b - sqrt)/(2*a);
            System.out.println("Roots are : "+ root1 +" and "+root2);
        }else if(d == 0){
            System.out.println("Root is : "+(-b + sqrt)/(2*a));
        }
        else
            System.out.println("No roots");
    }

}
