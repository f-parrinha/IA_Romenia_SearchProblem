package undirectedgraph;

public class Romenia {

    public static Graph defineGraph() {

        Graph g = new Graph();
        // Define cities:
        g.addVertex("Oradea", 46.933305039644246, 22.00364121026039);
        g.addVertex("Zerind", 46.69492258025169, 21.660374230308534);
        g.addVertex("Bucharest", 44.54266544079781, 26.013593040237424);
        g.addVertex("Urziceni", 44.79154219511032, 26.57511362564087);
        g.addVertex("Arad", 46.18116722758293, 21.432906174106595);
        g.addVertex("Mehadia", 44.80258468733788, 22.36942447282791);
        g.addVertex("Neamt", 46.95328158008576, 26.45602829134941);
        g.addVertex("Iasi", 47.08539279551506, 27.520568465652467);
        g.addVertex("R. Vilcea", 45.000411748342515, 24.36088464934349);
        g.addVertex("Eforie", 44.05326971165657, 28.518977858409883);
        g.addVertex("Pitesti", 44.74941061494827, 24.995083803110123);
        g.addVertex("Timisoara", 45.61024719750404, 21.06546010582924);
        g.addVertex("Craiova", 44.4048298465538, 23.929461142663953);
        g.addVertex("Hirsova", 44.78340632615089, 28.05627982512474);
        g.addVertex("Vaslui", 46.592360330762865, 27.588578213596346);
        g.addVertex("Giurgiu", 43.80230293699264, 25.897221733026505);
        g.addVertex("Sibiu", 45.745538029031756, 24.066529630737303);
        g.addVertex("Dobreta", 44.566178543252946, 22.576908446054457);
        g.addVertex("Fagaras", 45.8850598141098, 24.943684392547606);
        g.addVertex("Lugoj", 45.76373143695831, 21.86103131576538);
        // Define routes:
        g.addEdge("Bucharest","Giurgiu");
        g.addEdge("R. Vilcea","Sibiu");
        g.addEdge("Iasi","Vaslui");
        g.addEdge("Iasi","Neamt");
        g.addEdge("Lugoj","Mehadia");
        g.addEdge("Arad","Timisoara");
        g.addEdge("Arad","Sibiu");
        g.addEdge("Bucharest","Fagaras");
        g.addEdge("Eforie","Hirsova");
        g.addEdge("Fagaras","Sibiu");
        g.addEdge("Bucharest","Urziceni");
        g.addEdge("Craiova","Pitesti");
        g.addEdge("Dobreta","Mehadia");
        g.addEdge("Hirsova","Urziceni");
        g.addEdge("Arad","Zerind");
        g.addEdge("Craiova","R. Vilcea");
        g.addEdge("Craiova","Dobreta");
        g.addEdge("Urziceni","Vaslui");
        g.addEdge("Lugoj","Timisoara");
        g.addEdge("Bucharest","Pitesti");
        g.addEdge("Pitesti","R. Vilcea");
        g.addEdge("Oradea","Zerind");
        g.addEdge("Oradea","Sibiu");
        // Define regions:
        g.addVertexSet("Banat");
        g.addVertexToSet("Banat","Mehadia");
        g.addVertexToSet("Banat","Timisoara");
        g.addVertexToSet("Banat","Lugoj");
        g.addVertexSet("Crisana");
        g.addVertexToSet("Crisana","Oradea");
        g.addVertexToSet("Crisana","Zerind");
        g.addVertexToSet("Crisana","Arad");
        g.addVertexSet("Dobrogea");
        g.addVertexToSet("Dobrogea","Eforie");
        g.addVertexToSet("Dobrogea","Hirsova");
        g.addVertexSet("Moldova");
        g.addVertexToSet("Moldova","Neamt");
        g.addVertexToSet("Moldova","Iasi");
        g.addVertexToSet("Moldova","Vaslui");
        g.addVertexSet("Muntenia");
        g.addVertexToSet("Muntenia","Bucharest");
        g.addVertexToSet("Muntenia","Urziceni");
        g.addVertexToSet("Muntenia","Pitesti");
        g.addVertexToSet("Muntenia","Giurgiu");
        g.addVertexSet("Oltenia");
        g.addVertexToSet("Oltenia","R. Vilcea");
        g.addVertexToSet("Oltenia","Craiova");
        g.addVertexToSet("Oltenia","Dobreta");
        g.addVertexSet("Transilvania");
        g.addVertexToSet("Transilvania","Sibiu");
        g.addVertexToSet("Transilvania","Fagaras");

        return g;
    }

}
