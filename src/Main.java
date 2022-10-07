
public class Main {
    public static void main(String[] args) {
        System.out.println(isSubsequence("b", "abc"));
    }
    public static boolean isSubsequence(String s, String t) {
        if (s == null || t == null){
            return false;
        }
        else if(s.equals("")){
            return true;
        }else if(t.equals("")){
            return false;
        }
        String result = "";
        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            try {
                if (s.charAt(j) == t.charAt(i)){
                    result += t.charAt(i);
                    j++;
                }
            }catch (StringIndexOutOfBoundsException e){
                break;
            }

        }
        return s.equals(result);
    }
}