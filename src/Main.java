import searchalgorithm.*;
import searchproblem.*;
import undirectedgraph.*;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Graph graph = Romenia.defineGraph();
        //graph.showLinks();
        //graph.showSets();
        List<String> myList = new LinkedList<>();
        myList.add("Dobrogea");
        myList.add("Banat");

        Node n;
        n = graph.searchSolution("Arad", myList, "Bucharest", Algorithms.AStarSearch);
        System.out.println(n.getPathCost());
        graph.showSolution(n);
    }
}
