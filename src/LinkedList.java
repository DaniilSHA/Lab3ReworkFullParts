public class LinkedList {
    class Element {
        private int data;
        private Element child;
    }

    private Element element;

    public void removeLast() {
        if (element != null) {
            Element tempElement = element;
            while (tempElement.child.child != null)
                tempElement = tempElement.child;
            tempElement.child = null;
        } else throw new NullPointerException("список пуст");
    }

    public void removeFirst() {
        if (element != null) {
            element = element.child;
        } else throw new NullPointerException("список пуст");
    }

    public int size() {
        if (element != null) {
            Element tempElement = element;
            int counter=0;
            while (tempElement != null) {
                counter++;
                tempElement = tempElement.child;
            }
            return counter;
        } else throw new NullPointerException("список пуст");
    }

    public boolean contains (int value) {
        if (element != null) {
            Element tempElement = element;
            while (tempElement != null) {
                if (tempElement.data==value) return true;
                tempElement = tempElement.child;
            }
            return false;
        } else throw new NullPointerException("список пуст");
    }

    public int getRemoveFromEnd() {
        if (element != null) {
            Element tempElement = element;
            while (tempElement.child.child != null)
                tempElement = tempElement.child;
            int data = tempElement.child.data;
            tempElement.child = null;
            return data;

        } else throw new NullPointerException("список пуст");
    }

    public int getRemoveFromStart() {
        if (element != null) {
            int data = element.data;
            element = element.child;
            return data;
        } else throw new NullPointerException("список пуст");
    }

    public int getLast() {
        if (element != null) {
            Element tempElement = element;
            while (tempElement.child != null)
                tempElement = tempElement.child;
            return tempElement.data;
        } else throw new NullPointerException("список пуст");
    }

    public int getFirst() {
        if (element != null)
            return element.data;
        else throw new NullPointerException("список пуст");
    }

    public void addLast(int value) {
        if (element != null) {
            Element tempElement = element;
            while (tempElement.child != null)
                tempElement = tempElement.child;
            Element newElement = new Element();
            newElement.child = null;
            newElement.data = value;
            tempElement.child = newElement;
        } else {
            element = new Element();
            element.data = value;
        }
    }

    public void addFirst(int value) {
        if (element != null) {
            Element newElement = new Element();
            newElement.child = element;
            element = newElement;
            newElement.data = value;
        } else {
            element = new Element();
            element.data = value;
        }
    }

    public String print() {
        if (element != null) {
            String line = "";
            Element tempElement = element;
            while (tempElement != null) {
                line = line + " " + tempElement.data;
                tempElement = tempElement.child;
            }
            return line;
        } else return "список пуст";
    }


}
