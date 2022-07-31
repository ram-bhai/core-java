interface inter{
    void wish();
}
class TestMain{
    public static void main(String args[])
    {
        inter obj = new inter(){
            public void wish(){
                System.out.println("Good morning");
            }
        };
        obj.wish();
    }
    
}