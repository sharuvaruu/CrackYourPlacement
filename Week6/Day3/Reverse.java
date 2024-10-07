class Reverse {
    // Complete the function
    // str: input string
    public static String reverseString(String s) {
        // Reverse the string str
        int n=s.length();
        char[] chararr=s.toCharArray();
        for(int i=0;i<n/2;i++){
            char temp=chararr[i];
           chararr[i]=chararr[n-i-1];
            chararr[n-i-1]=temp;
        }
        return new String(chararr);
    }
}