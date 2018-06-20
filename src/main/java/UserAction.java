import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 舒露
 */
public class UserAction extends ActionSupport {
   private String userName;
   private String pwd;

   public void setUserName(String userName){
       this.userName=userName;
   }
   public void setPwd(String pwd){
       this.pwd=pwd;
   }
   public String he(){
       System.out.println(userName);
       System.out.println(pwd);
       return "shu";
   }
}
