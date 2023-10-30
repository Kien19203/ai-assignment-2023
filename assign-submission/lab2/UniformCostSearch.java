package lab2;

/*
 */

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class UniformCostSearch implements  ISearchAlgo {

    @Override
    public Node execute(Node root, String start, String goal) {

        Queue<Node> frontier = new PriorityQueue<Node>();
        List<Node> explorer = new ArrayList<Node>();
        frontier.add(root);


        while (!frontier.isEmpty()) {
            Node current = frontier.poll();
            if (current.getLabel().equals(goal)) return current;
            List<Edge> children = current.getChildren();
            for (Edge child : children) {
                Node end = child.getEnd();
            if(!frontier.contains(end)&& !explorer.contains(end)) {
                frontier.add(end);
                end.setPathCost(current.getPathCost()+child.getWeight());
            }
            else if(end.getPathCost()>current.getPathCost()+child.getWeight()) {
                end.setPathCost(child.getWeight());
                end.setParent(current);
            }
            }


        }
        return null;
    }
    @Override
    public Node execute(Node root, String goal) {
        return null;
    }
/*
Tree search :
Current             |  Frontier
A                   |   F: 6, G: 8, E: 9, D: 14
F                   | G: 8, E: 9, D: 14, G: 7 => cập nhật lại G: 7 vào G: 8.



 */
}
