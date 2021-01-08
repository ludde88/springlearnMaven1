package com.lijingtao.springlean;

public class Likedlist<T> {

    private class Node{
       private T iterm;
       private Node next;
       public Node(){
           iterm = null;
           next = null;
       }
       public Node(T t,Node nextNode){
           iterm = t;
           next = nextNode;
       }
    }
    public Node top = new Node();

    public void  push(T pusht){
        top = new Node(pusht,top);
    }

    public T pop(){
        top.iterm = top.next.iterm;
        top.next = top.next.next;

        T resultt = top.iterm;
        if(top.next!=null){
            top = top.next;
        }
        return resultt;
    }

    public static void main(String[] args) {
        Likedlist likedlist = new Likedlist<String>();
        for (String s: "li jing tao".split(" ")) {
            likedlist.push(s);
        }

        while (likedlist.top.iterm!=null){
            System.out.println(likedlist.pop());
        }

    }
}
