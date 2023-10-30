package lab2;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirshSearchAlgo implements ISearchAlgo{
    Stack<Node> frontier = new Stack<Node>();

    List<Node> explorer = new ArrayList<Node>();



    @Override
    public Node execute(Node root, String goal) {
        frontier.add(root);
        while (!frontier.isEmpty()) {
            Node current = frontier.pop();
            if (current.getLabel().equals(goal)) return current;
            else {
                List<Edge> children = current.getChildren();
                for (Edge e : children) {
                    if (!frontier.contains(e.getEnd()) && !explorer.contains(e.getEnd())) {
                        frontier.add(e.getEnd());
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
}
