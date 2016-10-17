package javaapplication2;

import java.util.Scanner;

 class linkedlistnode {

    linkedlistnode next;
    linkedlistnode prev;
    int data;

    linkedlistnode(int new_data) {
        this.data = new_data;
        this.next = null;
        this.prev = null;

    }

    void set_prev(linkedlistnode other) {
        this.prev = other;
        if (other != null) {
            other.next = this;
        }
    }

    void set_next(linkedlistnode other) {
        this.next = other;
        if (other != null) {
            other.prev = this;
        }
    }
 }
     class linkedlist {

        linkedlistnode head;
        linkedlistnode tail;

        linkedlist() {
            this.head = null;
            this.head = null;
        }

        void print() {
            linkedlistnode current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println(" ");
        }

        void push(linkedlistnode new_node) {
            if (head == null) {
                head = new_node;
                tail = new_node;
            } else {
                tail.next = new_node;
                new_node.prev = tail;
                tail = new_node;
            }
        }

        linkedlistnode qpop() {
            if (head == null) {
                System.out.println("linked list kosong");
                return null;
            } else if (head == tail) {
                linkedlistnode node = head;
                head = null;
                tail = null;
                return node;
            } else {
                linkedlistnode node = head;
                head = head.next;
                head.prev = null;
                node.next = null;
                return node;
            }

        }

        linkedlistnode spop() {
            if (head == tail) {
                linkedlistnode node = tail;
                tail = null;
                head = null;
                return node;
            } else if (tail == null) {
                System.out.println("linked list kosong");
                return null;
            } else {
                linkedlistnode node = tail;
                tail = tail.prev;
                tail.next = null;
                node.prev = null;
                return node;
            }
        }
    }



public class JavaApplication2 {

    public static void main(String[] args) {
        linkedlist node = new linkedlist();
        Scanner input = new Scanner (System.in);
        boolean exit = true;
        int b,pilih;
        do {
            System.out.println("menu");
            System.out.println("1.masukan data stack ");
            System.out.println("2.masukan data queue");
            System.out.println("3.lihat data");
            System.out.println("4.exit");
            System.out.print("masukan pilihan anda :");
            pilih = input.nextInt();
            switch (pilih){
                case 1: 
                    System.out.print("masukan data  stack :");
                    b = input.nextInt();
                    node.push(new linkedlistnode(b));
                    break;
                case 2:
                    System.out.print("masukan data  stack :");
                    b = input.nextInt();
                    node.push(new linkedlistnode(b));
                    break;
                    
                case 3:
                    System.out.println("data stack :");
                    node.spop();
                    node.print();
                    System.out.println("data queue :");
                    node.qpop();
                    node.print();
                    break;
                case 4:
                    exit = false;
                    break;
            }
            System.out.println("");
        }while(exit);
        
        
        
        
        
        
        
        
        
        
        
        /*node.print();
        System.out.println(node.qpop());
        System.out.println(node.spop());
        node.push(new linkedlistnode(5));
        node.push(new linkedlistnode(4));
        node.print();
        System.out.println(node.spop().data);
        node.push(new linkedlistnode(4));
        System.out.println(node.qpop().data);
        node.print();*/
    
    }

}
