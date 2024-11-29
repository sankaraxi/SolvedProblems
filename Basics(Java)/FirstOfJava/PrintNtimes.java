package FirstOfJava;

public class PrintNtimes {
    public static void main(String[] args) {
        String str = "sanzxcw4y6f5kaa2b3c";
        System.out.println(printNtimes(str));
    }

    public static String printNtimes(String str) {

        char[] strArr = str.toCharArray();
        String result = "";

        int i = 0;
        while (i < strArr.length){
            char ch = strArr[i];
            if(i+1 < strArr.length && Character.isDigit(strArr[i+1]) ){
                int times = strArr[i+1] - '0';
                for (int j = 0; j < times; j++) {
                    result += ch;
                }
                i += 2;
            }else {
                result +=ch;
                i++;
            }

        }

        return result;
    }
}

