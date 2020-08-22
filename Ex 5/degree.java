public class degreeprgm {
    public static void main(String[] args) {
        degree obj = new degree();
        obj.getdegree();
        UnderGraduate obj1 = new UnderGraduate();
        obj1.getdegree();
        postGraduate obj2 = new postGraduate();
        obj2.getdegree();
    }
}
class degree
{
    public void getdegree()
    {
        System.out.println("I got a degree");
    }
}
class UnderGraduate extends degree
{
    public void getdegree()
    {

        System.out.println("Iam a undergraduate");
    }
}
class postGraduate extends degree
{
    public void getdegree()
    {
        System.out.println("Iam a postgraduate");
    }
}
