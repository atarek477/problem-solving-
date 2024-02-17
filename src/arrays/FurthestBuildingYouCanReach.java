package arrays;

import java.util.PriorityQueue;
import java.util.Queue;

public class FurthestBuildingYouCanReach {

    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        int count = 0;
        for (int i = 0; i < heights.length - 1; i++) {
            int diff = heights[i + 1] - heights[i];
            if (diff <= 0) {
                count++;
                continue;
            }
            if (ladders > 0) {
                p.add(diff);
                count++;
                ladders--;
                continue;
            }
            p.add(diff);
            if (bricks > 0) {
                bricks -= p.remove();
                if (bricks < 0)
                    break;
                count++;
                continue;
            }
            break;
        }
        return count;
    }
}
