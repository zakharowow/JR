package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {

    public Solution(){}
    public Solution(String s){}
    public Solution(int i){}

    private Solution(int i, int x){}
    private Solution(String s, int i){}
    private Solution(int x, String s){}

    protected Solution(int i, int x, String s){}
    protected Solution(int i, String s, int x){}
    protected Solution(String s, int i, int x){}

    Solution(int i, int x, int r){}
    Solution(int i, String x, String r){}
    Solution(String x, String r){}
}

