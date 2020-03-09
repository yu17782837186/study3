package com.ning;

public class TestMyTree {
    public static void main(String[] args) {
        Node node4 = new Node(7,null,null);
        Node node5 = new Node(8,null,null);
        Node node6 = new Node(6,null,null);
        Node node7 = new Node(9,null,null);
        Node node3 = new Node(5,node6,node7);
        Node node2 = new Node(4,node4,node5);
        Node node1 = new Node(2,node2,node3);
        MyTree myTree = new MyTree(node1);
        System.out.println(node1);
        System.out.println( myTree.isEmpty());
        System.out.println(myTree.size());
        System.out.println(myTree.getHight());
        System.out.println(myTree.findKey(4,node1));
        myTree.pre();
        myTree.ord();
        myTree.in();
        myTree.preStack();
        myTree.ordStack();
        myTree.inStack();
        myTree.queue();

//        String str = "abc";
//        System.out.println(str.hashCode());
//        str = str+"de";
//        System.out.println(str.hashCode());
//        String str1 = "abc";
//        String str2 = "abc";
//        System.out.println(str1 == str2);
//        String str1 = "abc";
//        String str2 = "de";
//        String str = str1+str2;
//        String str3 = "abcde";
//        System.out.println(str == str3);
    }

}
