package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AllInOneTraverse {

    public static final int STATE_NONE = 0;//尚未处理任何一个节点
    public static final int STATE_LEFT_DONE = 1;//处理完左节点
    public static final int STATE_LEFT_RIGHT_DONE = 2;//左右节点都已经处理完

    /**
     * @param node 根节点，不为null
     * @param when           指明处理节点的时机，分别对应：
     *                       STATE_NONE                  前序遍历
     *                       STATE_LEFT_DONE             中序遍历
     *                       STATE_LEFT_RIGHT_DONE       后序遍历
     * @return 对应的序列化结果
     */
    public static List<Node> traverse(Node node, int when) {
        Stack<Node> stackNode = new Stack<>();//保存节点的栈
        Stack<Integer> stackState = new Stack<>();//保存节点状态的栈

        stackNode.push(node);  //初始时加入根节点
        stackState.push(STATE_NONE);//标记根节点为尚未处理任何子节点的状态

        /*    算法说明：
         *    初始时放入根节点，将其标记为左右节点尚未处理的状态
         *    每个循环，从栈中取出一个节点和其状态，根据其当前状态转移到下一个状态（很显然，你可以从状态转换机的角度解读这个算法）。
         *    状态转换规则：  STATE_NONE-->STATE_LEFT_DONE-->STATE_LEFT_RIGHT_DONE-->弹出栈
         *    伴随状态的变化，还需要相应的操作，如将左右子节点放入栈中，或者将当前节点弹出栈；
         *    最重要的一点是，当当前节点的状态符合处理状态的要求时，就会将节点加入序列化集合。
         */
        //序列化结果
        List<Node> res = new ArrayList<>();
        while (!stackNode.isEmpty()) {
            Node n = stackNode.peek();
            Integer state = stackState.peek();

            if (state == when)//当前状态可处理节点
                res.add(n);

            //3种状态之间的转换
            if (state == STATE_NONE) {
                stackState.set(stackState.size() - 1, STATE_LEFT_DONE);
                if (n.left != null) {
                    stackNode.push(n.left);
                    stackState.push(STATE_NONE);
                }
            } else if (state == STATE_LEFT_DONE) {
                stackState.set(stackState.size() - 1, STATE_LEFT_RIGHT_DONE);
                if (n.right != null) {
                    stackNode.push(n.right);
                    stackState.push(STATE_NONE);
                }
            } else if (state == STATE_LEFT_RIGHT_DONE) {
                stackNode.pop();
                stackState.pop();
            }
        }
        return res;
    }
}
