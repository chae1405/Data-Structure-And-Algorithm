public class NodeMgmt {
    Node head = null;
    public class Node
    {
        Node left;
        Node right;
        int value;

        public Node(int data){
            this.value = data;
            this.left = null;
            this.right = null;

        }

    }

    public boolean insertNode(int data) // 노드 입력하는 함수 정수로만 입력바는다.
    {
        //노드가 하나도 없을때
        if(this.head == null)
        {
            this.head = new Node(data); // 새노드 생성
        }else
        //노드가 하나 이상일때
        {
            Node findNode = this.head;
 // 현재 노드의 왼쪽에 노드가 들어가야 할때
            while(true)
            {
                if(data < findNode.value) //(헤드노드가) 데이터 보다 클때
                {
                    if(findNode.left!=null) // 왼쪽노드가 널이 아니면
                    {
                        findNode = findNode.left; // 왼쪽에 넣고
                    }else
                    {
                        findNode.left = new Node(data); //아니면 새롭게 노드를 만들어주고
                        break;

                    }

                
                }
                //현재 노드의 오른쪽에 들어가야할때
                else
                
                {
                    if(findNode.right != null){
                        findNode = findNode.right;
                    }else
                    {
                        findNode.right = new Node(data);
                        break;
                    }
                }
            }
        }
        return true;
    }

    public Node Search(int data)
    {
        if(this.head == null)
        {
            return null;
        }
        else
        {
            Node findNode = this.head;
            while (findNode != null){
                if(findNode.value == data)
                {
                    return findNode;
                }else if(data < findNode.value)
                {
                    findNode = findNode.left;
                }else
                {
                    findNode = findNode.right;
                }
            }
            return null;


        }

    }





    public static void main(String[] args) {
        NodeMgmt myTree = new NodeMgmt();
        myTree.insertNode(2);
        myTree.insertNode(3);
        myTree.insertNode(4);
        myTree.insertNode(5);

    }
}
