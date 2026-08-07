public class God{
    private static God godName;
    private God(){
        System.out.println("Constructor: Creating GOD");
    }
    public static God getGod(){
        if(godName==null){
            System.out.println("GetGod():Created GOD");
            godName=new God();
             
        }
         System.out.println("GetGod(): Returning God");
        return godName;
    }

    public static void main(String[] ar){
        God allah=God.getGod();
        God jesus=God.getGod();
        God saraswathi=God.getGod();
    }
}
