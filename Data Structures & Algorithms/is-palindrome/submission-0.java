class Solution {
    public boolean isPalindrome(String s) {
        String st = s.replaceAll("\\s","");
        System.out.println(st);
        String str = st.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);
        str = str.toLowerCase();
        int i = 0,j = str.length() - 1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
