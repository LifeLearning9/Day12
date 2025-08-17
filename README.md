# Day12 Best Time to Buy and Sell Stock III:  You are allowed to complete at most two transactions. Find the maximum profit.

**Intuition**
1.You can make at most two transactions.
2. Split the problem into two parts:
3.Compute maximum profit you can make up to day i (left → right).
4. Compute maximum profit you can make from day i to the end (right → left).
5. Then, combine the two profits at every split point.

**Algorithm Flow**
1.First pass (left to right):
2.Track the minimum price so far and compute profit if sold today.
3.Store max profit until day i in an array leftProfits.
4.Second pass (right to left):
5.Track the maximum price so far and compute profit if bought today.
6.Store max profit from day i till end in an array rightProfits.
7.Final step:
    For every day i, compute leftProfits[i] + rightProfits[i].
    The maximum among them is the answer.

**Time & Space Complexity**

Time Complexity: O(n) 

Space Complexity: O(n) 
