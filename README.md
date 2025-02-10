# Number-of-Islands
Given a 2D grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
Explanation:
Iterate through the grid:
For every cell, if a cell with '1' (land) is encountered, increment the island count and start a DFS from that cell.

DFS Traversal:
The DFS function recursively marks all connected land cells (horizontally and vertically) as visited by changing them to '0'.

Count Islands:
Each DFS call ensures one entire island is marked, so the count of DFS initiations equals the number of islands...
