package java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PeopleIndexes {
    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        List<Set<Integer>> list = new ArrayList<>();
        for (List<String> l1 : favoriteCompanies) {
            Set<Integer> t = new HashSet<>();
            for (String s : l1) {
                t.add(s.hashCode());
            }
            list.add(t);
        }
        int n = favoriteCompanies.size();
        boolean[] subset = new boolean[n];
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (subset[i])
                continue;
            for (int j = i + 1; j < n; j++) {
                Set<Integer> l1 = list.get(i);
                Set<Integer> l2 = list.get(j);
                if (l1.size() <= l2.size() && isSubset(l1, l2)) {
                    subset[i] = true;
                    if (l1.size() == l2.size())
                        subset[j] = true;
                    break;
                } else if (l2.size() < l1.size() && isSubset(l2, l1)) {
                    subset[j] = true;
                    break;
                }
            }

        }
        for (int i = 0; i < n; i++) {
            if (!subset[i])
                res.add(i);
        }
        return res;

    }

    public boolean isSubset(Set<Integer> a, Set<Integer> b) {
        for (int a1 : a) {
            if (!b.contains(a1))
                return false;
        }
        return true;
    }

}