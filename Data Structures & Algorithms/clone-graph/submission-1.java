/*
Definition for a Node.
static class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        HashMap<Node,Node> hmap = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        hmap.put(node,new Node(node.val));
        while(!q.isEmpty()){
            Node cur = q.poll();
            for(Node nei :cur.neighbors ){
                if(hmap.containsKey(nei) == false){
                    hmap.put(nei,new Node(nei.val));
                    q.add(nei);
                }
                hmap.get(cur).neighbors.add(hmap.get(nei));
            }
        }
        return hmap.get(node);
    }
    
}