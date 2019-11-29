public class Calculator{
    public static void main(String args[]){
    int result=0;
    switch(args[0]){
        case"+":result=Integer.parseInt(args[1])+Integer.parseInt(args[2]);
               break;
         case "-":result=Integer.parseInt(args[1])-Integer.parseInt(args[2]);
               break;
         case "*":result=(Integer.parseInt(args[1]))*(Integer.parseInt(args[2]));

               break;
         case "/":result=Integer.parseInt(args[1])/Integer.parseInt(args[2]);

               break;
     }
     System.out.println("result: "+result);

     }

}
