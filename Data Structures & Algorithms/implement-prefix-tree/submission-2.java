class PrefixTree {
    class Trie{
        Trie children[];
        boolean isEnd;
        Trie(){
         children = new Trie[26];
         isEnd = false;
        }
    }
    static Trie trie; 
    public PrefixTree() {
        trie = new Trie();
    }

    public void insert(String word) {
        Trie temp = trie;
        for(int i = 0;  i < word.length(); i++){
            char ch = word.charAt(i);
            if(temp.children[ch - 'a'] == null){
               temp.children[ch - 'a'] = new Trie();
            }
            temp = temp.children[ch - 'a'];
        }
        temp.isEnd = true;
    }

    public boolean search(String word) {
        Trie temp = trie;
        for(int i = 0;  i < word.length(); i++){
            char ch = word.charAt(i);
            if(temp.children[ch - 'a'] != null){
               temp = temp.children[ch - 'a'];
            }
        }
        return temp.isEnd;
    }

    public boolean startsWith(String word) {
        Trie temp = trie;
        for(int i = 0;  i < word.length(); i++){
            char ch = word.charAt(i);
             if(temp.children[ch - 'a'] != null){
               temp = temp.children[ch - 'a'];
            }else{
                return false;
            }
        }
        return true;
    }
}
