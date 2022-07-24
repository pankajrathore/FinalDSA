package Str;

public class IntToStr {
    public static void main(String[] args) {
        //System.out.println(convertIntToStr(-103));

        // Process each character of the string;
        String str="123";
        int i = 0;
        int num = 0;
        while( i < str.length()) {
            num *= 10;
            System.out.println("i="+i+" num="+num);

            num += str.charAt(i++) - '0'; // Minus the ASCII code of '0' to get the value of the charAt(i++).
            System.out.println("i="+i+" num="+num);

        }

        System.out.println(num);
    }

    static String convertIntToStr(int a)
    {
        boolean isNeg=false;
        if(a<0)
            isNeg=true;
        int remain=0;
        a=Math.abs(a);
        StringBuilder sb=new StringBuilder();
        while(a>0)
        {
            remain=a%10;
            a=a/10;
            char ch=(char) ('0'+remain);
            sb.append(ch);
        }

        String retString=sb.reverse().toString();
        if(isNeg)
            return "-"+retString;
        else
            return retString;
    }
}
