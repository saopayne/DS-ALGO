import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JourneyToTheMoon {

    static int journeyToMoon(int n, int[][] astronaut) {
        int [][]graph = new int[n][n];
        List<Integer> visited = new ArrayList<Integer>();
        long combinations = 0;
        List<Long> pairs = new ArrayList<Long>();
        for(int i = 0; i < astronaut.length; i++){
            int first = astronaut[i][0];
            int second = astronaut[i][1];
            // Add edge 1->2 and also 2->1
            graph[first][second] = 1;
            graph[second][first] = 1;
        }

        for (int i = 0; i < graph.length; i++){
            if (!(visited.contains(i))){
                Stack<Integer> stack = new Stack<Integer>();
                stack.push(i);
                int count = 1;
                while (!stack.isEmpty()) {
                    int top = stack.pop();
                    if (!visited.contains(top)) {
                        for (int j = 0; j < graph.length; j++) {
                            if (graph[top][j] == 1 && !(visited.contains(j))) {
                                stack.push(j);
                                count++;
                            }
                        }
                        visited.add(top);
                    }
                }
                pairs.add(Long.valueOf(count));
            }
        }

        for (int i = 0; i < pairs.size()-1; i++) {
            for (int j = i+1; j < pairs.size(); j++) {
                combinations = combinations + (pairs.get(i) * pairs.get(j));
            }
        }

        return (int) combinations;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] np = scanner.nextLine().split(" ");

        int n = Integer.parseInt(np[0]);

        int p = Integer.parseInt(np[1]);

        int[][] astronaut = new int[p][2];

        for (int i = 0; i < p; i++) {
            String[] astronautRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int astronautItem = Integer.parseInt(astronautRowItems[j]);
                astronaut[i][j] = astronautItem;
            }
        }

        int result = journeyToMoon(n, astronaut);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}