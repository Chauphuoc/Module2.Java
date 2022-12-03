package ImplementListLinkedList;

import org.w3c.dom.Node;

public class ImplementLinkedListSJames {
    NodeJames head;
    int numNodes;

    public ImplementLinkedListSJames(int numNodes) {
        this.numNodes = numNodes;
    }
    public void printing (){
       NodeJames temp = head;
       if (head==null){
           System.out.println("List is empty");
       }
       else {
           while (temp!=null){
               System.out.println(temp.value);
               temp=temp.next;
           }
       }
    }


    public void add ( int index, Object data){
        NodeJames newNode = new NodeJames(data);
        NodeJames currentNode = head;
        int count = 0;
        if (index==0){
            addFirst(data);
        }
        while (currentNode!=null){
            count++;
            if (count==index){
               newNode.next=currentNode.next;
               currentNode.next=newNode;
            }
            currentNode=currentNode.next;
        }
    }
    public void addFirst(Object value){
        NodeJames temp = head;
        head = new NodeJames(value);
        head.next=temp;
    }

//    public NodeJames get(NodeJames head,int index){
//        NodeJames temp = head;
//        int count = 0;
//        while (temp!=null){
//            if (count==index){
//                temp.next=null;
//                return temp;
//            }
//            temp=temp.next;
//            count++;
//        }
//        return head;
//    }
    public NodeJames get(int index){
        NodeJames temp = head;
        int count = 0;
        while (temp!=null){
            if (count==index){
                break;
            }
            temp=temp.next;
            count++;
        }
        return temp;
    }
    public static void main(String[] args) {
        ImplementLinkedListSJames test = new ImplementLinkedListSJames(5);

       test.addFirst("Hello" );
       test.addFirst("My age is:");
       test.addFirst(20);
       test.add(0,18);
        test.printing();
        System.out.println(test.get(1).value);
    }
}
