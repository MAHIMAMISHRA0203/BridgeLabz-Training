class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int i=g.length-1,j=s.length-1;
                Arrays.sort(g);
        Arrays.sort(s);

        while(i>=0 && j>=0){
            if(s[j]>=g[i]){
                j--;}
                i--;
            

        }
    return s.length-j-1;}
}