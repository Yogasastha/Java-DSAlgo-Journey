
class Solution
{
    Queue<Integer>q;
    Solution(){
        q=new LinkedList<>();
    }
    public void addElement(int key)
    {
        //Add your code here.
        q.add(key);
    }
    public void RemoveElement()
    {
        //Add your code here.
        if(!q.isEmpty())
            System.out.print(q.poll()+" ");
        else
            System.out.print(-1+" ");
    }
    public void peekElement()
    {
        //Add your code here.
        if(q.isEmpty())
            System.out.print(-1+" ");
        else
            System.out.print(q.peek()+" ");
    }
    public void Size()
    {
        //Add your code here.
        System.out.print(q.size()+" ");
        
    }
}