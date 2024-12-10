/*This Program uses Command line arguments as input */
class ComLineTest
{
    public static void main(String args[])
    {
        int count,i=0;
        String string;
        count=args.length;

        System.out.println("Number of Arguents="+count);
        while(i<count)
        {
            string= args[i];
            i=i+1;
            System.out.println(i+":"+"java is"+string+"!");
        }
    }
}
/* OutPut
 
1:java isSimple!
2:java isRobust!
3:java isDistributed!
4:java isSecure!




 */

