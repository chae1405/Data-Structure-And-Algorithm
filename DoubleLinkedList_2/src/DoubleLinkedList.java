public class DoubleLinkedList <T>{
    public Node<T> head = null; // 앞에서 부터 찾을수 있는 기능
    public Node<T> tail = null; // 뒤에서부터 찾을수 있는거

    public class Node<T>{
        T data; //데이터 클래스
        Node<T> prev =null;// 이전 포인터
        Node<T> next = null; //다음으로 가는 포인터

        public Node(T data){
            this.data=data;
        }

    }
    public void addNode(T data) // 데이터를 추가하는 메서드
    {
        if(this.head == null) //헤드가 널이면
        {
            this.head = new Node<T>(data);//헤드노드를 생성
            this.tail = this.head; //테일도 헤드를 가리키는거
        }else
        {
            Node<T>node = this.head;
            while (node.next != null)// 노드의 넥스트가 널이라는거는 끝이ㅏㄴ
            {
                node = node.next;
            }
            node.next = new Node<T>(data);//새로은 다음 노드 생성
            node.next.prev = node; //
            this.tail = node.next;
        }
    }

        public T Shead(T isdata)
    {
        if(this.head == null){
            return null;
        }else
        {
            Node<T> node = this.head;
            while(node != null)
            {
                if(node.data == isdata) {
                    return node.data;
                }else
                {
                    node = node.next;
                }
            }
            return null;
        }
    }

    public T TSearch(T isData)
    {
        if(this.head == null)
        {
            return null;
        }else
        {
            Node<T> node =this.tail;
            while (node!=null)
            {
                if(node.data == isData)
                {
                    return node.data;
                }else
                {
                    node=node.prev;
                }
            }
            return null;
        }
    }

    public void printAll()
    {
        if(this.head!=null)
        {
            Node<T>node = this.head;
            System.out.println(node.data);
            while(node.next != null)
            {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public boolean insertTofront(T existedData ,T addData)//
    {

        if(this.head == null)
        {
            this.head= new Node<T>(addData);
            this.tail = this.head;

        }else if(this.head.data == existedData)
        {
            Node<T> newHead = new Node<T>(addData);
            newHead.next = this.head;
            this.head = newHead;
            return  true;
        }else
        {
            Node<T> node = this.head;
            while (node != null)
            {
                if(node.data == existedData){
                    Node<T> nodePrev = node.prev;

                    nodePrev.next = new Node<T>(addData);
                    nodePrev.next.next = node;

                    nodePrev.next.prev = nodePrev;
                    node.prev = nodePrev.next;

                }else
                {
                    node = node.next;
                }
            }

        }
        return false;

    }

    public static void main(String[] args) {
        DoubleLinkedList<Integer> MyLinkedList = new DoubleLinkedList<Integer>();
        MyLinkedList.addNode(1);
        MyLinkedList.addNode(2);
        MyLinkedList.addNode(3);
        MyLinkedList.addNode(5);
        MyLinkedList.addNode(8);

        MyLinkedList.printAll();

        System.out.println(MyLinkedList.Shead(1));


    }
}
