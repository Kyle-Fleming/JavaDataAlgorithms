public class MyArrayList<E>
{
    private int size;//number of elements in the list
    private E[] data; // use any letter you want.

    public MyArrayList()
    {
        data = (E[])new Object[100]; //cannot create an array of generics
        size=0; // Number of elements in the list
    }

    public void add(int index, E e){
        //ensure the index is the right range
        if(index<0||index>size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        //move the elements to the right after the specified index
        for (int i = size-1; i>=index; i--)
            data[i+1]=data[i];
        //insert new element to data[index]
        data[index] = e;
        //increase size by 1
        size++;
    }

    public boolean contains(Object e)
    {
        for(int i = 0; i<size; i++)
            if(e.equals(data[i])) return true;
        return false;
    }

    public E get(int index)
    {
        if(index<0||index>=size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        return data[index];  
    }

    public E remove(int index){
        if(index<0||index>=size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        E e =  data[index];

        //shift data to left
        for(int j = index; j<size-1; j++)
            data[j] = data[j+1];
        
        data[size-1] = null;// this element is now null

        //decrement size;
        size--;
        return e;
    }

    public String toString()
    {
        String result = "";
        for(int i = 0; i < size; i++){
            result += data[i];
            if(i < size-1) result+=", ";
        }
        return result.toString() + "]";       
    }

    public int size(){
        return size;
    }

    public boolean sortList(){
        E hold;
        for(int i= 0; i<size-1; i++){
            for(int j=0; j<size-1; j++){
                if(((Comparable)data[j]).compareTo(data[j+1])>0)
                {
                    hold = data[j+1];
                    data[j+1] = data[j];
                    data[j] = hold;
                }
                    
            }
        }
        return true;
    }
}