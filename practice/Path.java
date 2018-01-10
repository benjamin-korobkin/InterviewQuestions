// questions on testdome.
package practice;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

public class Path 
{
    private String path;

    public Path(String path) 
    {
        this.path = path;
    }

    public String getPath() 
    {
        return path;
    }

    public void cd(String newPath) 
    {
        if (newPath.equals("/") || newPath.isEmpty()) path = "/";
        else
        {   // put each part of the newPath, excluding slashes, into an arrayDeque.
        	String[] manip = newPath.split("/");
        	List<String> list = Arrays.asList(manip);
        	ArrayDeque<String> newDeque = new ArrayDeque<String>(list);
        	if(newDeque.getFirst().isEmpty()) newDeque.removeFirst(); // remove blank at the front, if exists.
        	System.out.println(newDeque); // In example, prints [.., x]
        	
        	// Same with the original path.
        	manip = path.split("/");
        	list = Arrays.asList(manip);
        	ArrayDeque<String> pathDeque = new ArrayDeque<String>(list);
        	if(pathDeque.getFirst().isEmpty()) pathDeque.removeFirst(); // remove blank at front, if exists.
        	System.out.println(pathDeque); // In example, prints [a, b, c, d]
        	
        	// we can now manipulate both the path and newPath strings.
        	while(!newDeque.isEmpty())
        	{
        		if (newDeque.getFirst().equals(".."))
        		{
        			pathDeque.removeLast();
        		}
        		else
        		{
        			pathDeque.addLast(newDeque.getFirst());
        		}
        		newDeque.removeFirst();
        	}
        	
        	
        	path = "";
        	while (!pathDeque.isEmpty())
        	{
        		path += "/" + pathDeque.removeFirst();
        	}
        }
    }

    public static void main(String[] args) 
    {
        Path path = new Path("/a/b/c/d");
        path.cd("../x");
        System.out.println(path.getPath()); // should return '/a/b/c/x'
    }
}
