public class LenOfLastWord {

	    public static int getLastWord(String s) {
	        int len = 0;
	        
	        for(int i = s.length()-1;i>=0;i--)
	        {
	            if(s.charAt(i)==' ')
	            {
	                if(len>0)
	                {
	                    return len;    
	                }
	                continue;
	            }
	            
	            len+=1;
	        }
	        return len;
	    }
	

    public static void main(String[] args) {
        String s = "Virat is king  ";
        int res = getLastWord(s);
        System.out.println(res);
    }
}
