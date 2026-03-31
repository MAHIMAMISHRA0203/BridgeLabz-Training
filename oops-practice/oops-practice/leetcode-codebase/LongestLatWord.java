class LongestLatWord {
    public int lengthOfLastWord(String str) {
        int len=0;
        String s=str.trim();
        for(int i=s.length()-1;i>=0;i-- ){
            if(s.charAt(i)!=' '){
                len++;
            }
            else return len;
        }
        return  len;
    }
}
