package leetcode.walmart;

import java.util.ArrayList;
import java.util.List;

public class BTreeRightSideView {

	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
		      }
		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result= new ArrayList<>();
        rightView(root,result,0);
        return result;
        
    }

    public void rightView(TreeNode current, List<Integer> result, int currentDepth){
        if(current == null){
            return ;
        }
        if(currentDepth == result.size()){
            result.add(current.val);
        }
        rightView(current.right, result, currentDepth + 1);
        rightView(current.left, result, currentDepth + 1);
        
    }

}
