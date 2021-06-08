import java.util.LinkedList;

class Q71 {
    public String simplifyPath(String path) {
        LinkedList<String> stack = new LinkedList<>();

        for(String s:path.split("/")) {
            if(s.equals("")) continue;
            //System.out.println(s);
            if(s.equals("..")) {                
                if(!stack.isEmpty()) {
                  stack.removeLast();  
                } 
            } 
            else if(s.equals(".")) continue;
            else stack.addLast(s);
        }
        if(stack.isEmpty()) return "/";
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()) ans.append("/").append(stack.removeFirst());
        return ans.toString();
    }
   public static void main(String[] args){
    Q71 obj = new Q71();
    String path = "/home/";
    System.out.println(obj.simplifyPath(path));
 }
}