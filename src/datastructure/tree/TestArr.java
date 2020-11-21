package datastructure.tree;



public class TestArr {
    public static void main(String[] args) {
        BinarryTree tree = new BinarryTree();
        HeroNode root = new HeroNode(1,"宋江");
        HeroNode node1 = new HeroNode(2,"吴用");
        HeroNode node2 = new HeroNode(3,"卢俊义");
        HeroNode node3 = new HeroNode(4,"林冲");
        HeroNode node4 = new HeroNode(5,"鲁智深");
        HeroNode node5 = new HeroNode(6,"武松");
        HeroNode node6 = new HeroNode(7,"关胜");
        root.setLeftNode(node1);
        root.setRightNode(node2);
        node1.setLeftNode(node3);
        node1.setRightNode(node4);
        node4.setLeftNode(node5);
        node4.setRightNode(node6);
        tree.setRoot(root);
//        System.out.println("前序遍历");
//        tree.preOrder();
//        System.out.println("中序遍历");
//        tree.infixOrder();
//        System.out.println("后序遍历");
//        tree.postOrder();

        HeroNode node = tree.preOrderSearch(4);
        if (node != null){
            System.out.println("找到了：" + node.getNo() + node.getName());
        }else {
            System.out.println("未找到");
        }
        System.out.println("前序遍历");
        tree.preOrder();
        System.out.println("删除结点");
        tree.delNode(4);
        System.out.println("再次前序遍历");
        tree.preOrder();



    }
    static class BinarryTree{
        private HeroNode root;

        public void setRoot(HeroNode root) {
            this.root = root;
        }

        public void preOrder(){
            if (this.root != null){
                this.root.preOrder();
            } else {
                System.out.println("二叉树为空，无法遍历");
            }
        }

        public void infixOrder(){
            if (this.root != null){
                this.root.infixOrder();
            }else {
                System.out.println("二叉树为空，无法遍历");
            }
        }

        public void postOrder(){
            if (this.root != null){
                this.root.postOrder();
            }else{
                System.out.println("二叉树为空，无法遍历");
            }
        }

        public HeroNode preOrderSearch(int no) {
            if (root != null){
                return this.root.preNodeSearch(no);
            }else {
                return null;
            }
        }

        public HeroNode infixOrderSearch(int no) {
            if (root != null){
                return this.root.infixOrderSearch(no);
            }else {
                return null;
            }
        }

        public HeroNode postOrderSearch(int no) {
            if (root != null){
                return this.root.postOrderSearch(no);
            }else {
                return null;
            }
        }

        public void delNode(int no){
            if (root  != null){
                if (root.getNo() == no){
                    root = null;
                } else{
                    root.delNode(no);
                }
            }else{
                System.out.println("二叉树为空,无法删除");
            }
        }
    }

    static class HeroNode{
        private  int no;
        private String name;
        private HeroNode leftNode;
        private HeroNode rightNode;

        public HeroNode(int no, String name) {
            this.no = no;
            this.name = name;
        }

        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public HeroNode getLeftNode() {
            return leftNode;
        }

        public void setLeftNode(HeroNode leftNode) {
            this.leftNode = leftNode;
        }

        public HeroNode getRightNode() {
            return rightNode;
        }

        public void setRightNode(HeroNode rightNode) {
            this.rightNode = rightNode;
        }

        @Override
        public String toString() {
            return "HeroNode{" +
                    "no=" + no +
                    ", name='" + name + '\'' +
                    '}';
        }


        //前序遍历
        public void preOrder(){
            System.out.println(this);
            if (this.leftNode != null){
                this.leftNode.preOrder();
            }
            if (this.rightNode != null){
                this.rightNode.preOrder();
            }
        }

        //中序遍历
        public void infixOrder(){
            if (this.leftNode != null){
                this.leftNode.infixOrder();
            }
            System.out.println(this);
            if (this.rightNode != null){
                this.rightNode.infixOrder();
            }
        }

        //删除结点
        public void delNode(int no){
            if (this.leftNode != null && this.leftNode.no == no){
                if (this.leftNode.leftNode != null){
                    HeroNode node = this.leftNode.rightNode;
                    this.leftNode = this.leftNode.leftNode;
                    this.leftNode.setRightNode(node);
                }
                else if (this.leftNode.rightNode != null){
                    this.leftNode = this.leftNode.rightNode;
                }else{
                    this.leftNode = null;
                }
                return;
            }
            if (this.rightNode != null && this.rightNode.no == no){
                if (this.rightNode.leftNode != null){
                    HeroNode node = this.rightNode.rightNode;
                    this.rightNode = this.rightNode.leftNode;
                    this.rightNode.setRightNode(node);

                }
                else if(this.rightNode.rightNode != null){
                    this.rightNode = this.rightNode.rightNode;

                }else{
                    this.rightNode = null;
                }
                return;
            }
            if (this.leftNode != null){
                this.leftNode.delNode(no);
            }
            if (this.rightNode != null){
                this.rightNode.delNode(no);
            }
        }

        //后序遍历
        public void postOrder(){
            if (this.leftNode != null){
                this.leftNode.postOrder();
            }
            if (this.rightNode != null){
                this.rightNode.postOrder();
            }
            System.out.println(this);
        }

        /**
         *前序遍历
         * @param no 查找no
         * @return 如果存在，返回节点；不存在返回NULL
         */
        public HeroNode preNodeSearch(int no){
            HeroNode resNode = null;
            if (this.no == no){
                return this;
            }
            if (this.leftNode != null){
                resNode =this.leftNode.preNodeSearch(no);
            }
            if (resNode != null){
                return resNode;
            }
            if (this.rightNode != null){
                resNode = this.rightNode.preNodeSearch(no);
            }
            return resNode;

        }

        /**
         * 中序遍历
         * @param no
         * @return
         */
        public HeroNode infixOrderSearch(int no){
            HeroNode resNode = null;

            if (this.leftNode != null){
                resNode = this.leftNode.infixOrderSearch(no);
            }
            if (resNode != null){
                return resNode;
            }
            if (this.no == no){
                return this;
            }
            if (this.rightNode != null){
                resNode = this.rightNode.infixOrderSearch(no);
            }
            return resNode;
        }

        public HeroNode postOrderSearch(int no){
            HeroNode resNode = null;
            if (this.leftNode != null){
                resNode = this.leftNode.postOrderSearch(no);
            }
            if (resNode != null){
                return resNode;
            }
            if (this.rightNode != null){
                resNode = this.rightNode.preNodeSearch(no);
            }
            if (resNode != null){
                return resNode;
            }
            if (this.no == no){
                return this;
            }
            return resNode;

        }

    }


}
