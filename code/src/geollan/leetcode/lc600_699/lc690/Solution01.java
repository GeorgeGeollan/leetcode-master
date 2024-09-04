package geollan.leetcode.lc600_699.lc690;

import java.util.HashMap;
import java.util.List;

/**
 * @Description 哈希表+DFS 时间复杂度O(N) 空间复杂度O(N)
 * @Date: 2024/8/26 9:09
 * @Author: Geollan
 **/
public class Solution01 {
    int ans = 0;
    HashMap<Integer, Employee> map;

    public int getImportance(List<Employee> employees, int id) {
        Employee start = new Employee();
        map = new HashMap<>();

        for(int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
            if(employees.get(i).id == id) start = employees.get(i);

            map.put(employees.get(i).id, employees.get(i));
        }

        System.out.println(map);
        // 通过dfs遍历员工及其下属员工，计算importance值
        dfs(start);

        return ans;
    }

    public void dfs(Employee employee) {
        // 若没有下属，直接返回

        if(employee == null || employee.subordinates == null) return;
        ans += employee.importance;

        List<Integer> subs = employee.subordinates;


        for(int sub: subs) {
            dfs(map.get(sub));
        }
    }
}
