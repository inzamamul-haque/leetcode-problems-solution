import java.util.*;

public class SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] paths = path.split("/");
        Set<String> skip = new HashSet<>(Arrays.asList("..", ".", ""));
        for (String str : paths) {
            if (!stack.empty() && str.equals("..")) stack.pop();
            else if (!skip.contains(str)) stack.push(str);
        }
        List<String> list = new ArrayList(stack);
        return "/" + String.join("/", list);
    }

    public static void main(String[] args) {
        SimplifyPath simplifyPath = new SimplifyPath();
        simplifyPath.simplifyPath("/home/foo/");
    }
}
