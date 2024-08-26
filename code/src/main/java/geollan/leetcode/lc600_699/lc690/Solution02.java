package geollan.leetcode.lc600_699.lc690;

import java.util.HashMap;
import java.util.List;

/**
 * @Description
 * @Date: 2024/8/26 9:44
 * @Author: Geollan
 **/
public class Solution02 {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer, Employee> employeeMap = new HashMap<>();

        for(Employee employee: employees) {
            employeeMap.put(employee.id, employee);
        }

        return dfs(employeeMap, id);
    }

    public int dfs(HashMap<Integer, Employee> employeeMap, int id) {
        Employee employee = employeeMap.get(id);
        int ans = employee.importance;

        for(Integer sub: employee.subordinates) {
            ans += dfs(employeeMap, sub);
        }

        return ans;
    }
}
