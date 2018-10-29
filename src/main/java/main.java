import keyword.StaticT;
import keyword.Sync;

import java.awt.*;
import java.sql.Array;
import java.util.*;
import java.util.List;

public class main {
    int i=0;
    public static void main(String[] args) {

    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int sss(int i) {return i+1;}
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return null;
        getMax(root, 0, list);
        return list;
    }

    public void getMax(TreeNode treeNode, int i, List<Integer> list) {
        Integer nowMax = list.size() > i ? list.get(i) : null;
        Integer value = treeNode.val;
        if(value != null) {
            if (nowMax == null) {
                list.add(i, value);
            } else if (nowMax < value) {
                list.remove(i);
                list.add(i, value);
            }
        }
        if (treeNode.right != null) getMax(treeNode.right, i+1, list);
        if (treeNode.left != null) getMax(treeNode.left, i+1, list);
    }
    public int countSegments(String s) {
        return Arrays.stream(s.split(" ")).filter(s1 -> !s1.isEmpty()).toArray().length;
    }

    class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
             val = x;
             next = null;
          }
    }

    public boolean exist(char[][] board, String word) {
        int k=0;
        int K = word.length();
        int I = board.length;
        int J = board[0].length;
        for (int i = 0; i < I; i++) {
            for (int j = 0; j < J; j++) {
                if (board[i][j] == word.charAt(k)) {
                    k++;
                }
                if (k == K) return true;
            }
        }
        return false;

    }

    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            int k=nums[i];
            if (map.containsKey(k)) {
                return true;
            } else {
                map.put(k,k);
            }
        }
        return false;
    }


}
