import searchalgorithm.*;
import searchproblem.*;
import undirectedgraph.*;

public class Main {

    public static void main(String[] args) {
        Graph graph = Romenia.defineGraph();
        graph.showLinks();
        graph.showSets();
        Node n;
        n = graph.searchSolution("Timisoara", "Neamt", Algorithms.AStarSearch);
        graph.showSolution(n);
    }
}
