import java.util.*;
public class Problem
{   
    static String remVowel(String str)
    {
         return str.replaceAll("[aeiouAEIOU]", "");
    }
     
    // Driver Code
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
        int i,l=0;
        char ch=0,ch1=0;
        String st=" ",st1=" ";
        st=in.next();
        l=in.nextInt();
        for(i=0;i<l;i++){
            ch=st.charAt(i);
            ch1=st.charAt(i+1);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            if(ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U'||ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'){
            st1=st1+ch;
            }
            else{
                st1=remVowel(st);
            }
        }
    }
System.out.println(st1);
}
}
