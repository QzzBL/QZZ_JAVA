package com.qzz.dao;

/**
 * @ClassName Maze
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/11 10:27
 * @Title 愿上苍有好生之德
 **/
public class Maze {
    private int row;//横坐标
    private int col;//纵坐标
    private MazeNode[][] mazeNodes;

    public Maze(int row,int col) {
        this.row = row;
        this.col = col;
        mazeNodes = new MazeNode[row][col];
    }

    public void setMazeNode(int x,int y,int value) {
        mazeNodes[x][y] = new MazeNode(x,y,value);
    }

    //现在二维数组里面，已经存放了迷宫的路径，开始记录每个节点
    // 四周的可走状态
    public void judgePath() {

    }

    //开始走迷宫，如果可以走
    //把最后路径放到栈当中
    public void goMaze() {

    }


    public void showPath() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mazeNodes[i][j].getValue()+ " ");
            }
            System.out.println();
        }
    }

}

