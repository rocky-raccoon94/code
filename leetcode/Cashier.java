package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Cashier {
    private int cnt;
    private final int n;
    private final int discount;
    Map<Integer, Integer> map;

    public Cashier(int n, int discount, int[] products, int[] prices) {
        map = new HashMap<>();
        this.cnt = 0;
        this.n = n;
        this.discount = discount;
        for (int i = 0; i < products.length; i++) {
            map.put(products[i], prices[i]);
        }

    }

    public double getBill(int[] product, int[] amount) {
        double res = 0;
        for (int i = 0; i < product.length; i++) {
            res += map.get(product[i]) * amount[i];
        }
        return ++cnt % n == 0 ? res * (100 - discount) / 100 : res;

    }
}