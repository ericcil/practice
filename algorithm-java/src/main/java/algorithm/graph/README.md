# 图

《算法》 P330
1.无向图 （边仅仅是两个顶点之间的连接
2.有向图  
3.加权图
4.加权有向图

##（一）无向图
概念：
  1. 无向图是由一组顶点和一组能将两个顶点相连的边组成的
  2. 自环 - 一条连接一个顶点和其自身的边
  3. 相邻：两个顶点通过一条边相连
  4. 度数：一个顶点依附的边数
  5. 子图：
  6. 相通：两顶点间存在一条连接双方的路径
  7. 连通图：从任意一个顶点都存在一条路径到达另一个任意顶点的图


```
树：树是一幅无环连通图
含有V个节点的图G满足以下任意一个条件即为一颗树：
	1）G有V-1条边且不含环
	2）G有V-1条边且是连通的
	3）G是连通的，但删除任意一条边都会使它不再连通
	4）G是无环图，但添加任意一条边都会产生一条环
	5）G中的任意一对顶点之间仅存在一条简单路径
```
    

##（二）有向图
概念：

  1. 有向图是由一组顶点和一组有方向的边组成的，每条有方向的边都连接着有序的一对顶点
  2. 出度：由该顶点指出的边的总数
  3. 入度：指向改顶点的边的总数
  4.一条有向边第一个顶点称为它的头，第二个顶点称为它的尾（箭头方向）
  5.有向路径：由一系列顶点组成，对其中的每个顶点都存在有一条有向边从它指向序列中的下一个顶点
  6.有向环：一条至少含有一条边且起点和终点相同的有向路径
  7.简单有向环：一条不含重复顶点和边的环
  
  
  
  