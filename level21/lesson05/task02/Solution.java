package com.javarush.test.level21.lesson05.task02;

import java.util.HashSet;
import java.util.Set;

/* Исправить ошибку
Сравнение объектов Solution не работает должным образом. Найти ошибку и исправить.
Метод main не участвует в тестировании.
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        if (!(o instanceof Solution)) {
            return false;
        }
        if (o == this) return true;

        Solution n = (Solution) o;
        if (n.first == null ? this.first != null : !this.first.equals(n.first)) return false;
        return n.last == null ? this.last == null : n.last.equals(this.last);
    }

    @Override
    public int hashCode (){
    int res = this.first == null ? 0 : this.first.hashCode();
        res = 31 * res + (this.last == null ? 0 : last.hashCode());
        return res;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Mickey", "Mouse"));
        System.out.println(s.contains(new Solution("Mickey", "Mouse")));
    }
}
