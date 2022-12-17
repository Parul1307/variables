package variables;

public class InstanceVariable
{
    int c=30;//Instance
    public static void main(String[] args)
    {
        InstanceVariable ref=new InstanceVariable();
        System.out.println(ref.c);

    }

}
