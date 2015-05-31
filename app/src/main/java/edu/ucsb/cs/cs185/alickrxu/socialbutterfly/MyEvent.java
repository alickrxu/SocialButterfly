package main.java.edu.ucsb.cs.cs185.alickrxu.socialbutterfly;


/**
 * Created by shivani on 5/30/15.
 */
public class MyEvent
{
    char title;
    char location;
    int date;
    int time;
    char description;

    //true if event is private, false if event is public
    boolean is_private;



    public MyEvent(char t, char l, int d, int tim, char des, boolean is)
    {
        title = t;
        location = l;
        date = d;
        time = tim;
        description = des;
        is_private = is;

    }

    public MyEvent()
    {
        title = ' ';
        location = ' ';
        date = 00000000;
        time = 000000;
        description = ' ';


        is_private= true;

    }

    char getTitle()
    {
        return title;
    }

    char getLocation()
    {
        return location;
    }

    int getDate()
    {
        return date;
    }

    int getTime()
    {
        return time;
    }

    char getDescription()
    {
        return description;

    }

    boolean checkPrivacy()
    {
        return is_private;
    }

    void setTitle(char t)
    {
        title = t;
    }

    void setLocation(char l)
    {
        location = l;
    }

    void setDate(int d)
    {
        date = d;
    }

    void setTime(int t)
    {
        time = t;
    }

    void setDescription(char d)
    {
     description = d;
    }

    void setPrivacy(boolean p)
    {
        is_private = p;
    }
}
