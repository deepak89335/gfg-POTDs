class Solution
{
    static void preorder(Node root, ArrayList<Node> list){
        if (root!=null){
            list.add(root);
            preorder(root.left, list);
            preorder(root.right, list);
        }
        
    }
    public static void flatten(Node root)
    {
        ArrayList<Node> list= new ArrayList<>();
        
        preorder(root, list);
        root=list.get(0);
        for(int i=1; i<list.size(); i++){
            root.right=list.get(i);
            root.left=null;
            root=root.right;
            
        }
    }
}
