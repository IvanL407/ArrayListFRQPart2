import java.util.ArrayList;

public class Delimiters
{
    /** The open and close delimiters **/
    private String openDel;
    private String closeDel;

    /** Constructs a Delimiters object where open is the open delimiter and close is the
     *  close delimiter.
     *  Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close)
    {
        openDel = open;
        closeDel = close;
    }

    /** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
    public ArrayList<String> getDelimitersList(String[] tokens)
    {
        ArrayList<String> delimiters = new ArrayList<String>();
        for (int i = 0; i < tokens.length; i++)
        {
            if (tokens[i].equals(openDel) || tokens[i].equals(closeDel))
            {
                delimiters.add(tokens[i]);
            }
        }
        return delimiters;
    }

    /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     *  Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters)
    {
        int totalOpen = 0;
        int totalClose = 0;
        for (int i = 0; i < delimiters.size(); i++)
        {
            if (delimiters.get(i).equals(openDel))
            {
                totalOpen += 1;
            }
            if (delimiters.get(i).equals(closeDel))
            {
                totalClose += 1;
            }
            if (totalClose > totalOpen)
            {
                return false;
            }

        }
        return true;
    }
}