public class Sortirovka {
    private int[] g;

    public void Sort(int[] g){
        for (int u = 1; u < g.length; u++){
            for (int b = g.length - 1; b >= u; b--){
                if (g[b - 1] > g[b]){
                    int t = g[b - 1];
                    g[b - 1] = g[b];
                    g[b] = t;
                }
            }
        }
        for (int u = 0; u < g.length; u++){
            System.out.println(g[u]);
        }
    }
}
