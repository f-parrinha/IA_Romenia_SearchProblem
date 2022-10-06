import searchalgorithm.*;
import searchproblem.*;
import undirectedgraph.*;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Graph graph = Romenia.defineGraph();
        graph.showLinks();
        graph.showSets();
        List<String> myList = new LinkedList<>();

        myList.add("Oltenia");
        myList.add("Transilvania");
        myList.add("Muntenia");

        Node n;
        n = graph.searchSolution("Craiova", "Iasi", Algorithms.AStarSearch);

        graph.showSolution(n);
    }
}
