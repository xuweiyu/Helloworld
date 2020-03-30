package test;

public class MyPrint {
    /**
     * 分析：
     * 1
     * 1 1 1
     * 1 1 1 1 1
     * 1 1 1 1 1 1 1
     * 分析第n层有2n+1个1
     * 第n层有max-n个空格
     */
    public static void printTri(int layerNum) {
        if (layerNum < 1) {
            throw new IllegalArgumentException("layerNum must > 0");
        } else {
            for (int i = 0; i < layerNum; i++) {
                //打印空格
                for (int j = 0; j < layerNum - i; j++) {
                    System.out.print(" ");
                }
                //打印1
                for (int k = 0; k < 2 * i + 1; k++) {
                    //最后一个1要折行
                    if (k == 2 * i) {
                        System.out.println("1");
                    } else {
                        System.out.print("1");
                    }
                }
            }
        }
    }

    /**
     * 分析：
     * 1
     * 1 1
     * 1  1  1
     * 1  1  1  1
     * 分析第n层有n+1个1
     * 每个1后面跟一个空格
     * 每行前面有layerNum-n个空格
     */
    public static void printTri1(int layerNum) {
        if (layerNum < 1) {
            throw new IllegalArgumentException("layerNum must > 0");
        } else {
            for (int i = 0; i < layerNum; i++) {
                //打印空格
                for (int j = 0; j < layerNum - i; j++) {
                    System.out.print(" ");
                }
                //打印1和空格
                for (int k = 0; k < i + 1; k++) {
                    //最后一个要折行
                    if (k == i) {
                        System.out.println("1 ");
                    } else {
                        System.out.print("1 ");
                    }
                }
            }
        }
    }

    /**
     * 打印一行
     * @param emptyNum 空格的个数
     * @param sum      空格后面的个数
     */
    public static void printOneLine(int emptyNum, int sum) {
        for (int i = 0; i < emptyNum; i++) {
            System.out.print("0");
        }
        for (int i = 0; i < sum; i++) {
            //第一个和最后一个打印*其余的打印空格，空格后面的第一个和最后一个是*，其余的是空格
            if (i == 0 || i == sum - 1) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
        //为了换行
        System.out.println("");
    }

    /**
     * 打印菱形
     * @param layerNum 菱形的层数
     *
     * 奇数层时的样子
     *                  *
     *                *   *
     *              *       *
     *                *   *
     *                  *
     * 偶数层时的样子
     *                  *
     *                *   *
     *              *       *
     *              *       *
     *                *   *
     *                  *
     *
     *
     *
     */
    public static void printDiamond(int layerNum) {
        if (layerNum % 2 == 0) {
            //偶数的时候每行有
            for (int i = 0; i < layerNum; i++) {
                int mid = layerNum / 2;
                if (i < mid) {
                    //通过分析几行来找数学规律
                    int oneLineNum = 2 * i + 1;
                    int oneLineEmpty = mid - i-1;
                    printOneLine(oneLineEmpty, oneLineNum);
                } else {
                    int oneLineNum = 2 * (layerNum - i) - 1;
                    int oneLineEmpty = i - mid;
                    printOneLine(oneLineEmpty, oneLineNum);
                }
            }
        } else {
            //奇数的时候
            for (int i = 0; i < layerNum; i++) {
                int mid = layerNum / 2 + 1;
                if (i < mid) {
                    int oneLineNum = 2 * i + 1;
                    int oneLineEmpty = mid - i-1;
                    printOneLine(oneLineEmpty, oneLineNum);
                } else {
                    int oneLineNum = 2 * (layerNum - i) - 1;
                    int oneLineEmpty = i - mid + 1;
                    printOneLine(oneLineEmpty, oneLineNum);
                }
            }
        }
    }
}
