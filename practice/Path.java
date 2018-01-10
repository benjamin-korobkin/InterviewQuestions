// questions on testdome.

package practice;

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
        if (newPath.isEmpty()) path = "/";
        else
        {
        	
        }
        
        
    }

    public static void main(String[] args) 
    {
        Path path = new Path("/a/b/c/d");
        path.cd("../x");
        System.out.println(path.getPath()); // should return '/a/b/c/x'
    }
}
