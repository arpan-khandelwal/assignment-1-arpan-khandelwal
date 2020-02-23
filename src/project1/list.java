package project1;

public class list<T extends Comparable<T>> {
    private node<T> head;           //It is the beginning of linked list
    private node<T> iter;           //It is used to iterate the list

    public node<T> getHead() {
        return head;
    }        //getter for head

    public void setHead(node<T> node) {
        head = node;
        iter = head;
    }   //setter for head

    public node<T> getIter() {
        return iter;
    }                //Getter for iter

    public void setIter(node<T> iter) {
        this.iter = iter;
    }  //Setter for iter

    //method to insert new node
    public void insert(node<T> node) {
        if (getHead() == null) {
            setHead(node);
        } else {
            node<T> temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
    }

    //method to delete node from beginning
    public node<T> delete() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return null;
        }
        node<T> temp = getHead();
        setHead(getHead().getNext());
        return temp;
    }

    //method to delete node at particular position
    public node<T> delete(int i) {
        node<T> deletedNode;
        node<T> temp = getHead();
        if (isEmpty()) {
            System.out.println("Underflow");
            return temp;
        }
        if (i == 1) {
            deletedNode = getHead();
            setHead(null);
        } else {
            for (int j = 1; j < i - 1; j++) {
                temp = temp.getNext();
            }
            deletedNode = temp.getNext();
            temp.setNext(temp.getNext().getNext());
        }
        return deletedNode;
    }

    //Helper method to check if linked list is empty or not
    public boolean isEmpty() {
        return head == null;
    }

    //Method to fetch object one by one
    public node<T> getObject() {

        node<T> temp;

        if (getIter() == null && getHead() == null) {
            System.out.println("List is empty");
            return null;
        } else if (getIter() == null) {
            setIter(getHead());
            return null;
        }
        temp = getIter();
        setIter(getIter().getNext());
        return temp;
    }

    //Method to sort linked list
    public void sort() {
        node<T> pass1 = getHead();
        node<T> pass2 = getHead().getNext();

        while (pass1 != null) {
            while (pass2 != null) {
                if (pass1.getData().compareTo(pass2.getData()) > 0) {
                    T temp = pass1.getData();
                    pass1.setData(pass2.getData());
                    pass2.setData(temp);
                }
                pass2 = pass2.getNext();
            }
            pass1 = pass1.getNext();
        }
    }
}
