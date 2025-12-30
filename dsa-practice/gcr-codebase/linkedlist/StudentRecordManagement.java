class StudentNode{
    int rollNo;
    String name;
    int age;
    char grade;
    StudentNode next;

    StudentNode(int rollNo,String name,int age,char grade){
        this.rollNo=rollNo;
        this.name=name;
        this.age=age;
        this.grade=grade;
    }
}

class StudentLinkedList{
    private StudentNode head;

    //Add at beginning
    public void addAtBeginning(int rollNo,String name ,int age,char grade){
        StudentNode newNode=new StudentNode(rollNo,name,age,grade);
        newNode.next=head;
        head=newNode;
    }

    //Add at end
    public void addAtEnd(int rollNo,String name,int age,char grade){
        StudentNode newNode=new StudentNode(rollNo,name,age,grade);
        if(head==null){
            head=newNode;
            return;
        }
        StudentNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    //Add at specific position (1-based index)
    public void addAtPosition(int position,int rollNo,String name,int age,char grade){
        if(position<=1){
            addAtBeginning(rollNo, name, age, grade);
            return; 
        }

        StudentNode newNode=new StudentNode(rollNo,name,age,grade);
        StudentNode temp=head;
        for(int i=1;i<position-1;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Invalid Position Please enter a valid postion ");
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    //Delete by roll number
    public void deleteByRollNo(int rollNo){
        if(head==null){
            return;
        }
        if(head.rollNo==rollNo){
            head=head.next;
            System.out.println("Student Deleted Successfully");
            return;
        }
        StudentNode temp=head;
        while(temp.next!=null && temp.next.rollNo!=rollNo){
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("Student not found");
        }else{
            temp.next=temp.next.next;
            System.out.println("Student deleted successfully");
        }
    }

    //Search by roll number
    public void searchByRollNo(int rollNo){
        StudentNode temp=head;
        while(temp!=null){
            if(temp.rollNo==rollNo){
                System.out.println("Found: " + temp.rollNo + ", " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
                return;
            }
            temp=temp.next;
        }
        System.out.println("Student not found");
    }

    //Update grade
    public void updateGrade(int rollNo,char newGrade){
        StudentNode temp=head;
        while(temp!=null){
            if(temp.rollNo==rollNo){
                temp.grade=newGrade;
                System.out.println("Grade Updated");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Student not found");
    }

    //Display all student
    public void display(){
        if(head==null){
            System.out.println("No Student Records.");
            return;
        }
        StudentNode temp=head;
        while(temp!=null){
            System.out.println("Roll No: " + temp.rollNo +", Name: " + temp.name +", Age: " + temp.age +", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

}

public class StudentRecordManagement {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning(101, "Aman", 20, 'A');
        list.addAtEnd(102, "Riya", 21, 'B');
        list.addAtPosition(2, 103, "Rahul", 22, 'A');

        System.out.println("\nAll Students:");
        list.display();

        System.out.println("\nSearching Roll No 102:");
        list.searchByRollNo(102);

        System.out.println("\nUpdating Grade for Roll No 103:");
        list.updateGrade(103, 'A');

        System.out.println("\nDeleting Roll No 101:");
        list.deleteByRollNo(101);

        System.out.println("\nFinal Student List:");
        list.display();
    }
    
}
