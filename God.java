public class God{
    private static God goodGod;
    private God(){
        System.out.println("Constructor: Creating Good GOD");
    }
    public static God getGod(){
        if(goodGod==null){
            System.out.println("GetGod():Created Good GOD");
            goodGod=new God();
             
        }
         System.out.println("GetGod(): Returning God");
        return goodGod;
    }

    public static void main(String[] ar){
        God allah=God.getGod();
        God jesus=God.getGod();
        God saraswathi=God.getGod();
    }
}