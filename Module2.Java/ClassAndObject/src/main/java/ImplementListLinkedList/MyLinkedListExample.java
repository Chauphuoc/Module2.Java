package ImplementListLinkedList;

public class MyLinkedListExample {
    NodeExample head;
    int numberNode;
    public static void printing (NodeExample head){
        if (head == null){
            System.out.println("List is Empty");
        }
        else {
            NodeExample temp = head;
            while (temp!=null){
                System.out.print(temp.value);
                temp=temp.next;
                if (temp!=null){
                    System.out.print("->");
                }
                else System.out.println();
            }
        }
    }
    public static NodeExample addHead (NodeExample head, int value){
        NodeExample newNode = new NodeExample(value);
        if (head==null){
            return newNode;
        }
        else {
            newNode.next=head;
        }
        return newNode;
    }
    public static NodeExample addtoTail(NodeExample head, int value){

        NodeExample newNode = new NodeExample(value);
        NodeExample lastNode = head;
        if (head==null){
            return newNode;
        }
        while (lastNode.next!=null){
            lastNode=lastNode.next;
        }
        lastNode.next=newNode;
        return head;
    }
    public static NodeExample addtoIndex (NodeExample head, int value, int index){
        if (index==0){
            addHead(head,value);
        }
        else {
            NodeExample newNode = new NodeExample(value);
            NodeExample currentNode = head;
            int count=0;
            while (currentNode!=null){
                count++;
                if (count==index){
                    newNode.next=currentNode.next;
                    currentNode.next=newNode;
                }
                currentNode=currentNode.next;
            }
        }
        return head;
    }
    public static NodeExample removeHead (NodeExample head){
        if (head!=null){
            head=head.next;
        }
        return head;
    }
    public static NodeExample removeTail (NodeExample head){
        if (head==null){
            return null;
        }
        NodeExample lastNode = head;
        NodeExample previousNode = null;
        while (lastNode.next!=null){
            previousNode=lastNode;
            lastNode=lastNode.next;
        }
        if (previousNode==null){
            return null;
        }
        else {
            previousNode.next=null;
        }
        return head;
    }
    public static NodeExample removeIndex (NodeExample head, int index){
        NodeExample previousNode = null;
        NodeExample currentNode = head;
        int count = 0;
        boolean isFound=false;
        while (currentNode!=null){
            if (index==count){
                isFound=true;
                break;
            }
            previousNode=currentNode;
            currentNode=currentNode.next;
            count++;
        }
        if (isFound){
            previousNode.next=currentNode.next;
        }
        return head;
    }
    public static void main(String[] args) {
        NodeExample n1 = new NodeExample(1);
        NodeExample n2 = new NodeExample(4);
        NodeExample n3 = new NodeExample(5);
        n1.next = n2;
        n2.next = n3;
        printing(n1);
        printing(addHead(n1,19));
        printing(addtoTail(n1,18));
        printing(addtoTail(n1,9));
        printing(addtoIndex(n1,17,2));
        printing(removeHead(n1));
        printing(removeTail(n1));
//        printing(addtoIndex(n1,41,2));
        printing(removeIndex(n1,2));
//        printing(removeMiddle(n1,2));
//        printing(removeMiddle(n1,2));
//        printing(removeMiddle(n1,1));
    }

}
