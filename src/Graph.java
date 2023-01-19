import java.util.ArrayList;

public class Graph {
    private ArrayList<ArrayList<Integer>> graph;

    public Graph() {
        graph = new ArrayList<>();
    }

    public void setGraph(int size) {
        for(int i=0; i<size; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public ArrayList<ArrayList<Integer>> getGraph() {
        return graph;
    }

    public void addEdge(int from, int to) {
        if(from < 0 || to < 0 || from >= graph.size() || to >= graph.size()) return;
        graph.get(from).add(to);
        graph.get(to).add(from);
    }

    public boolean hasEdge(int from, int to) {
        if(from < 0 || to < 0 || from >= graph.size() || to >= graph.size()) return false;
        else return graph.get(from).contains(to);
    }

    public void removeEdge(int from, int to) {
        if(hasEdge(from, to)) {
            graph.get(from).remove((Integer) to);
            graph.get(to).remove((Integer) from);
        }
    }
}
