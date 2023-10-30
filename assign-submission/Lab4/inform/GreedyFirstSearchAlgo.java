package lab4.inform.student.inform;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;


public class GreedyFirstSearchAlgo  implements IInformedSearchAlgo {

    @Override
    public Node execute(Node root, String goal) {
        PriorityQueue<Node> frontier = new PriorityQueue<>(new NodeComparatorByHn());
        List<Node> explorer = new ArrayList<Node>();
        frontier.add(root);
        while(!frontier.isEmpty()) {
            Node current = frontier.poll();
            if(current.getLabel().equals(goal)) return current;
            else {
                List<Node> children = current.getChildrenNodes();
                for(Node child : children)  {
                    if(!explorer.contains(child) && ! frontier.contains(child))  {
                        frontier.add(child);
                        child.setParent(current);
                    }
                }

            }
        }
        return null;
    }

    @Override
    public Node execute(Node root, String start, String goal) {
        return null;
    }

    class NodeComparatorByHn implements Comparator<Node> {
        public int compare(Node o1, Node o2) {
            Double h1 = o1.getH();
            Double h2 = o2.getH();
            int result = h1.compareTo(h2);
            if (result == 0)
                return o1.getLabel().compareTo(o2.getLabel());
            else
                return result;

        }





    }
}
