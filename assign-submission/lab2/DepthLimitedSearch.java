package lab2;
/* int limit
same regular
while(!frontier.isEmpty) {

Node current = frontier.poll()
if(current.getLable().equals(goal)) return current;
else {
    explorer.add(current)
    if(current.getDepth < limit) {
    List<Node> children = current.getChildren();


    for(Node child : children) {
    if(!frontier.contains(child) && !explorer.contains(child)
    child.setDepth(current.getDepth + 1);
    frontier.add(child);
    child.setParent(current);


    }

}


}
return null;





 */

public class DepthLimitedSearch implements ISearchAlgo{

    @Override
    public Node execute(Node root, String goal) {
        return null;
    }

    @Override
    public Node execute(Node root, String start, String goal) {
        return null;
    }
}
