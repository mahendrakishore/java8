public class ChangeUL {

    public static void main(String[] args) {
        String s = "this is UPPER lower test";
        char[] ca = s.toCharArray();
        StringBuilder sbuild = new StringBuilder();
        for(char c : ca){
            if(c>='A' & c<='Z'){
                sbuild.append((char)(c+32));
            }
            else if(c>='a' & c<='z') {
                 sbuild.append((char)(c-32));
            }
            else{
                sbuild.append(c);
            }
        }
        System.out.println(sbuild);

    }
}