package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
Given the root of an n-ary tree, return the postorder traversal of its nodes' values.

Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)

Example 1:
         1
       / | \
      3  2  4
     / \
    5   6

Input: root = [1,null,3,2,4,null,5,6]
Output: [5,6,3,2,4,1]
 */
public class N_aryTreePostorderTraversal {
    public static List<Integer> postorder(Node root) {
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        nodeQueue.forEach(note->{
            System.out.println(note.val);
        });
        return null;
    }

    public static void main(String[] args) {
        Node child5 = new Node(5);
        Node child6 = new Node(6);
        Node child3 = new Node(3, List.of(child5, child6));
        Node child2 = new Node(2);
        Node child4 = new Node(4);
        Node root = new Node(1, List.of(child3, child2, child4));

        postorder(root);
    }

}


// Definition for a Node.
