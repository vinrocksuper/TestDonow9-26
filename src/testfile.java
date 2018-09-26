public class testfile {
    public static void main(String [] args)
    {
        loveJava("LoveJava");
    }
    public static void loveJava(String str)
    {
        while(str.length()>0)
        {
            System.out.println(str);
            str = str.substring(1,str.length()-1);
        }
        String str2 = "what?";
        for(int i=0;i<str2.length();i++)
        {
            System.out.println(str2);
            str2 = str2.substring(str2.length()-1) + str2.substring(0,str2.length()-1);
        }
    }

}
