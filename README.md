# leetCode
记录leetcode答题

## Array
|  #  |      Title     |   Solutions   |  笔记                 
|-----|----------------|---------------|-------------
|p535|长url转短url|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p535.java)|使用HashMap储存长url，当数据量大时使用Mysql自增字段储存
|p561|数组拆分|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p561.java)|Array
|p771|找宝石|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p771.java)|Array
|p807|城市天际线|[Solution](https://github.com/szuming/leetCode/blob/master/src/Array/p807.java)|Array


## String
|  #  |      Title     |   Solutions   |  笔记                 
|-----|----------------|---------------|-------------
|p657|判断是否返回原地|[Solution](https://github.com/szuming/leetCode/blob/master/src/String/p657.java)|统计字符个数，然后比较，使用switch更为高效


## sort
|  #  |      Title     |   Solutions   |  笔记                 
|-----|----------------|---------------|-------------
|p349|求交集|[Solution](https://github.com/szuming/leetCode/blob/master/src/sort/p349.java)|使用hashset保存不可重复值，遍历求得交集

## Backtracking
|  #  |      Title     |   Solutions   |  笔记                 
|-----|----------------|---------------|-------------
|p39|组合总和|[Solution](https://github.com/szuming/leetCode/blob/master/src/Backtracking/p39.java)|使用回溯法求解，当sum>target时剪枝，对于每个元素遍历自身与整个数组
|p52|n皇后问题|[Solution](https://github.com/szuming/leetCode/blob/master/src/Backtracking/p52.java)|当前点不符合则返回上一层的遍历状态
|p78|求幂集|[Solution](https://github.com/szuming/leetCode/blob/master/src/Backtracking/p78.java)|回溯法
|p413|求等差数列个数|[Solution](https://github.com/szuming/leetCode/blob/master/src/Backtracking/p413.java)|与全部遍历不同，要求的是连续的序列是否组成等差数组，因此只要遇到错误解就要立刻返回



## DynamicProgramming
|  #  |      Title     |   Solutions   |  笔记                 
|-----|----------------|---------------|-------------
|p64|最小路径和|[Solution](https://github.com/szuming/leetCode/blob/master/src/DynamicProgramming/p64.java)|使用二维数组记录相同的遍历结果




## tree
|  #  |      Title     |   Solutions   |  笔记                 
|-----|----------------|---------------|-------------
|p106|从中序与后序遍历序列构造二叉树|[Solution](https://github.com/szuming/leetCode/blob/master/src/tree/p106.java)|后序遍历的倒序是每棵子树的根节点,不断递归构造左子树与右子树
|p654|最大二叉树|[Solution](https://github.com/szuming/leetCode/blob/master/src/tree/p654.java)|不断递归构造左子树与右子树




## HashTable
|  #  |      Title     |   Solutions   |  笔记                 
|-----|----------------|---------------|-------------
|p811|域名访问次数|[Solution](https://github.com/szuming/leetCode/blob/master/src/HashTable/p811.java)|使用keyset遍历HashMap，spilt,charAt,subString