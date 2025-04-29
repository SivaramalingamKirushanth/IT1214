class ExceptionDemo{
    public static void main(String[] args){
        System.out.println("HI");
        
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        try{
            System.out.println("a ="+a+" , b ="+b);
            System.out.println("a/b is "+ a/b);
        }catch(Exception e){
            System.out.println("Divide by 0 ");
        }
        
        System.out.println("Done!");
        


    }
}
