import java.util.*;

class Hamilton {

    static int V;

    static boolean isSafe(int v, int[][] graph, int[] path, int pos) {

        // Previous vertex se edge honi chahiye
        if (graph[path[pos - 1]][v] == 0)
            return false;

        // Vertex pehle path me nahi hona chahiye
        for (int i = 0; i < pos; i++) {
            if (path[i] == v)
                return false;
        }

        return true;
    }

    static boolean hamiltonianCycleUtil(int[][] graph, int[] path, int pos) {

        // Saare vertices path me aa gaye
        if (pos == V) {

            // Last vertex se first vertex tak edge honi chahiye
            return graph[path[pos - 1]][path[0]] == 1;
        }

        for (int v = 1; v < V; v++) {

            if (isSafe(v, graph, path, pos)) {

                path[pos] = v;

                if (hamiltonianCycleUtil(graph, path, pos + 1))
                    return true;

                path[pos] = -1; // backtrack
            }
        }

        return false;
    }

    static void hamiltonianCycle(int[][] graph) {

        V = graph.length;

        int[] path = new int[V];
        Arrays.fill(path, -1);

        path[0] = 0; // start from vertex 0

        if (!hamiltonianCycleUtil(graph, path, 1)) {
            System.out.println("No Hamiltonian Cycle exists");
            return;
        }

        System.out.println("Hamiltonian Cycle:");

        for (int i = 0; i < V; i++) {
            System.out.print(path[i] + " -> ");
        }

        System.out.println(path[0]); // cycle complete
    }

    public static void main(String[] args) {

        int[][] graph = {
                { 0, 1, 1, 0 },
                { 1, 0, 1, 1 },
                { 1, 1, 0, 1 },
                { 0, 1, 1, 0 }
        };

        hamiltonianCycle(graph);
    }
}