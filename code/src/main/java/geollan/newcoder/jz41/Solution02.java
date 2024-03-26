package geollan.newcoder.jz41;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Description 迭代/优先队列
 * @Date: 2024/3/3 12:56
 * @Author: Geollan
 **/
public class Solution02 {
    Queue<Integer> A = new PriorityQueue<>();
    Queue<Integer> B = new PriorityQueue<>((a, b) -> (b - a));

    // 时间复杂度O(1) 空间复杂度O(N)
    public void Insert(Integer num) {
        if (A.size() != B.size()) {
            A.add(num);
            B.add(A.poll());
        }

        else {
            B.add(num);
            A.add(B.poll());
        }
    }

    public Double GetMedian() {
        return A.size() != B.size() ? Double.valueOf(A.peek()) : Double.valueOf(A.peek() + B.peek()) / 2;
    }

}
