  class Node{
    int rollNo;
    int age;
    String name;
    double grade;
    Node next;
    Node(int age,int rollNo,String name,double grade){
        this.rollNo=rollNo;
        this.age=age;
        this.name=name;
        this.grade=grade;
        this.next=null;
        
    }
    
}
class Main{
    Node head;
   public void addAtBeginning(int age, int rollNo, String name, double grade) {
    Node node = new Node(age, rollNo, name, grade);
    node.next = head;
    head = node;
}

   public void addAtEnd(int age, int rollNo, String name, double grade) {
    Node node = new Node(age, rollNo, name, grade);

    if (head == null) {
        head = node;
        return;
    }

    Node temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }
    temp.next = node;
}

    public void addAtPosition(int position, int age, int rollNo, String name, double grade) {

    if (position == 1) {
        addAtBeginning(age, rollNo, name, grade);
        return;
    }

    Node node = new Node(age, rollNo, name, grade);
    Node temp = head;

    for (int i = 1; i < position - 1 && temp != null; i++) {
        temp = temp.next;
    }

    if (temp == null) {
        System.out.println("Invalid position");
        return;
    }

    node.next = temp.next;
    temp.next = node;
}

   public void delete(int rollNumber) {

    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    if (head.rollNo == rollNumber) {
        head = head.next;
        System.out.println("Student deleted");
        return;
    }

    Node temp = head;
    while (temp.next != null && temp.next.rollNo != rollNumber) {
        temp = temp.next;
    }

    if (temp.next == null) {
        System.out.println("Student not found");
    } else {
        temp.next = temp.next.next;
        System.out.println("Student deleted");
    }
}

    public void search(int rollNumber) {
    Node temp = head;

    while (temp != null) {
        if (temp.rollNo == rollNumber) {
            System.out.println("Found: " + temp.rollNo + " " + temp.name);
            return;
        }
        temp = temp.next;
    }

    System.out.println("Student not found");
}
public void display() {
    Node temp = head;

    if (temp == null) {
        System.out.println("List is empty");
        return;
    }

    while (temp != null) {
        System.out.println(
            temp.rollNo + " | " +
            temp.name + " | " +
            temp.age + " | " +
            temp.grade
        );
        temp = temp.next;
    }
}

  
    public void updateGrade(int rollNumber, double newGrade) {
    Node temp = head;

    while (temp != null) {
        if (temp.rollNo == rollNumber) {
            temp.grade = newGrade;
            System.out.println("Grade updated");
            return;
        }
        temp = temp.next;
    }

    System.out.println("Student not found");
}

    public static void main(String args[]){
                Main s=new Main();

        Node n1=new Node(12,276282,"Mahima Mishra",78.9);
        s.addAtPosition(1,12,276282,"Mahima Mishra",78.9);

        Node n2=new Node(22,276282,"Malay Mishra",79.9);
                s.addAtPosition(2,22,276282,"Malay Mishra",79.92);

        Node n3=new Node(42,276282,"Garima Mishra",90.9);
                s.addAtPosition(1,12,276282,"Garima Mishra",78.9);

        s.display();
        s.delete(276282);
                s.display();
                

        
        
        
    }
}